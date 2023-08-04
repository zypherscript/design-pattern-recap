package org.example.adapter;

public class EmailToSMSAdapter implements SMSService {

  private final EmailMessageService emailMessageService;

  public EmailToSMSAdapter(EmailMessageService emailMessageService) {
    this.emailMessageService = emailMessageService;
  }

  @Override
  public void sendMessageViaSMS(String phoneNumber, String message) {
    String emailFormat = "SMS to %s: %s";
    String emailMessage = String.format(emailFormat, phoneNumber, message);
    emailMessageService.sendMessageViaEmail("sms.gateway@example.com", emailMessage);
  }
}
