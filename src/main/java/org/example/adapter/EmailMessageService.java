package org.example.adapter;

public class EmailMessageService implements MessageService {

  @Override
  public void sendMessageViaEmail(String to, String message) {
    System.out.println("Sending email to: " + to);
    System.out.println("Message: " + message);
  }
}
