package scd.Lab10.proxy;

public class RealDocument implements Document {
    private String content;

    public RealDocument(String content) {
        this.content = content;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading document content...");
    }

    @Override
    public String display() {
        return "Displaying Document: " + content;
    }
}
