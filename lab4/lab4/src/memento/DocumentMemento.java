package memento;

class DocumentMemento {
    private final String state;

    public DocumentMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}