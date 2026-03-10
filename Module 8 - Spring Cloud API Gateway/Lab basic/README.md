# Spring Cloud API Gateway Lab

## Overview
This project is a microservices-based application demonstrating the implementation and benefits of using an **API Gateway** with **Spring Cloud Gateway**. It includes service discovery using **Netflix Eureka** and two simple microservices: **Product Service** and **Order Service**.

## Project Architecture
The system consists of the following components:
- **Eureka Server**: Acts as the service registry where all microservices register themselves.
- **Product Service**: A simple microservice that manages product data and exposes endpoints for product information.
- **Order Service**: A simple microservice that handles order-related data.
- **API Gateway**: The entry point for all client requests. It routes requests to the appropriate microservices based on configured predicates and filters, leveraging Eureka for service discovery.

## Prerequisites
- **Java 17** or higher
- **Maven**
- An IDE (IntelliJ IDEA, Eclipse, or VS Code)

## Project Structure
```text
Lab basic/
├── eureka-server/    # Service Registry (Port 8761)
├── product-service/  # Microservice 1 (Port 8081)
├── order-service/    # Microservice 2 (Port 8082)
├── api-gateway/      # API Gateway (Port 8080)
└── README.md         # This file
```

## How to Run
To run the full application, start the services in the following order:

1.  **Eureka Server**:
    Navigate to `eureka-server` and run:
    ```bash
    mvn spring-boot:run
    ```
2.  **Product Service**:
    Navigate to `product-service` and run:
    ```bash
    mvn spring-boot:run
    ```
3.  **Order Service**:
    Navigate to `order-service` and run:
    ```bash
    mvn spring-boot:run
    ```
4.  **API Gateway**:
    Navigate to `api-gateway` and run:
    ```bash
    mvn spring-boot:run
    ```

## Testing the Gateway
Once all services are running, you can test the routing through the API Gateway (Port 8080):

- **Get all products**: `curl http://localhost:8080/api/products`
- **Get a specific product**: `curl http://localhost:8080/api/products/1`
- **Get all orders**: `curl http://localhost:8080/api/orders`
- **Get a specific order**: `curl http://localhost:8080/api/orders/2`

## Key Concepts Demonstrated
- **Service Discovery**: Automatic detection of services via Eureka.
- **Dynamic Routing**: Routing requests to services using their service IDs (`lb://`).
- **Load Balancing**: Distributing requests across multiple instances of a service.
- **Filters**: Processing requests before and after they reach the target service (e.g., custom Logging Filter).
- **Circuit Breaker & Rate Limiting**: (Optional) Resiliency and traffic management.
