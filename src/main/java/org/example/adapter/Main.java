package org.example.adapter;

public class Main {

  public static void main(String[] args) {
    MessageService emailService = new EmailMessageService();
    emailService.sendMessageViaEmail("recipient@example.com", "Hello, this is an email message.");
  }
}
