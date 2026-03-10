# Lab: Spring Cloud Microservices - Eureka & Feign

## Overview
This lab demonstrates a simple microservices architecture using **Spring Cloud**. It consists of a service discovery server (Eureka) and two microservices that communicate with each other using **Feign**.

### Components
1. **Eureka Server**: Acts as the service registry where all microservices register themselves.
2. **Product Service**: A microservice that manages product information.
3. **Order Service**: A microservice that creates orders and fetches product details from the **Product Service** using a declarative REST client (Feign).

## Architecture
The following diagram illustrates the interaction between the services:
- **Eureka Server** runs on port `8761`.
- **Product Service** (port `8081`) registers with Eureka.
- **Order Service** (port `8082`) registers with Eureka and discovers **Product Service**.

## Prerequisites
- Java 17 or higher
- Maven
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

## Project Structure
- `eureka-server/`: The service discovery server.
- `product-service/`: The product management microservice.
- `order-service/`: The order management microservice (consumes Product Service).

## Getting Started

### 1. Run Eureka Server
Navigate to the `eureka-server` directory and run:
```bash
mvn spring-boot:run
```
Visit http://localhost:8761 to see the Eureka dashboard.

### 2. Run Product Service
Navigate to the `product-service` directory and run:
```bash
mvn spring-boot:run
```
The service will register with Eureka as `PRODUCT-SERVICE`.

### 3. Run Order Service
Navigate to the `order-service` directory and run:
```bash
mvn spring-boot:run
```
The service will register with Eureka as `ORDER-SERVICE`.

## Testing the Microservices

### Product Service
- **Get all products**: `GET http://localhost:8081/products`
- **Get product by ID**: `GET http://localhost:8081/products/1`

### Order Service
- **Create an order**:
  - **Method**: `POST`
  - **URL**: `http://localhost:8082/orders`
  - **Body**:
    ```json
    { "productId": 1, "quantity": 2 }
    ```
- **Get all orders**: `GET http://localhost:8082/orders`
- **Get order by ID**: `GET http://localhost:8082/orders/1`

## Key Concepts
- **Service Discovery**: Eureka allows services to find each other without hardcoded URLs.
- **Feign Client**: A declarative REST client that simplifies inter-service communication.
- **Client-Side Load Balancing**: Automatically handled by Spring Cloud when using Eureka and Feign.

---
*Lab based on Teknolabs Course Materials.*
