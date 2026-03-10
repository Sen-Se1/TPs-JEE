# Order Service

## Overview
This service provides a simple API for order management. It allows clients to fetch information about orders. The microservice registers itself with the **Eureka Server** for discovery and routing via the API Gateway.

## Key Features
- **Project Structure**: Simple Spring Boot application with standard controller and static list of orders.
- **Service Discovery**: Microservice registers himself automatically on port 8082 with Eureka.

## Configuration
- **Port**: 8082
- **Service ID**: `order-service`

## Endpoints
- **Get All Orders**: `GET /orders`
- **Get Order by ID**: `GET /orders/{id}`

## Running the Service
To run the Order Service:
```bash
mvn spring-boot:run
```

## Setup Instructions
1.  **Dependencies**: Spring Web, Spring Boot Actuator, Eureka Discovery Client.
2.  **Configuration**: Registers with the default Eureka server URL (`http://localhost:8761/eureka/`).
3.  **Controller**: The `OrderController` provides the endpoints and order-related logic.
