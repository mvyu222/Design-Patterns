package memento;

import java.util.Stack;

public class TextEditor {
    private TextDocument document;
    private Stack<DocumentMemento> history;

    public TextEditor() {
        this.document = new TextDocument();
        this.history = new Stack<>();
    }

    public void appendText(String text) {
        history.push(document.save());
        document.appendText(text);
    }

    public void revertLastChange() {
        if (!history.isEmpty()) {
            document.restore(history.pop());
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void printDocument() {
        System.out.println("Current document content: " + document.getText());
    }
}