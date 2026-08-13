Jenkins CI/CD Pipeline & GitHub Integration

## 📌 Project Overview

 is a practical DevOps project focused on implementing a basic CI/CD pipeline using Jenkins and GitHub.

The project demonstrates how a developer's code change can automatically trigger a Jenkins pipeline through a GitHub Webhook.

The main objective was to understand and practically implement the workflow:

Developer → GitHub → Webhook → Jenkins → Build → Test → Deploy

---

## 🎯 Objectives

- Install and configure Jenkins on Ubuntu Server
- Configure Java required by Jenkins
- Integrate Jenkins with GitHub
- Create a Jenkins Pipeline
- Use a Jenkinsfile stored in GitHub
- Configure GitHub Webhooks
- Implement automatic Jenkins builds
- Test the complete CI/CD trigger workflow
- Troubleshoot connectivity and webhook issues

---

## 🛠 Technologies Used

| Technology | Purpose |
|---|---|
| Ubuntu Server 24.04 | DevOps server environment |
| Jenkins | CI/CD automation server |
| Git | Version control |
| GitHub | Source code repository |
| GitHub Webhook | Automatic build trigger |
| Cloudflare Tunnel | Temporary public access to Jenkins webhook |
| Java 21 | Jenkins runtime |
| Bash | Linux command-line operations |

---

## 🏗️ Architecture

```text
                    Developer
                        |
                        | git push
                        ↓
                GitHub Repository
                        |
                        | Push Event
                        ↓
                GitHub Webhook
                        |
                        ↓
              Cloudflare Tunnel
                        |
                        ↓
                Ubuntu VM
              192.168.8.150
                        |
                        ↓
                  Jenkins :8080
                        |
                        ↓
                Jenkins Pipeline
                        |
             ┌──────────┼──────────┐
             ↓          ↓          ↓
           Build       Test      Deploy
             |          |          |
             └──────────┴──────────┘
                        |
                        ↓
                     SUCCESS