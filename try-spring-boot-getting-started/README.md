# Getting started project

See https://spring.io/guides/gs/spring-boot/

    mvn install && java -jar target/try-spring-boot-getting-started-1.0.0-SNAPSHOT.jar &
    curl

Or start with

    mvn spring-boot:run

Visit

    http://localhost:8080

And follow the link

# Hot reloading

Start with

    mvn spring-boot:run

Rebuild project in IDEA and application will be hot reloaded.

# Increase logging level

    curl -i -X POST http://localhost:8080/actuator/loggers/com.purplepip \
      -H "Content-Type: application/json; charset=utf-8" \
      -d '{"configuredLevel": "DEBUG"}'

# Shutdown with

(TODO : Haven't got this working yet)

    curl -i -X POST http://localhost:8080/actuator/shutdown \
      -H "Content-Type: application/json; charset=utf-8"
