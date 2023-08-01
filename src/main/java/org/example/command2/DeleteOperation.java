package org.example.command2;

public class DeleteOperation implements TextOperation {

  private final TextEditor textEditor;
  private final int start;
  private final int end;
  private String textDeleted;

  public DeleteOperation(TextEditor textEditor, int start, int end) {
    this.textEditor = textEditor;
    this.start = start;
    this.end = end;
  }

  public void execute() {
    textDeleted = textEditor.getText().substring(start, end);
    textEditor.delete(start, end);
  }

  public void undo() {
    textEditor.insert(start, textDeleted);
  }
}
