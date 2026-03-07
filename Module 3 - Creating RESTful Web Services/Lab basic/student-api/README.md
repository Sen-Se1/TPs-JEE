# Student Management System API

A comprehensive RESTful Web Service built with Spring Boot to manage student records. This project demonstrates the core principles of REST architecture, including standard HTTP methods, JSON data mapping, input validation, and centralized exception handling.

## 🚀 Learning Objectives
- Master REST architectural principles.
- Build a Spring Boot application with a layered architecture (Controller, Service, Repository).
- Implement CRUD operations with Spring Data JPA.
- Handle data validation using Jakarta Bean Validation.
- Implement global exception handling for robust API responses.
- Use H2 In-Memory database for rapid development.

---

## 🛠️ Technology Stack
- **Languages:** Java 17
- **Framework:** Spring Boot 3.0.0+
- **Database:** H2 (In-memory)
- **Persistence:** Spring Data JPA / Hibernate
- **Validation:** Jakarta Validation (Hibernate Validator)
- **Build Tool:** Maven

---

## 📂 Project Structure
```text
src/main/java/com/example/studentapi/
├── controller/     # REST Controllers (API Endpoints)
├── model/          # JPA Entities (Database Models)
├── repository/     # Spring Data JPA Repositories
├── service/        # Business Logic (Interfaces & Implementation)
├── exception/      # Global Exception Handling & Error Models
└── StudentApiApplication.java  # Main Entry Point
```

---

## ⚙️ Configuration
The application uses an H2 in-memory database. You can access the database console while the application is running:
- **H2 Console URL:** `http://localhost:8080/h2-console`
- **JDBC URL:** `jdbc:h2:mem:studentdb`
- **User:** `sa`
- **Password:** (blank)

---

## 🛣️ API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/api/students` | Create a new student record |
| **GET** | `/api/students` | Retrieve all student records |
| **GET** | `/api/students/{id}` | Retrieve a specific student by ID |
| **PUT** | `/api/students/{id}` | Update an existing student record |
| **DELETE** | `/api/students/{id}` | Delete a student record |

### Sample JSON Request Body
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "major": "Computer Science"
}
```

---

## 🚦 Getting Started

### Prerequisites
- JDK 17 or higher
- Maven 3+

### Run the Application
1. Clone the repository or extract the project.
2. Navigate to the project root directory.
3. Run the following command:
   ```bash
   ./mvnw spring-boot:run
   ```
4. The API will be accessible at `http://localhost:8080`.

---

## 🧪 Testing with Postman
1. Open **Postman**.
2. Create a new request.
3. Set the method and URL (e.g., `POST http://localhost:8080/api/students`).
4. In the **Body** tab, select **raw** and **JSON**.
5. Paste a sample JSON body and click **Send**.

---

## 📝 Features & Validations
- **Data Validation:** Checks for required fields (`firstName`, `lastName`, `email`, `major`) and valid email formats.
- **Custom Error Responses:** Provides structured JSON error messages in case of validation failures or missing resources.
- **Auto-mapping:** Uses Jackson for seamless conversion between Java objects and JSON.

---
*Created as part of the Teknolabs JEE Course - Module 3: RESTful Web Services.*
