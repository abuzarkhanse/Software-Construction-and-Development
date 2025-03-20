package scd.lab08.singleton;

public class Printer {
    private static Printer instance;

    private Printer() {}

    public static Printer getInstance() {
        if (instance == null) {
            synchronized (Printer.class) {
                if (instance == null) {
                    instance = new Printer();
                }
            }
        }
        return instance;
    }

    public void printMessage(String message) {
        System.out.println("Printing: " + message);
    }
}
