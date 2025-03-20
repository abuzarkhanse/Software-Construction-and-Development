package scd.lab08.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/printer")
public class PrinterController {
    @Autowired
    private PrinterService service;

    @PostMapping("/print")
    public String print(@RequestBody String message) {
        service.print(message);
        return "Message sent to printer.";
    }
}
