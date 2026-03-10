# Product Service

## Overview
This service provides a simple API for managing and retrieving product information. The microservice registers itself with the **Eureka Server** for discovery by the API Gateway.

## Key Features
- **Project Structure**: Simple Spring Boot application with standard controller and static list of products.
- **Service Discovery**: Microservice registers himself automatically on port 8081 with Eureka.

## Configuration
- **Port**: 8081
- **Service ID**: `product-service`

## Endpoints
- **Get All Products**: `GET /products`
- **Get Product by ID**: `GET /products/{id}`

## Running the Service
To run the Product Service:
```bash
mvn spring-boot:run
```

## Setup Instructions
1.  **Dependencies**: Spring Web, Spring Boot Actuator, Eureka Discovery Client.
2.  **Configuration**: Registers with the default Eureka server URL (`http://localhost:8761/eureka/`).
3.  **Controller**: The `ProductController` provides the endpoints and product-related logic.
