public class TextEditor {
    public TextEditor openTextEditor() {
        return new TextEditor();
    }
    public void writeIntoTextEditor(String enterText) {
        System.out.println(enterText);
    }
    public void closeTextEditor() {
        System.out.println("Text Editor Closed");
    }
}
