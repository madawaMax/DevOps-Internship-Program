# Project 08 – Express API + GitHub Actions + Docker

## 🎯 Task Objective

Build and deploy a simple **Express.js REST API** using modern DevOps practices.

This project demonstrates how a Node.js application can be tested, containerized with Docker, automatically built through GitHub Actions, published to Docker Hub, and deployed to a Linux server.

---

## 🏗️ Architecture

```text
Developer
    │
    ▼
GitHub Repository
    │
    ▼
GitHub Actions
    │
    ├── Install Dependencies
    │
    ├── Run Automated Tests
    │
    ├── Build Docker Image
    │
    ├── Login to Docker Hub
    │
    └── Push Docker Image
              │
              ▼
        Docker Hub
              │
              ▼
      Ubuntu Server VM
              │
              ▼
     Express API Container
              │
              ▼
         Port 3000
```

---

## 🛠️ Technologies Used

* Node.js
* Express.js
* Jest
* Supertest
* Docker
* GitHub Actions
* Docker Hub
* Ubuntu Server
* Git & GitHub

---

## 📁 Project Structure

```text
08-Express-API-GitHub-Actions/
│
├── Dockerfile
├── .dockerignore
├── package.json
├── package-lock.json
├── server.js
└── server.test.js
```

### File Description

| File                | Purpose                                  |
| ------------------- | ---------------------------------------- |
| `server.js`         | Express API application                  |
| `server.test.js`    | Automated API tests                      |
| `package.json`      | Project dependencies and npm scripts     |
| `package-lock.json` | Exact dependency versions                |
| `Dockerfile`        | Docker image build instructions          |
| `.dockerignore`     | Files excluded from Docker build context |

---

## 🚀 API Endpoints

### GET `/`

Returns a welcome message.

**Response:**

```json
{
  "message": "Hello from Express API"
}
```

### GET `/health`

Returns the application health status.

**Response:**

```json
{
  "status": "UP"
}
```

The `/health` endpoint can be used by monitoring systems, load balancers, or deployment platforms to verify that the application is running.

---

## 🧪 Automated Testing

The project uses **Jest** and **Supertest** for automated API testing.

Tests verify:

* `GET /` returns HTTP `200`
* Welcome message is returned correctly
* `GET /health` returns HTTP `200`
* Health status is returned as `UP`

Run tests locally:

```bash
npm test
```

---

## 🐳 Docker

The application is containerized using Docker.

### Build Docker Image

From the repository root:

```bash
sudo docker build -t express-api:ci ./08-Express-API-GitHub-Actions
```

### Run Container

```bash
sudo docker run -d \
  --name express-api \
  -p 3000:3000 \
  madawamax/express-api:latest
```

### Check Running Container

```bash
sudo docker ps
```

### Test the Application

```bash
curl http://localhost:3000
```

Health check:

```bash
curl http://localhost:3000/health
```

---

## 🔄 CI/CD Pipeline

GitHub Actions automates the following process:

```text
Git Push
   │
   ▼
GitHub Actions
   │
   ├── Checkout Source Code
   │
   ├── Setup Node.js 20
   │
   ├── npm ci
   │
   ├── npm test
   │
   ├── Docker Build
   │
   ├── Docker Hub Login
   │
   └── Docker Image Push
```

The Docker image is published as:

```text
madawamax/express-api:latest
```

---

## 🔐 GitHub Secrets

Docker Hub authentication is handled using GitHub repository secrets.

Configured secrets:

```text
DOCKERHUB_USERNAME
DOCKERHUB_TOKEN
```

The Docker Hub access token is **not stored in the source code**.

This demonstrates a basic DevOps security practice for handling credentials in CI/CD pipelines.

---

## ☁️ Docker Hub

The application Docker image is published to Docker Hub.

Image:

```text
madawamax/express-api:latest
```

The deployment server pulls the image directly from Docker Hub.

---

## 🖥️ Deployment

The application was deployed to an Ubuntu Server virtual machine using Docker.

Deployment process:

```text
Docker Hub
    │
    │ docker pull
    ▼
Ubuntu Server
    │
    │ docker run
    ▼
Express API Container
    │
    ▼
Port 3000
```

Pull the latest image:

```bash
sudo docker pull madawamax/express-api:latest
```

Run the application:

```bash
sudo docker run -d \
  --name express-api \
  -p 3000:3000 \
  madawamax/express-api:latest
```

---

## ✅ Verification

The deployed container was verified using:

```bash
sudo docker ps
```

Application endpoint:

```bash
curl http://localhost:3000
```

Expected response:

```json
{
  "message": "Hello from Express API"
}
```

Health endpoint:

```bash
curl http://localhost:3000/health
```

Expected response:

```json
{
  "status": "UP"
}
```

---

## 📚 DevOps Concepts Learned

This project provided practical experience with:

* REST API development
* Node.js application runtime
* Express.js
* Automated testing
* Jest and Supertest
* Dockerfile creation
* Docker image building
* Docker containers
* Docker Hub
* GitHub Actions
* CI pipeline automation
* GitHub repository secrets
* Container deployment
* Application health checks
* Linux server deployment

---

## 🎓 Project Outcome

This project demonstrates a complete basic DevOps workflow:

```text
Code
 ↓
GitHub
 ↓
Automated Tests
 ↓
Docker Build
 ↓
Docker Hub
 ↓
Linux Server
 ↓
Running Container
 ↓
Express REST API
```

The project combines **application development, automated testing, containerization, CI automation, image publishing, and server deployment** into one practical DevOps workflow.
