# DEVOPS-054 – Jenkins Build Pipeline

## 📌 Project Overview

 is a practical DevOps project focused on implementing a basic CI/CD pipeline using Jenkins and GitHub.

The project demonstrates how a developer's code change can automatically trigger a Jenkins pipeline through a GitHub Webhook.

The main objective was to understand and practically implement the workflow:

Developer → GitHub → Webhook → Jenkins → Build → Test → Deploy

---

## 🎯 Objectives

## 🎯 Objectives

- Create a Java 21 Maven application
- Configure Maven project structure and dependencies
- Implement a JUnit 5 unit test
- Verify the application build locally using Maven
- Integrate the Maven project with Jenkins
- Configure Jenkins Pipeline using a Jenkinsfile
- Automatically checkout source code from GitHub
- Compile the Java application using Maven
- Execute automated unit tests using JUnit
- Package the application into a JAR file
- Archive the generated JAR artifact in Jenkins
- Verify the archived artifact by downloading and executing it
- Understand the complete Jenkins build pipeline workflow
---

## 🛠 Technologies Used

## 🛠 Technologies Used

| Technology | Purpose |
|---|---|
| Ubuntu Server 24.04 | Jenkins server environment |
| Jenkins | CI/CD pipeline automation |
| Git | Version control |
| GitHub | Source code repository |
| GitHub Webhook | Automatic Jenkins build trigger |
| Cloudflare Tunnel | Temporary public access for GitHub webhook |
| Java 21 | Application and Jenkins runtime |
| Apache Maven 3.9.16 | Build and dependency management |
| JUnit 5 | Automated unit testing |
| Bash | Linux server command-line operations |
---

## 🏗️ Architecture

## 🏗 Architecture

```text
Developer
    │
    ▼
GitHub Repository
    │
    │ GitHub Webhook
    ▼
Cloudflare Tunnel
    │
    ▼
Jenkins Server
Ubuntu Server 24.04
192.168.8.150:8080
    │
    ▼
Jenkins Pipeline
    │
    ├── Checkout SCM
    │
    ├── Maven Compile
    │
    ├── Unit Test (JUnit 5)
    │
    ├── Package JAR
    │
    └── Archive Artifact
             │
             ▼
      devops-build-app-1.0-SNAPSHOT.jar

      GitHub Push
     ↓
GitHub Webhook
     ↓
Jenkins Trigger
     ↓
Checkout Source Code
     ↓
Maven Compile
     ↓
JUnit Tests
     ↓
Package JAR
     ↓
Archive Artifact
     ↓
Build SUCCESS








## 📁 Project Structure

```text
06-CI-CD/
├── README.md
├── TASK.md
├── COMMANDS.md
├── Jenkinsfile
└── app/
    ├── pom.xml
    └── src/
        ├── main/
        │   └── java/
        │       └── com/
        │           └── devops/
        │               └── App.java
        └── test/
            └── java/
                └── com/
                    └── devops/
                        └── AppTest.java


                        ## ⚙️ Pipeline Stages

| Stage | Description |
|---|---|
| Checkout SCM | Checks out the latest source code from the GitHub repository |
| Build | Compiles the Java 21 application using Maven |
| Test | Runs automated unit tests using JUnit 5 |
| Package | Packages the application into an executable JAR file |
| Archive Artifact | Stores the generated JAR file as a Jenkins build artifact |

### Jenkins Pipeline

```text
Checkout SCM
     ↓
Maven Compile
     ↓
JUnit 5 Tests
     ↓
Package JAR
     ↓
Archive Artifact
     ↓
BUILD SUCCESS






## ✅ Build Verification

The Jenkins pipeline was successfully executed and completed with a **SUCCESS** status.

### Build Results

- Jenkins Build: `#4`
- Maven Build: `BUILD SUCCESS`
- Unit Tests: `1 test passed`
- Failures: `0`
- Errors: `0`
- JAR Artifact: Successfully generated
- Artifact: `devops-build-app-1.0-SNAPSHOT.jar`
- Jenkins Artifact Archive: Successful
- Artifact Download: Successful
- JAR Execution: Successful

### Application Output

The archived JAR file was downloaded from Jenkins and executed locally using Java 21.

```text
DEVOPS-054 Build Pipeline is working!







## 📜 Jenkinsfile

The Jenkins pipeline is defined as code using a `Jenkinsfile`.

The pipeline contains the following stages:

```text
Checkout SCM
    ↓
Build
    ↓
Test
    ↓
Package
    ↓
Archive Artifact

## DEVOPS-060 - Monitoring & Health Check

- Application health check implemented
- HTTP health endpoint configured
- Application running status verified
- Docker container status and logs checked
- Basic monitoring configured
- Application failure detection tested
- Failure troubleshooting performed
- Health-check result verified