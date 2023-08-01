package org.example.command2;

public class TextEditor {

  private final StringBuilder text = new StringBuilder();

  public void insert(int position, String textToInsert) {
    text.insert(position, textToInsert);
  }

  public void delete(int start, int end) {
    text.delete(start, end);
  }

  public void replace(int start, int end, String replacement) {
    text.replace(start, end, replacement);
  }

  public String getText() {
    return text.toString();
  }
}
