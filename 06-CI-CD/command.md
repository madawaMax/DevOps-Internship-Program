# DEVOPS-051 to DEVOPS-060 – Commands Reference

This document contains the main commands used during the implementation and verification of the CI/CD, Docker, Webhook, and Monitoring tasks.

---

# DEVOPS-051 – Java & Maven Application Setup

## Check Java Version

```bash
java -version
```

## Check Maven Version

```bash
mvn -version
```

## Navigate to Application Directory

```bash
cd 06-CI-CD/app
```

## Check Project Files

```bash
ls
```

Expected:

```text
pom.xml
src
```

---

# DEVOPS-052 – Unit Testing

## Run Unit Tests

```bash
mvn test
```

## Expected Result

```text
Tests run: 1
Failures: 0
Errors: 0
```

## Test Class

```text
src/test/java/com/devops/AppTest.java
```

---

# DEVOPS-053 – Maven Build & Package

## Clean and Compile

```bash
mvn clean compile
```

## Create JAR Package

```bash
mvn clean package
```

## Check Generated Files

```bash
ls target
```

Expected JAR:

```text
devops-build-app-1.0-SNAPSHOT.jar
```

## Run JAR

```bash
java -jar target/devops-build-app-1.0-SNAPSHOT.jar
```

---

# DEVOPS-054 – Jenkins Build Pipeline

## Check Jenkins Service

```bash
sudo systemctl status jenkins
```

## Start Jenkins

```bash
sudo systemctl start jenkins
```

## Restart Jenkins

```bash
sudo systemctl restart jenkins
```

## Check Jenkins Port

```bash
sudo ss -tulpn | grep 8080
```

## Jenkins Workspace

```bash
cd /var/lib/jenkins/workspace/DevOps-CI-Pipeline
```

## Application Directory in Jenkins Workspace

```bash
cd /var/lib/jenkins/workspace/DevOps-CI-Pipeline/06-CI-CD/app
```

## Check Workspace Files

```bash
ls
```

Expected:

```text
pom.xml
src
target
```

## Maven Build in Jenkins Workspace

```bash
mvn clean compile
```

## Run Tests

```bash
mvn test
```

## Package Application

```bash
mvn package
```

---

# DEVOPS-055 – Docker Build

## Check Docker Version

```bash
docker --version
```

## Check Docker Service

```bash
sudo systemctl status docker
```

## Start Docker

```bash
sudo systemctl start docker
```

## Build Docker Image

Run from the `06-CI-CD` directory:

```bash
sudo docker build -t devops-build-app:1.0 .
```

## List Docker Images

```bash
sudo docker images
```

Expected image:

```text
devops-build-app:1.0
```

---

# DEVOPS-056 – Docker Run

## Run Docker Container

```bash
sudo docker run -d \
  --name devops-health-check \
  -p 8081:8081 \
  devops-build-app:1.0
```

## List Running Containers

```bash
sudo docker ps
```

## List All Containers

```bash
sudo docker ps -a
```

## Check Container Status

```bash
sudo docker inspect --format='{{.State.Status}}' devops-health-check
```

Expected:

```text
running
```

---

# DEVOPS-057 – Docker Application Verification

## Check Container Port

```bash
sudo docker ps
```

Expected:

```text
0.0.0.0:8081->8081/tcp
```

## Check Application Logs

```bash
sudo docker logs devops-health-check
```

Expected:

```text
Application started on port 8081
Health endpoint: http://localhost:8081/health
```

## Check Docker Container Details

```bash
sudo docker inspect devops-health-check
```

---

# DEVOPS-058 – Docker Hub Integration

## Login to Docker Hub

```bash
sudo docker login
```

## Tag Docker Image

```bash
sudo docker tag devops-build-app:1.0 madawamax/devops-build-app:1.0
```

## Verify Tagged Image

```bash
sudo docker images
```

Expected:

```text
devops-build-app:1.0
madawamax/devops-build-app:1.0
```

## Push Image to Docker Hub

```bash
sudo docker push madawamax/devops-build-app:1.0
```

---

# DEVOPS-059 – Full CI/CD Pipeline

## Git Status

Run from the local repository:

```bash
git status
```

## Add Changes

```bash
git add .
```

## Commit Changes

```bash
git commit -m "DEVOPS-059: Update CI/CD pipeline"
```

## Push Changes to GitHub

```bash
git push origin main
```

## Verify Remote Repository

```bash
git remote -v
```

---

# GitHub Webhook

The GitHub repository is configured with a webhook pointing to Jenkins.

Webhook endpoint:

```text
/github-webhook/
```

The Jenkins webhook URL is exposed temporarily using Cloudflare Tunnel.

---

# Cloudflare Tunnel

## Check Cloudflared Version

```bash
cloudflared --version
```

## Start Quick Tunnel

```bash
cloudflared tunnel --url http://localhost:8080
```

