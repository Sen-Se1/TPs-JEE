# 🚀 Lab: Redis Caching with Spring Boot

Welcome to the **Redis Caching Lab**! In this project, you will learn how to implement an efficient caching layer in a Spring Boot application using **Redis**. This lab focuses on creating a book catalog service where Redis caching is leverage to significantly improve data retrieval performance.

---

## 🎯 Learning Objectives

By the end of this lab, you will:
*   **Understand** the fundamentals of caching and its importance in modern web architectures.
*   **Set up** a Redis server using Docker and connect it to a Spring Boot application.
*   **Implement** Spring's caching abstraction with Redis as the primary cache provider.
*   **Measure & Observe** the tangible performance benefits of caching.

---

## 🛠 Prerequisites

Ensure you have the following installed:
- **Java 17 or higher** (The project is configured for Java 21)
- **Maven**
- **Docker** (to run the Redis server)
- Your favorite IDE (IntelliJ IDEA, VS Code, etc.)

---

## 🏗 project Structure

The project follows a standard Spring Boot architecture:

| Package | Purpose |
| :--- | :--- |
| `com.example.redislab.model` | Contains the `Book` entity (Serializable). |
| `com.example.redislab.repository` | Simulates a database with a `HashMap` and artificial latency. |
| `com.example.redislab.service` | Manages business logic and caching annotations. |
| `com.example.redislab.controller` | REST API endpoints for book management. |
| `com.example.redislab.config` | Redis and Caching configuration. |

---

## ⚙️ environment Setup

### 1. Start Redis Server
Use Docker to spin up a Redis container:
```bash
docker run --name redis -p 6379:6379 -d redis
```
This command starts a Redis instance accessible at `localhost:6379`.

### 2. Configure the Application
Open `src/main/resources/application.properties` and ensure the Redis configuration is set:
```properties
# Redis Configuration
spring.data.redis.host=localhost
spring.data.redis.port=6379

# Logging (Helps trace cache operations)
logging.level.org.springframework.cache=TRACE
```

---

## 🚀 Running the Application

To run the application, use the following command in the project root:
```bash
./mvnw spring-boot:run
```

---

## 📡 API Endpoints & Testing

The application exposes a REST API at `/api/books`.

### 🧪 Test Scenario
We've simulated a **1-second delay** for database operations to make the caching effect clearly visible.

1.  **First Request (Cache Miss):**
    ```bash
    GET http://localhost:8080/api/books/1
    ```
    - Check the console: You'll see `Fetching book with ID: 1 from database`.
    - Time taken: ~1000ms.

2.  **Second Request (Cache Hit):**
    ```bash
    GET http://localhost:8080/api/books/1
    ```
    - The response will be near-instant (~5-20ms).
    - No database log will appear in the console.

### 📚 Available Endpoints

| Method | Endpoint | Description | Caching Behavior |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/books/{id}` | Retrieve a book by ID. | `@Cacheable` (Stores result in cache) |
| `PUT` | `/api/books/{id}` | Update book details. | `@CachePut` (Updates cache entry) |
| `DELETE` | `/api/books/{id}` | Remove a book. | `@CacheEvict` (Removes from cache) |
| `DELETE` | `/api/books/cache` | Clear entire cache. | `@CacheEvict(allEntries=true)` |

---

## 💡 Key Concepts: Caching Annotations

This lab utilizes Spring's powerful caching abstraction:
- **`@Cacheable`**: First check if the data exists in the cache; if not, execute the method and store the result.
- **`@CachePut`**: Always execute the method and update the cache with the result.
- **`@CacheEvict`**: Remove one or more entries from the cache when the method is called.
- **`@EnableCaching`**: Activates the caching infrastructure (defined in `RedisConfig.java`).

---

## 🔍 Understanding the Results

### Why Caching?
Caching reduces the load on your primary data source (database) and provides faster response times to users. However, it introduces **Cache Inconsistency** if not managed properly (stale data).

### Serialization
Notice that the `Book` class implements `Serializable`. This is mandatory for Redis because objects must be converted into a byte stream (or JSON string) to be stored in the external Redis server.

---

## 🌟 Extensions (Challenges)

Ready for more? Try implementing these:
1.  **Conditional Caching**: Only cache books with a price over $10.
2.  **Custom Expiration**: Set different TTLs (Time-To-Live) for different cache types.
3.  **Cache Hit Counter**: Log how many requests were served from the cache versus the database.

---

<p align="center">
  Made with ❤️ for JEE Students @ Teknolabs
</p>
