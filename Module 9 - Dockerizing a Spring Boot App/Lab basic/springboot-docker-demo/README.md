# Dockerizing a Spring Boot Application

This project demonstrates how to containerize a Spring Boot REST API using Docker, orchestrate it with Docker Compose (using a PostgreSQL database), and deploy it to Kubernetes.

## 📌 Project Overview

The application is a simple **Student Management System** that allows:
*   Creating new students.
*   Retrieving a list of all students.
*   Retrieving a student by ID.

## 🛠️ Technology Stack

*   **Java 17** (Eclipse Temurin)
*   **Spring Boot 3.x**
*   **Spring Data JPA**
*   **H2 Database** (for local development)
*   **PostgreSQL** (for containerized environment)
*   **Docker & Docker Compose**
*   **Kubernetes** (k8s)
*   **Maven**

## 📂 Project Structure

```text
springboot-docker-demo/
├── src/                    # Project source code
│   └── main/java/com/example/springbootdockerdemo/
│       ├── controller/      # REST Endpoints
│       ├── model/           # Student Entity
│       └── repository/      # Data Access Layer
├── k8s/                    # Kubernetes manifests
│   ├── deployment.yaml      # App deployment
│   ├── service.yaml         # App service (LoadBalancer)
│   ├── postgres.yaml        # PostgreSQL deployment & service
│   ├── secret.yaml          # Database credentials
│   └── pvc.yaml            # Persistent Volume Claim for DB
├── Dockerfile              # Multi-stage build instructions
├── docker-compose.yml       # Multi-container orchestration
└── pom.xml                 # Project dependencies
```

---

## 🚀 Part 1: Local Development & Running

### Prerequisites
*   JDK 17 or later
*   Maven installed
*   Docker Desktop (for Parts 2-4)

### Running Locally
1.  Clone the repository and navigate to the project root.
2.  Run the application using Maven:
    ```bash
    ./mvnw spring-boot:run
    ```
3.  The API will be available at `http://localhost:8080/api/students`.

### Testing the API
*   **Create a Student:**
    ```bash
    curl -X POST http://localhost:8080/api/students \
      -H "Content-Type: application/json" \
      -d '{"name":"John Doe","course":"Computer Science"}'
    ```
*   **Get all Students:**
    ```bash
    curl http://localhost:8080/api/students
    ```

---

## 🐳 Part 2: Dockerization

The project uses a **multi-stage build** to keep the final image size minimal by separating the build environment (JDK) from the runtime environment (JRE).

### Build the Docker Image
```bash
docker build -t springboot-app:1.0 .
```

### Run the Container
```bash
docker run -p 8080:8080 springboot-app:1.0
```

---

## 🏗️ Part 3: Orchestration with Docker Compose

This setup includes the Spring Boot application and a PostgreSQL database.

### Start the Services
```bash
docker-compose up -d
```
*   The application will be available at `http://localhost:8080`.
*   PostgreSQL will be running on port `5433` (as configured in `docker-compose.yml`).

### Stop the Services
```bash
docker-compose down
```

---

## ☸️ Part 4: Deployment to Kubernetes

### Prerequisites
*   A running Kubernetes cluster (e.g., Minikube, Docker Desktop K8s, or Kind).
*   `kubectl` CLI installed.

### Deploy the Manifests
1.  Apply the secret and storage first:
    ```bash
    kubectl apply -f k8s/secret.yaml
    kubectl apply -f k8s/pvc.yaml
    ```
2.  Deploy the database:
    ```bash
    kubectl apply -f k8s/postgres.yaml
    ```
3.  Deploy the application:
    ```bash
    kubectl apply -f k8s/deployment.yaml
    kubectl apply -f k8s/service.yaml
    ```

### Accessing the App
If using **Minikube**, run:
```bash
minikube service springboot-app
```

---

## 💡 Key Concepts Learned
*   **Containerization:** Packaging a Spring Boot app with all its dependencies.
*   **Multi-Stage Builds:** Optimizing Docker images for production.
*   **Orchestration:** Managing multiple containers (App + DB) using Docker Compose.
*   **Kubernetes Manifests:** Defining Declared State for deployments, services, secrets, and storage.
*   **Port Forwarding & Load Balancing:** Accessing services inside a cluster.

---
*Created as part of the Teknolabs JEE Module 9 Lab.*
