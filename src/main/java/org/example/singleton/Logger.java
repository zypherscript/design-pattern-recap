package org.example.singleton;

public class Logger {

  private static volatile Logger instance;

  private Logger() {
  }

  public static Logger getInstance() {
    if (instance == null) {
      synchronized (Logger.class) {
        if (instance == null) {
          instance = new Logger();
        }
      }
    }
    return instance;
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
