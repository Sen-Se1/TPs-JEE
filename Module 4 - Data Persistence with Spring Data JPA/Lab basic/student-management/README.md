# Student Management Application

A Spring Boot-based Student Management System developed to demonstrate the integration of **Spring Data JPA** with **PostgreSQL**. This application provides a RESTful API for managing student records, including CRUD operations and custom query functionality.

## 🚀 Overview
The "Student Management" system is a practical lab project designed to illustrate object-relational mapping (ORM) concepts and data persistence in Java web applications. It leverages the power of Spring Data JPA to simplify database interactions and provide a clean architecture with separate model, repository, service, and controller layers.

## 🎯 Learning Objectives
*   Understand the core concepts of **Spring Data JPA**.
*   Connect a Spring Boot application to **PostgreSQL**.
*   Create **entity classes** and map them to database tables.
*   Implement **CRUD operations** using JPA repositories.
*   Test data persistence operations and custom finder methods.

## 🛠️ Technology Stack
*   **Java 17**
*   **Spring Boot 3.3.x**
*   **Spring Data JPA**
*   **Spring Web**
*   **PostgreSQL Driver**
*   **Lombok**
*   **Maven** (for dependency management)

## 🏗️ Project Structure
```text
student-management/
├── src/main/java/com/example/studentmanagement/
│   ├── controller/      # REST Endpoints
│   ├── model/           # JPA Entities (Student)
│   ├── repository/      # JPA Repositories (StudentRepository)
│   ├── service/         # Business Logic (StudentService)
│   └── DataInitializer  # Sample Data Setup
└── src/main/resources/
    └── application.properties # Database Configuration
```

## ⚙️ Setup and Configuration

### 1. Database Setup
Ensure you have PostgreSQL installed. You can create the database manually or use Docker:

**Manual Setup:**
```sql
CREATE DATABASE student_db;
```

**Using Docker:**
```bash
docker run --name postgres-db -e POSTGRES_PASSWORD=root -e POSTGRES_DB=student_db -p 5432:5432 -d postgres
```

### 2. Application Properties
Configure your database credentials in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/student_db
spring.datasource.username=postgres
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 🚀 Running the Application
1. Clone the repository.
2. Navigate to the project root directory.
3. Run the application using Maven:
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`. Sample data is automatically initialized if the database is empty.

## 📡 REST API Endpoints

### Student Management
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/students` | Create a new student |
| `GET` | `/api/students` | Get all students |
| `GET` | `/api/students/{id}` | Get student by ID |
| `PUT` | `/api/students/{id}` | Update student details |
| `DELETE` | `/api/students/{id}` | Delete a student |

### Search & Filters
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/students/major/{major}` | Find students by major |
| `GET` | `/api/students/younger-than/{age}` | Find students younger than specified age |
| `GET` | `/api/students/by-lastname/{pattern}` | Search students by last name pattern |
| `GET` | `/api/students/age-range?minAge={min}&maxAge={max}` | Find students in a specific age range |

---
*Created as part of the JEE Development Module 4 Lab by Teknolabs.*
