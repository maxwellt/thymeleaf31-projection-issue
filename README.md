The Thymeleaf 3.1 release states the following: 

> Thymeleaf 3.1 establishes a general restriction on the use of classes from core packages: java.*, javax.*, jakarta.*, jdk.*, org.ietf.jgss.*, org.omg.*, org.w3c.dom.*, org.xml.sax.*, com.sun.* and sun.*.

If you are using Spring Data Projections, the returned class will always be a proxy in the **jdk.*** package, which means you aren't able to use it in a Thymeleaf template.

I have added as simple an example as I could think of to demonstrate the issue. Simply run `./mvnw spring-boot:run` and navigate to `localhost:8080` and the console output will show the error.
