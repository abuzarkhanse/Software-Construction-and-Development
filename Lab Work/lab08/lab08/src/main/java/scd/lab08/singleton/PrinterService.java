package scd.lab08.singleton;

import org.springframework.stereotype.Service;

@Service
public class PrinterService {
    private final Printer printer = Printer.getInstance();

    public void print(String message) {
        printer.printMessage(message);
    }
}
