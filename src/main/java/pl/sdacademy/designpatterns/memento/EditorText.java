package pl.sdacademy.designpatterns.memento;

public class EditorText {
    private String value= "";

    // provate intex;

    public String getValue() {
        return value;
    }

    public void addText(final String toAdd){
        value+=toAdd;
    }

    public void restoreFromMemento(final EditorTextMemento editorTextMemento){
        // tutaj kopikuemy  z memento oryginalny obiekt
        //
        this.value=editorTextMemento.getValue();
    }
}
