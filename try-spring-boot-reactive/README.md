From https://dzone.com/articles/spring-boot-reactive-tutorial


    curl http://localhost:8080/person -v
    curl http://localhost:8080/person/{id} -v
    curl http://localhost:8080/person -X POST \
      -d '{"name":"John Smith","age":25}' \
      -H "Content-Type: application/json" -v