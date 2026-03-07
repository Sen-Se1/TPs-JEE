# 📓 Lab Notes: Module 1 - Introduction & Environment Setup

## 📝 Answers to Documentation Tasks

**1. What annotations did you use in this lab, and what is the purpose of each?**
-   `@SpringBootApplication`: A meta-annotation that combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`. It marks the main entry point and enables Spring's core features.
-   `@RestController`: Marks a class as a web controller where methods return domain objects (like Strings or JSON) directly in the response body.
-   `@GetMapping`: A specialized version of `@RequestMapping` for handling HTTP GET requests.

**2. How does Spring Boot convert Java objects to JSON?**
-   Spring Boot uses the **Jackson** library by default. When a method in a `@RestController` returns an object, Jackson automatically serializes it into a JSON string.

**3. What is the significance of the `@SpringBootApplication` annotation?**
-   It is the primary bootstrap annotation. It tells Spring to start its auto-configuration mechanisms, scan for other components in the package tree, and allows for defining additional configuration beans.

**4. How would you change the port number in a Spring Boot application?**
-   By adding the property `server.port=XXXX` in the `src/main/resources/application.properties` file.

**5. What are the advantages of using Spring Boot compared to traditional Java web applications?**
-   **Embedded Server**: No need to deploy to an external Tomcat/Jetty server; the server is built into the JAR.
-   **Starter Dependencies**: Simplifies Maven/Gradle configuration with curated sets of dependencies.
-   **Auto-Configuration**: Dramatically reduces the amount of boilerplate code and XML configuration required.
-   **Production-Ready Features**: Includes metrics, health checks, and externalized configuration out of the box.

---

## 🏆 Lab Completion Checklist
- [x] Initialized Spring Boot project via Initializr.
- [x] Implemented `HelloController` with `/` and `/greeting` endpoints.
- [x] Customized the application banner.
- [x] Configured project structure and build system (Maven).
