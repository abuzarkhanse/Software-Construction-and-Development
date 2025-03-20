package scd.Lab10.proxy;

public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String content;
    private boolean isAdmin;

    public DocumentProxy(String content, boolean isAdmin) {
        this.content = content;
        this.isAdmin = isAdmin;
    }

    @Override
    public String display() {
        if (isAdmin) {
            if (realDocument == null) {
                realDocument = new RealDocument(content);
            }
            return realDocument.display();
        } else {
            return "Access Denied: You are not an admin.";
        }
    }
}
