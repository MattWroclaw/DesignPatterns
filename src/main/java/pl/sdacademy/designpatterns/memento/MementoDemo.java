package pl.sdacademy.designpatterns.memento;

public class MementoDemo {
    public static void main(String[] args) {
        final EditorText editorText = new EditorText();
        final EditorTextMementoManager mementoManager = new EditorTextMementoManager();

        mementoManager.save(new EditorTextMemento(editorText));
        editorText.addText("This is my 1 line");
        mementoManager.save( new EditorTextMemento(editorText));
        editorText.addText("This is my first line comtinuation");
        mementoManager.save( new EditorTextMemento(editorText));
        editorText.addText("\n add second line");
        mementoManager.save( new EditorTextMemento(editorText));
        editorText.addText("\n add 3rd line");
        mementoManager.save( new EditorTextMemento(editorText));

        System.out.println(editorText.getValue()+"\n");

        mementoManager.restore();
        mementoManager.restore();
        editorText.restoreFromMemento(mementoManager.restore());

        System.out.println(editorText.getValue());
    }
}