Cloudflare provides a temporary public URL similar to:

```text
https://example.trycloudflare.com
```

This URL can be configured in the GitHub Webhook.

## Jenkins Webhook Endpoint

```text
/github-webhook/
```

Example:

```text
https://example.trycloudflare.com/github-webhook/
```

## Stop Cloudflare Tunnel

Press:

```text
Ctrl + C
```

The quick tunnel is temporary and stops when the `cloudflared` process is terminated.

---

# Jenkins Automatic Trigger Verification

After pushing a change to GitHub:

```text
GitHub Push
     ↓
GitHub Webhook
     ↓
Cloudflare Tunnel
     ↓
Jenkins
     ↓
Automatic Build
```

Check Jenkins Build History from the Jenkins job.

---

# DEVOPS-060 – Monitoring & Health Check

## Check Docker Containers

```bash
sudo docker ps
```

## Check All Containers

```bash
sudo docker ps -a
```

## Check Application Container Status

```bash
sudo docker inspect --format='{{.State.Status}}' devops-health-check
```

Expected healthy state:

```text
running
```

---

# Health Endpoint Check

## Check Application Health

```bash
curl -i http://localhost:8081/health
```

Expected:

```text
HTTP/1.1 200 OK
UP
```

The `200 OK` response confirms that the application is responding successfully.

---

# Application Logs

```bash
sudo docker logs devops-health-check
```

Expected:

```text
Application started on port 8081
Health endpoint: http://localhost:8081/health
```

---

# Failure Detection

## Stop Application Container

```bash
sudo docker stop devops-health-check
```

## Verify Container Status

```bash
sudo docker inspect --format='{{.State.Status}}' devops-health-check
```

Expected:

```text
exited
```

## Test Health Endpoint After Failure

```bash
curl -i http://localhost:8081/health
```

Expected failure:

```text
curl: (7) Failed to connect to localhost port 8081
```

This confirms that the application failure was detected.

---

# Troubleshooting & Recovery

## Start Container Again

```bash
sudo docker start devops-health-check
```

## Verify Container Status

```bash
sudo docker inspect --format='{{.State.Status}}' devops-health-check
```

Expected:

```text
running
```

## Check Logs

```bash
sudo docker logs devops-health-check
```

## Verify Health Again

```bash
curl -i http://localhost:8081/health
```

Expected:

```text
HTTP/1.1 200 OK
UP
```

---

# Final Health Verification

The final verification consists of three checks:

### 1. Container Status

```bash
sudo docker ps
```

Result:

```text
devops-health-check
Up
```

### 2. Application Logs

```bash
sudo docker logs devops-health-check
```

Result:

```text
Application started on port 8081
Health endpoint: http://localhost:8081/health
```

### 3. HTTP Health Check

```bash
curl -i http://localhost:8081/health
```

Result:

```text
HTTP/1.1 200 OK
UP
```

---

# Complete CI/CD & Monitoring Command Flow

```text
DEVOPS-051
Java / Maven Setup
        ↓
mvn -version
        ↓
DEVOPS-052
Unit Testing
        ↓
mvn test
        ↓
DEVOPS-053
Build & Package
        ↓
mvn clean package
        ↓
DEVOPS-054
Jenkins Pipeline
        ↓
Jenkins Build
        ↓
DEVOPS-055
Docker Build
        ↓
docker build
        ↓
DEVOPS-056
Docker Run
        ↓
docker run
        ↓
DEVOPS-057
Container Verification
        ↓
docker ps
docker logs
        ↓
DEVOPS-058
Docker Hub
        ↓
docker push
        ↓
DEVOPS-059
GitHub Webhook + Jenkins
        ↓
git push
        ↓
Automatic Jenkins Build
        ↓
DEVOPS-060
Monitoring & Health Check
        ↓
curl /health
        ↓
Docker Status
        ↓
Docker Logs
        ↓
Failure Detection
        ↓
Troubleshooting
        ↓
Recovery
        ↓
HTTP 200 OK
UP
```

# Final Status

| Task       | Status      |
| ---------- | ----------- |
| DEVOPS-051 | ✅ Completed |
| DEVOPS-052 | ✅ Completed |
| DEVOPS-053 | ✅ Completed |
| DEVOPS-054 | ✅ Completed |
| DEVOPS-055 | ✅ Completed |
| DEVOPS-056 | ✅ Completed |
| DEVOPS-057 | ✅ Completed |
| DEVOPS-058 | ✅ Completed |
| DEVOPS-059 | ✅ Completed |
| DEVOPS-060 | ✅ Completed |

**Project Status: COMPLETED ✅**


sudo docker ps
sudo docker ps -a
sudo docker logs devops-health-check
sudo docker inspect --format='{{.State.Status}}' devops-health-check
curl -i http://localhost:8081/health
sudo docker stop devops-health-check
sudo docker start devops-health-check