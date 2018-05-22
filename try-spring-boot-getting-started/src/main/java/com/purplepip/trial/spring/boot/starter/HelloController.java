package com.purplepip.trial.spring.boot.starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
  @RequestMapping("/greetings")
  public String index() {
    LOG.info("Called {} index", HelloController.class.getSimpleName());
    return "Greetings from Spring Boot!";
  }
}
