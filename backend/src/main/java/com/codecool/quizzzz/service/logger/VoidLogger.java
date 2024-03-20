package com.codecool.quizzzz.service.logger;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class VoidLogger implements Logger {
  @Override
  public void logError(String content) {
  }

  @Override
  public void logError(String content, String type) {
  }

  @Override
  public void logInfo(String content) {
  }

  @Override
  public void logInfo(String content, String type) {
  }

  private void log(String content, String type) {
  }
}
