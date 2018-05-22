# Getting started project

See https://spring.io/guides/gs/spring-boot/

    mvn install && java -jar target/try-spring-boot-getting-started-1.0.0-SNAPSHOT.jar &
    curl

Or start with

    mvn spring-boot:run

# Visit web site

Home page

    http://localhost:8080

API

    http://localhost:8080/api/song


# Actuators

    http://localhost:8080/actuator/health
    http://localhost:8080/actuator/info
    http://localhost:8080/actuator/metrics
    http://localhost:8080/actuator

## Metrics

    http://localhost:8080/actuator/metrics
    http://localhost:8080/actuator/metrics/jvm.memory.used

# Hot reloading

Start with

    mvn spring-boot:run

Rebuild project in IDEA and application will be hot reloaded.

