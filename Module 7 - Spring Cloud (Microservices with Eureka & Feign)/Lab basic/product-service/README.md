# Product Service

## Description
The **Product Service** is a microservice responsible for managing product data. In this lab, it provides a simple in-memory repository of products.

## Configuration
- **Port**: `8081`
- **Eureka Registration**: Registers with Eureka under the name `PRODUCT-SERVICE`.

### Key settings in `application.properties`:
```properties
spring.application.name=product-service
server.port=8081
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
```

## API Endpoints

### Get All Products
- **URL**: `/products`
- **Method**: `GET`
- **Success Response**: List of Product objects.

### Get Product by ID
- **URL**: `/products/{id}`
- **Method**: `GET`
- **Path Variables**: `id` (Long)
- **Success Response**: A single Product object.

## How to Run
Ensure the **Eureka Server** is running first, then run:
```bash
mvn spring-boot:run
```
The service will automatically register with Eureka.
