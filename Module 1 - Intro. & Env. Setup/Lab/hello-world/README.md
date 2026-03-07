# 🚀 Spring Boot Hello World - JEE Module 1

## 📖 Introduction
This is a minimal Spring Boot web application created as part of **Module 1: Introduction & Environment Setup** of the JEE Course. The primary goal of this lab is to understand how to bootstrap a Spring Boot application and implement a foundational RESTful controller.

---

## ✨ Features
- **Project Bootstrapping**: Built using Spring Initializr (Maven).
- **RESTful Endpoints**: Multiple HTTP GET endpoints for basic interaction.
- **Auto-Configuration**: Leverages `@SpringBootApplication` for zero-configuration startup.
- **Customizable**: Configuration via `application.properties`.

---

## 📋 Prerequisites
Before running this project, ensure you have the following installed:
- [Java Development Kit (JDK) 17+](https://www.oracle.com/java/technologies/downloads/)
- [Apache Maven 3.6+](https://maven.apache.org/download.cgi)
- A modern IDE (IntelliJ IDEA, Eclipse, or VS Code)

---

## 🛠 Getting Started

### 1. Clone the Project
```bash
git clone <repository-url>
cd hello-world
```

### 2. Build and Run
You can run the application directly using the Maven Wrapper:
```bash
./mvnw spring-boot:run
```
Alternatively, if you have Maven installed globally:
```bash
mvn spring-boot:run
```

---

## 📡 API Endpoints
Once the application is running, you can access the following endpoints:

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/` | Returns the classic "Hello, World!" message. |
| `GET` | `/greeting` | Returns a friendly "Welcome to Spring Boot!" message. |

> [!TIP]
> Use `curl http://localhost:8080/` in your terminal to test the endpoints quickly.

---

## 📁 Project Structure
The project follows the standard Maven directory structure:
- `src/main/java`: Contains the application source code.
    - `com.example.helloworld`: Root package.
        - `HelloWorldApplication.java`: The main entry point.
        - `HelloController.java`: Defines the web endpoints.
- `src/main/resources`: Contains configuration files.
    - `application.properties`: Main configuration file.
    - `banner.txt`: (Optional) Custom startup banner.
- `pom.xml`: Project Object Model file defining dependencies (Spring Web, etc.).

---

## 📜 Lab Reference
This project was built following the Teknolabs JEE Module 1 Lab guide:
`Lab: Create a minimal Spring Boot web app that prints 'Hello, World'`
