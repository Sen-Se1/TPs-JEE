# Spring MVC with Thymeleaf Lab

This project is a hands-on lab designed to guide you through building a web application using **Spring Boot**, **Spring MVC**, and **Thymeleaf**. It demonstrates the foundational concepts of the Model-View-Controller (MVC) pattern and dynamic web page rendering.

## 🎯 Lab Objectives

After completing this lab, you will be able to:
- Set up a Spring Boot project from scratch.
- Understand and implement the **Model-View-Controller (MVC)** architecture.
- Create controllers to handle HTTP GET and POST requests.
- Use the `Model` object to pass data between controllers and views.
- Build dynamic UI components using **Thymeleaf** templates.
- Implement form processing and server-side validation using the Jakarta Validation API.

## 🛠️ Technologies Used

- **Java 17**
- **Spring Boot 4.0.3**
  - Spring Web (MVC)
  - Spring Boot DevTools
  - Thymeleaf
  - Validation (Hibernate Validator)
- **Maven** for dependency management.

## 📂 Project Structure

```text
src/main/java/com/example/springthymeleaflab/
├── SpringThymeleafLabApplication.java (Main Entry Point)
├── controllers/
│   ├── HomeController.java (Home Page logic)
│   └── StudentController.java (Student CRUD/Registration logic)
└── models/
    └── Student.java (Domain Model with Validation)

src/main/resources/
├── templates/
│   ├── home.html (Landing Page)
│   └── students/
│       ├── list.html (Student Directory)
│       └── register.html (Registration Form)
└── static/ (CSS, JS, Images - optional)
```

## 🚀 Getting Started

### Prerequisites
- JDK 17 or higher installed.
- Maven installed (or use the provided `mvnw` wrapper).

### Running the Application
1. Clone the repository or extract the project.
2. Navigate to the project root directory.
3. Run the application using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Once started, open your browser and visit:
   `http://localhost:8080`

## 🌟 Key Features

- **Dynamic Homepage**: Uses Thymeleaf to render messages passed from the controller.
- **Student Registration**: A complete form implementation including:
  - Data binding to a Java object.
  - Server-side validation (e.g., `@NotBlank`, `@Email`, `@Size`).
  - Error message display in the UI.
- **Student Directory**: A dynamic list that displays all registered students in-memory.
- **Navigation**: Seamless routing between the Home, List, and Registration pages.

## 📝 Lab Steps Overview

1. **Project Setup**: Initializing the project via Spring Initializr.
2. **Controller Creation**: Implementing `@Controller` and request mappings.
3. **Thymeleaf Integration**: Using `th:text`, `th:each`, and `th:object`.
4. **Model Binding**: Syncing form data with Java classes.
5. **Validation**: Enforcing constraints on user input.

---
*This lab is part of the Teknolabs JEE Course curriculum.*
