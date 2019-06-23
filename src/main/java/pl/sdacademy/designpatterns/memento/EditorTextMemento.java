package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EditorTextMemento(final EditorText editorText) {
       // tu kopiujemy wszystkie pola z oryginalnego obiektu do obiektu memento
        //oryginalny obiekt ->memento
        // this.index = editorText.getIndex(); -> to jak by było więcej pól

        this.value = editorText.getValue();
    }
}
