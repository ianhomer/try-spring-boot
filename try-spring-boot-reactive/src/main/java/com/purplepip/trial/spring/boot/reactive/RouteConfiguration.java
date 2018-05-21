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

package com.purplepip.trial.spring.boot.reactive;

import static org.springframework.web.reactive.function.server.RequestPredicates.method;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;

//@Configuration
public class RouteConfiguration {
  @Bean
  RouterFunction<?> routes(PersonRepository personRespository) {
    return nest(path("/person"),
        route(RequestPredicates.GET("/{id}"),
            request -> ok().body(personRespository.findById(request.pathVariable("id")),
                Person.class))
            .andRoute(method(HttpMethod.POST),
                request -> {
                  personRespository.insert(request.bodyToMono(Person.class)).subscribe();
                  return ok().build();
                })
    );
  }
}
