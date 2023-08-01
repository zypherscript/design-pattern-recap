package org.example.command2;

public class InsertOperation implements TextOperation {

  private final TextEditor textEditor;
  private final String textToInsert;
  private final int insertionPoint;

  public InsertOperation(TextEditor textEditor, String textToInsert) {
    this.textEditor = textEditor;
    this.textToInsert = textToInsert;
    this.insertionPoint = textEditor.getText().length();
  }

  public void execute() {
    textEditor.insert(insertionPoint, textToInsert);
  }

  public void undo() {
    textEditor.delete(insertionPoint, insertionPoint + textToInsert.length());
  }
}
