package com.purplepip.trial.spring.boot.starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
  @Value("${MY_ENVIRONMENT_VARIABLE:MY_ENVIRONMENT_VARIABLE-not-set}")
  String myEnvironmentVariable;

  @RequestMapping("/greetings")
  public String index() {
    LOG.info("Called {} index", HelloController.class.getSimpleName());
    return "Greetings from Spring Boot! MY_ENVIRONMENT_VARIABLE = " + myEnvironmentVariable;
  }
}
