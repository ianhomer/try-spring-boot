/*
 * Copyright (c) 2017 the original author or authors. All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.purplepip.trial.spring.boot.starter;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Timed
@Slf4j
public class HomeController {
  private final Counter slowCounter = Metrics.counter("home.slow");

  @RequestMapping("/")
  public String index(Model model) {
    populate(model);
    return "index";
  }

  @Timed(value = "home.slow")
  @RequestMapping("/slow")
  public String slow(Model model) throws InterruptedException {
    slowCounter.increment();
    populate(model);
    LOG.debug("Sleeping to slow page down ...");
    Thread.sleep(2000);
    LOG.debug("... awake now");
    return "index";
  }

  private void populate(Model model) {
    model.addAttribute("now", LocalDate.now());
  }
}
