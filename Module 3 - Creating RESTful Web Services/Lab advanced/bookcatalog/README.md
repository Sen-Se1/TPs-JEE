# 📚 Book Catalog REST API & Monitoring

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

A sophisticated RESTful Web Service built with **Spring Boot** designed to manage a comprehensive book catalog. This project demonstrates advanced JEE concepts, including tiered architecture, custom exception handling, request validation, automated API documentation, and real-time monitoring.

---

## 🚀 Overview

The **Book Catalog API** provides a robust set of endpoints for CRUD operations on a collection of books. Beyond basic functionality, it integrates **Spring Boot Actuator** for observability and **SpringDoc OpenAPI** for interactive documentation.

### 🎯 Key Objectives
- **RESTful Design:** Implementation of a standard REST API with appropriate HTTP methods and status codes.
- **Layered Architecture:** Clear separation of concerns between Controllers, Services, and Repositories.
- **Data Integrity:** Strict validation of incoming request bodies using JSR-303 annotations.
- **Monitoring & Observability:** Integration of Health Indicators, Info Contributors, and Custom Metrics.
- **Documentation:** Automatic generation of Swagger/OpenAPI documentation.

---

## 🛠️ Technology Stack

| Component | Technology |
| :--- | :--- |
| **Framework** | Spring Boot 4.0.3 |
| **Language** | Java 17 |
| **Build Tool** | Maven |
| **API Documentation** | SpringDoc OpenAPI (Swagger UI) |
| **Monitoring** | Spring Boot Actuator |
| **Security** | Spring Security |
| **Validation** | Jakarta Validation (Hibernate Validator) |

---

## 📂 Project Structure

```text
src/main/java/com/example/bookcatalog/
├── actuator/             # Custom health, info, and metrics indicators
├── controller/           # REST Controllers for API endpoints
├── exception/            # Custom exceptions and Global Exception Handler
├── model/                # Data models (Book)
├── repository/           # Data access layer (In-Memory Implementation)
└── service/              # Business logic layer
```

---

## ⚙️ Setup & Installation

### Prerequisites
- JDK 17 or higher
- Maven 3.6+

### Steps to Run
1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd bookcatalog
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```
   The application will start on `http://localhost:8081`.

---

## 📑 API Endpoints

All endpoints are prefixed with `/api/books`.

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/api/books` | Retrieve all books in the catalog |
| **GET** | `/api/books/{id}` | Retrieve a specific book by its ID |
| **POST** | `/api/books` | Add a new book to the catalog |
| **PUT** | `/api/books/{id}` | Update existing book information |
| **DELETE** | `/api/books/{id}` | Remove a book from the catalog |

### 🔒 Security
The API is secured. Use the following credentials:
- **Username:** `admin`
- **Password:** `admin123`

---

## 📊 Monitoring & Health

The application exposes several Actuator endpoints for real-time monitoring:

- **Health Status:** `http://localhost:8081/actuator/health`
  - Includes custom `bookCount` and service availability details.
- **App Information:** `http://localhost:8081/actuator/info`
  - Provides total book count and breakdown by genre.
- **Metrics:** `http://localhost:8081/actuator/metrics`
  - Custom metrics: `bookcatalog.books.count`, `bookcatalog.books.recent`, `bookcatalog.books.avgpages`.

---

## 📖 API Documentation

Explore and test the API directly through the **Swagger UI**:

🔗 **[http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)**

Raw OpenAPI definitions are available at:
🔗 `http://localhost:8081/api-docs`

---

## 🛡️ Validation Rules

The `Book` model enforces the following constraints:
- **Title, Author, ISBN:** Cannot be blank.
- **Publication Date:** Must be in the past or present.
- **Page Count:** Must be a positive integer (min 1).

---

Developed as part of the **JEE Module 3 Advanced Lab**. 🚀
