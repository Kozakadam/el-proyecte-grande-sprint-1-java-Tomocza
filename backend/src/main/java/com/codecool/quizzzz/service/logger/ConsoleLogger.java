package com.codecool.quizzzz.service.logger;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@Service
public class ConsoleLogger implements Logger{
  @Override
  public void logError(String content) {
    log(content, "ERROR");
  }

  @Override
  public void logError(String content, String type) {
    log(content, "ERROR: " + type);
  }

  @Override
  public void logInfo(String content) {
    log(content, "INFO");
  }

  @Override
  public void logInfo(String content, String type) {
    log(content, "INFO: " + type);
  }

  private void log(String content, String type) {
    System.out.println((String.format("[%s]: [%s] \n%s\n", LocalDateTime.now(), type, content)));
  }
}
