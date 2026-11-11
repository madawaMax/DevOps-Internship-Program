# Project 05 – Docker: Employee Management REST API

## Project Overview

This project demonstrates how to containerize a Java Spring Boot REST API using Docker and publish the resulting Docker image to Docker Hub.

The application provides basic employee management operations through RESTful API endpoints. It was developed as part of a practical DevOps Internship Program to gain hands-on experience with Docker, containerization, image management, and Docker Hub.

## Objectives

- Understand Docker architecture.
- Understand Docker images and containers.
- Create and use a Dockerfile.
- Build and run a Docker image.
- Configure container port mapping.
- Manage container lifecycle.
- Inspect container logs and configuration.
- Tag and publish Docker images to Docker Hub.
- Pull and run a published image.

## Technologies Used

- Java 21
- Spring Boot
- Maven
- Docker Engine
- Docker Hub
- Ubuntu Server
- Postman

## Application Features

- Retrieve all employees.
- Retrieve an employee by ID.
- Add a new employee.
- Update employee information.
- Delete an employee.
- Health check endpoint.

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/` | Welcome endpoint |
| GET | `/health` | Application health check |
| GET | `/employees` | Retrieve all employees |
| GET | `/employees/{id}` | Retrieve employee by ID |
| POST | `/employees` | Create employee |
| PUT | `/employees/{id}` | Update employee |
| DELETE | `/employees/{id}` | Delete employee |

## Docker Architecture

Application Source Code → Dockerfile → Docker Image → Docker Container → Docker Hub

## Docker Implementation

### 1. Build the Maven Application

```bash
./mvnw clean package
```

### 2. Build Docker Image

```bash
sudo docker build -t employee-management-api:1.0 .
```

### 3. Run Docker Container

```bash
sudo docker run -d --name employee-api -p 8080:8080 employee-management-api:1.0
```

### 4. Verify Container

```bash
sudo docker ps
```

### 5. Check Application Health

```bash
curl http://localhost:8080/health
```

Expected response:

```json
{"status":"UP"}
```

### 6. View Container Logs

```bash
sudo docker logs employee-api
```

### 7. Inspect Container

```bash
sudo docker inspect employee-api
```

### 8. Manage Container Lifecycle

```bash
sudo docker stop employee-api
sudo docker start employee-api
sudo docker restart employee-api
```

## Docker Hub

The Docker image was tagged and published to Docker Hub.

**Image:** `madawamax/employee-management-api:1.0`

**Pull the image:**

```bash
sudo docker pull madawamax/employee-management-api:1.0
```

**Run the published image:**

```bash
sudo docker run -d --name employee-api -p 8080:8080 madawamax/employee-management-api:1.0
```

[View Docker Hub Repository](https://hub.docker.com/r/madawamax/employee-management-api)

## Testing

The REST API was tested using Postman.

Verified operations:

- Employee listing
- Employee retrieval
- Employee creation
- Employee updates
- Employee deletion
- Health check
- Invalid employee ID response

The application was also tested after running inside a Docker container.

## Important Note

Employee records are stored in an in-memory data structure. Newly added or updated records are not persisted after the application restarts.

## Skills Demonstrated

- Docker image creation and management
- Docker container lifecycle management
- Application containerization
- Port mapping
- Container logs and inspection
- Docker Hub authentication and image publishing
- REST API deployment in a containerized environment

---

**Project:** Company DevOps Internship Program  
**Project Number:** 05 – Docker  
**Status:** Docker image successfully published to Docker Hub.
