package org.example.singleton;

public class Logger2 {

  private Logger2() {
    // Optional: You can add any initialization code here
  }

  private static class LoggerHolder {

    private static final Logger2 INSTANCE = new Logger2();
  }

  public static Logger2 getInstance() {
    return LoggerHolder.INSTANCE;
  }

  public void log(String message) {
    System.out.println("Log: " + message);
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      Thread thread = new Thread(() -> {
        Logger logger = Logger.getInstance();
        logger.log("Thread " + Thread.currentThread().getId() + " is logging a message.");
      });
      thread.start();
    }
  }
}
