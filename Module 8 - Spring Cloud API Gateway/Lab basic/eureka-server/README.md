# Eureka Server

## Overview
This service acts as the **Service Registry** for the microservices in the Spring Cloud project. It uses **Netflix Eureka Server** to allow microservices to register themselves and discover other registered services.

## Configuration
- **Port**: 8761 (default port for Eureka)
- **Service ID**: `eureka-server`

## Dependencies
- `spring-cloud-starter-netflix-eureka-server`
- `spring-boot-starter-actuator`

## Main Configuration (`application.properties`)
```properties
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
spring.application.name=eureka-server
```

## Running the Server
To run the Eureka Server:
```bash
mvn spring-boot:run
```

## Dashboard
Once running, you can access the Eureka dashboard at:
`http://localhost:8761/`

You will see listed all instances of microservices currently registered with the Eureka Server.
