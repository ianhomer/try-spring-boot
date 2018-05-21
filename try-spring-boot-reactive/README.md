# Try Spring Web Reactive

Add people

    curl http://localhost:8080/person -v

Get people

    curl http://localhost:8080/person -X POST \
      -d '{"name":"John Smith"}' \
      -H "Content-Type: application/json" -v

# Further Reading

This example is creating having read the following articles

* https://dzone.com/articles/spring-boot-reactive-tutorial
* https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#webflux-ann-controller