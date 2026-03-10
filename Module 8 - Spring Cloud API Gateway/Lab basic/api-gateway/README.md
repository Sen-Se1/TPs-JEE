# API Gateway

## Overview
This service acts as the **entry point** for all client requests. It uses **Spring Cloud Gateway** for routing, filtering, and load balancing across microservices.

## Key Features
- **Routing**: Automatically routes requests to products and order-related endpoints based on their service IDs (`lb://product-service`, `lb://order-service`).
- **Load Balancing**: Distribute requests between services using Eureka for discovery.
- **Filtering**:
  - `StripPrefix`: Removes the leading path prefix (e.g., `/api`) before forwarding the request.
  - `LoggingFilter`: Intercepts requests to log information and add custom headers (`X-Request-Time`).

## Configuration
- **Port**: 8080
- **Service ID**: `api-gateway`

## Routing (`application.properties`)
```properties
# Routes to Product Service
spring.cloud.gateway.routes[0].id=product-service
spring.cloud.gateway.routes[0].uri=lb://product-service
spring.cloud.gateway.routes[0].predicates[0]=Path=/api/products/**
spring.cloud.gateway.routes[0].filters[0]=StripPrefix=1

# Routes to Order Service
spring.cloud.gateway.routes[1].id=order-service
spring.cloud.gateway.routes[1].uri=lb://order-service
spring.cloud.gateway.routes[1].predicates[0]=Path=/api/orders/**
spring.cloud.gateway.routes[1].filters[0]=StripPrefix=1
```

## Running the Gateway
To start the API Gateway:
```bash
mvn spring-boot:run
```

## Advanced Features
- **Rate Limiting**: Using Redis and Resilience4j to control request traffic.
- **Circuit Breaker**: Using Resilience4j to provide fallback mechanisms when services are unavailable.
- **Discovery Locator**: Automatically discover and route to any microservice registered with Eureka.
