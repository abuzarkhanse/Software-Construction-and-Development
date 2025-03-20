package scd.lab08.prototype;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private double salary;

    @Override
    public EmployeeEntity clone() {
        return new EmployeeEntity(null, this.name, this.department, this.salary);
    }
}
