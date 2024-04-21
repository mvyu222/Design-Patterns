package memento;

class TextDocument {
    private StringBuilder content;

    public TextDocument() {
        this.content = new StringBuilder();
    }

    public void appendText(String text) {
        this.content.append(text);
    }

    public String getText() {
        return this.content.toString();
    }

    public void setText(String text) {
        this.content = new StringBuilder(text);
    }

    public DocumentMemento save() {
        return new DocumentMemento(this.content.toString());
    }

    public void restore(DocumentMemento memento) {
        this.content = new StringBuilder(memento.getState());
    }
}