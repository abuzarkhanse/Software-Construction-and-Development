package scd.lab09.controller;

import scd.lab09.entity.Course;
import scd.lab09.entity.Professor;
import scd.lab09.repository.CourseRepository;
import scd.lab09.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CourseRepository courseRepository;

    // ✅ Create a Professor with Courses
    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        if (professor.getCourses() == null || professor.getCourses().isEmpty()) {
            throw new RuntimeException("A professor must have at least one course.");
        }

        // Ensure each course has a reference to the professor
        for (Course course : professor.getCourses()) {
            course.setProfessor(professor);
        }

        return professorRepository.save(professor);
    }

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Professor getProfessorById(@PathVariable Long id) {
        return professorRepository.findById(id).orElseThrow(() -> new RuntimeException("Professor not found"));
    }

    @GetMapping("/{id}/courses")
    public List<Course> getCoursesByProfessor(@PathVariable Long id) {
        Optional<Professor> professor = professorRepository.findById(id);
        if (professor.isPresent()) {
            return professor.get().getCourses();
        } else {
            throw new RuntimeException("Professor not found");
        }
    }
}
