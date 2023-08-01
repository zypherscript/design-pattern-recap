package org.example.command2;

import java.util.ArrayList;
import java.util.List;

public class TextEditorInvoker {

  private final List<TextOperation> history = new ArrayList<>();

  public void executeOperation(TextOperation operation) {
    operation.execute();
    history.add(operation);
  }

  public void undoLastOperation() {
    if (!history.isEmpty()) {
      TextOperation lastOperation = history.remove(history.size() - 1);
      lastOperation.undo();
    }
  }

  public static void main(String[] args) {
    TextEditor textEditor = new TextEditor();
    TextEditorInvoker invoker = new TextEditorInvoker();

    // Insert "Hello"
    TextOperation insertOperation1 = new InsertOperation(textEditor, "Hello");
    invoker.executeOperation(insertOperation1);
    System.out.println(textEditor.getText());

    // Insert " World!"
    TextOperation insertOperation2 = new InsertOperation(textEditor, " World!");
    invoker.executeOperation(insertOperation2);
    System.out.println(textEditor.getText());

    // Delete "Hello"
    TextOperation deleteOperation = new DeleteOperation(textEditor, 0, 5);
    invoker.executeOperation(deleteOperation);
    System.out.println(textEditor.getText());

    // Replace "World" with "Everyone"
    int start = textEditor.getText().indexOf("World");
    int end = start + "World".length();
    TextOperation replaceOperation = new ReplaceOperation(textEditor, start, end, "Everyone");
    invoker.executeOperation(replaceOperation);
    System.out.println(textEditor.getText());

    // Undo last operation
    invoker.undoLastOperation();
    System.out.println("After Undo: " + textEditor.getText());
  }
}

