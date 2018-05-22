# Getting started project

See https://spring.io/guides/gs/spring-boot/

    mvn install && java -jar target/try-spring-boot-getting-started-1.0.0-SNAPSHOT.jar &
    curl

Or start with

    mvn spring-boot:run

Visit

    http://localhost:8080

And follow the link

API

    http://localhost:8080/api/song


## Metrics

    http://localhost:8080/actuator/metrics
    http://localhost:8080/actuator/metrics/jvm.memory.used

# Hot reloading

Start with

    mvn spring-boot:run

Rebuild project in IDEA and application will be hot reloaded.

