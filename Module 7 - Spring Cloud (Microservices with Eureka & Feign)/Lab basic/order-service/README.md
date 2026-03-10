# Order Service

## Description
The **Order Service** manages customer orders. It demonstrates **microservice communication** by using **Spring Cloud OpenFeign** to fetch product information from the **Product Service**.

## Configuration
- **Port**: `8082`
- **Eureka Registration**: Registers with Eureka under the name `ORDER-SERVICE`.

### Key settings in `application.properties`:
```properties
spring.application.name=order-service
server.port=8082
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
```

## Inter-Service Communication
This service uses a **Feign Client** (`ProductClient`) to talk to the `PRODUCT-SERVICE`.
```java
@FeignClient(name = "product-service")
public interface ProductClient {
    @GetMapping("/products/{id}")
    Product getProduct(@PathVariable("id") Long id);
}
```

## API Endpoints

### Create Order
- **URL**: `/orders`
- **Method**: `POST`
- **Payload**:
  ```json
  {
    "productId": 1,
    "quantity": 2
  }
  ```
- **Description**: Fetches details for `productId` from Product Service, calculates `totalPrice`, and saves the order.

### Get All Orders
- **URL**: `/orders`
- **Method**: `GET`

### Get Order by ID
- **URL**: `/orders/{id}`
- **Method**: `GET`

## How to Run
Ensure **Eureka Server** and **Product Service** are running, then run:
```bash
mvn spring-boot:run
```
