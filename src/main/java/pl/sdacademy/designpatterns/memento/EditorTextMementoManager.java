package pl.sdacademy.designpatterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextMementoManager {

    private Deque<EditorTextMemento> editorTextMementos = new ArrayDeque<>();

    public void save(final EditorTextMemento editorTextMemento){
        editorTextMementos.push(editorTextMemento);
    }

    public EditorTextMemento restore(){
        return editorTextMementos.pop();
        //usuwa i zwraca kolejny, czyli ten który aktualnie jest na górze stosu
    }
}
