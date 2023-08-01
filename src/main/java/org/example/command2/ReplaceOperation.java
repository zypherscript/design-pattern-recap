package org.example.command2;

public class ReplaceOperation implements TextOperation {

  private final TextEditor textEditor;
  private final int start;
  private final int end;
  private final String replacement;
  private String replacedText;

  public ReplaceOperation(TextEditor textEditor, int start, int end, String replacement) {
    this.textEditor = textEditor;
    this.start = start;
    this.end = end;
    this.replacement = replacement;
  }

  public void execute() {
    replacedText = textEditor.getText().substring(start, end);
    textEditor.replace(start, end, replacement);
  }

  public void undo() {
    textEditor.replace(start, start + replacement.length(), replacedText);
  }
}
