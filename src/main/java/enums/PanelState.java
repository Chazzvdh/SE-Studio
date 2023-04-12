package main.java.enums;

public enum PanelState {
    HOME("Home"),
    SOUNDS(""),
    UPLOAD("file_upload");

    public final String fileName;
    public final String title;

    private PanelState(String fileName) {
        this(fileName, fileName);
    }

    private PanelState(String fileName, String title) {
        this.fileName = fileName;
        this.title = title;
    }
}
