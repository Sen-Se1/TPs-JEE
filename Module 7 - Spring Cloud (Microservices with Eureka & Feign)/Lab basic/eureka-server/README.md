# Eureka Server

## Description
This is a **Service Discovery** server built with **Spring Cloud Eureka**. It serves as a central registry where all microservices in the system register themselves so they can be discovered by other services.

## Configuration
- **Port**: `8761`
- **Spring Application Name**: `eureka-server`

### Key settings in `application.properties`:
```properties
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
spring.application.name=eureka-server
```

## How to Run
Run the application using Maven:
```bash
mvn spring-boot:run
```

## Dashboard
Once running, you can access the Eureka dashboard at:
[http://localhost:8761](http://localhost:8761)

The dashboard displays all registered service instances, their hostnames, ports, and status.
