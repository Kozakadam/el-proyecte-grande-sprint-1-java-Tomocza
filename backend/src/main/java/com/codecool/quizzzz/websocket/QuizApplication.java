package com.codecool.quizzzz.websocket;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuizApplication {

  @Value("${rt-server.host}")
  private String host;

  @Value("${rt-server.port}")
  private Integer port;

  @Bean
  public SocketIOServer socketIOServer() {
    Configuration config = new Configuration();
    config.setHostname(host);
    config.setPort(port);
    return new SocketIOServer(config);
  }
}