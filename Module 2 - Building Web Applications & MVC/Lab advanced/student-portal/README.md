# 🎓 Student Portal - Spring Boot Web Application

![Spring Boot](https://img.shields.io/badge/Spring--Boot-3.4.3-brightgreen?style=for-the-badge&logo=spring)
![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1.2-blue?style=for-the-badge&logo=thymeleaf)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5.3.0-purple?style=for-the-badge&logo=bootstrap)

## 📝 Project Overview

The **Student Portal** is a dynamic web application built using **Spring Boot 3** and **Thymeleaf**. It serves as a comprehensive portal for managing student records, demonstrating core **Spring MVC** concepts, form validation, and service-layer abstraction.

This project was developed as part of the *JEE Module 2 - Building Web Applications & MVC* lab.

---

## 🎯 Objectives

- Develop a scalable **Spring Boot** web application.
- Implement **Spring MVC (Model-View-Controller)** pattern.
- Use **Thymeleaf** for dynamic HTML rendering.
- Apply **Jakarta Validation** for robust form handling.
- Structure an application with separate **Controller**, **Service**, and **Model** layers.
- Implement custom **Global Exception Handling**.

---

## ✨ Key Features

- **Home Dashboard**: A welcoming landing page with portal features.
- **Student CRUD**: Complete Create, Read, Update, and Delete operations for student records.
- **Form Validation**: Sophisticated validation (email format, ID patterns, age limits).
- **Responsive Design**: Built with **Bootstrap** for a seamless experience across devices.
- **In-Memory Storage**: Uses a thread-safe `AtomicLong` and `HashMap` simulation for persistence.
- **Error Management**: Custom error pages and a global exception handler for a smooth UX.

---

## 🛠️ Technology Stack

| Component | Technology |
| :--- | :--- |
| **Framework** | Spring Boot 4.0.3 |
| **Language**| Java 17 |
| **Engine** | Thymeleaf |
| **UI Framework** | Bootstrap 5 |
| **Build Tool** | Maven |
| **Architecture** | MVC Pattern |

---

## 📂 Project Structure

```text
student-portal/
├── src/main/java/com/example/studentportal/
│   ├── controller/          # MVC Controllers
│   │   └── StudentController.java
│   ├── model/               # Data Entities & Validation
│   │   └── Student.java
│   ├── service/             # Business Logic Layer
│   │   ├── StudentService.java
│   │   └── StudentServiceImpl.java
│   ├── exception/           # Global Error Handling
│   │   └── GlobalExceptionHandler.java
│   └── StudentPortalApplication.java
├── src/main/resources/
│   ├── static/              # CSS, JS, Images
│   ├── templates/           # Thymeleaf Templates
│   │   ├── fragments/       # Reusable UI fragments (Header/Footer)
│   │   ├── students/        # Student-related views
│   │   ├── index.html       # Landing page
│   │   └── error.html       # Custom error page
│   └── application.properties
└── pom.xml                  # Maven Dependencies
```

---

## 🚀 Getting Started

### Prerequisites
- **JDK 17** or higher
- **Maven** 3.8+

### Setup & Run
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd student-portal
   ```

2. **Run the application**:
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access the Portal**:
   Open your browser and navigate to: [http://localhost:8080](http://localhost:8080)

---

## 🚦 Application Endpoints

| Endpoint | Method | Description |
| :--- | :--- | :--- |
| `/` | GET | Home Dashboard |
| `/students` | GET | List all registered students |
| `/students/{id}` | GET | View detailed profile of a student |
| `/students/new` | GET | Formal for adding a new student |
| `/students/save` | POST | Save/Update student data |
| `/students/edit/{id}` | GET | Form for editing an existing student |
| `/students/delete/{id}` | GET | Remove a student from the portal |

---

## 🛡️ Form Validation Rules

The application enforces the following rules for student data:
- **Name**: Required, between 2 and 50 characters.
- **Age**: Required, minimum 16 years old.
- **Email**: Must be a valid email structure.
- **Course**: Required selection.
- **Student ID**: Must be exactly **8 characters** (Uppercase letters and numbers only).

---

## 🚀 Future Enhancements (To-Do)

Based on the lab requirements, future versions of this portal will include:
1. **🔍 Student Search**: Search functionality by name or student ID.
2. **🔃 Sorting & Pagination**: Improved navigation for large student datasets.
3. **🌓 Dark Mode**: A JavaScript-powered dark mode toggle for better accessibility.
4. **✅ Client-Side Validation**: Immediate feedback on form entry before submission.

---

## 🧪 Reflection & Learning

This project bridges the gap between static content and dynamic web applications. Key takeaways include:
- **Thymeleaf and Dynamic Content**: Thymeleaf attribute processors (`th:*`) allow seamless integration of Java data into HTML templates.
- **Form Handling with `@Valid`**: Ensuring data integrity at the controller level using Jakarta Bean Validation.
- **Flash Attributes**: Using `RedirectAttributes.addFlashAttribute()` to persist success/error messages across redirects without polluting the URL.

---

## 🤝 Contributing

This is a lab project. Contributions and enhancements (like adding a real Database or Spring Security) are welcome!

1. Fork the Project
2. Create your Feature Branch
3. Commit your Changes
4. Push to the Branch
5. Open a Pull Request

---

## 📜 License

Distributed under the MIT License. See `LICENSE` for more information.

---
*Created with ❤️ by Teknolabs Student Portal Lab*
