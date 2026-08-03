# 🚀 Linux Web Server Administration with Nginx

# 📖 Project Overview

This project is part of my **DevOps Internship Program**.

The objective of this project is to build a strong foundation in Linux System Administration and Web Server Management using **Ubuntu Server** and **Nginx**.

Throughout this project, I completed hands-on practical tasks covering Linux administration, SSH, firewall management, Nginx configuration, Virtual Hosts (Server Blocks), and troubleshooting.

---

# 🎯 Learning Objectives

- Understand Linux Fundamentals
- Learn Linux File System
- Manage Users and Groups
- Configure File Permissions
- Configure SSH
- Manage UFW Firewall
- Install and Configure Nginx
- Host Multiple Websites using Server Blocks
- Troubleshoot Nginx Issues
- Document Practical DevOps Tasks

---

# 🛠 Technologies Used

- Ubuntu Server 24.04 LTS
- Nginx
- Git
- GitHub
- VirtualBox
- Bash

---

# 📂 Project Structure

```
01-Linux-Web-Server
│
├── README.md
├── TASK.md
├── COMMANDS.md
├── screenshots/
├── architecture/
└── interview-notes/
```

---

# 📚 Tickets Completed

| Ticket | Topic | Status |
|----------|-------------------------------|---------|
| DEVOPS-001 | Linux Introduction | ✅ |
| DEVOPS-002 | Linux File System | ✅ |
| DEVOPS-003 | Linux Commands | ✅ |
| DEVOPS-004 | Users & Groups | ✅ |
| DEVOPS-005 | File Permissions | ✅ |
| DEVOPS-006 | SSH Configuration | ✅ |
| DEVOPS-007 | UFW Firewall | ✅ |
| DEVOPS-008 | Install Nginx | ✅ |
| DEVOPS-009 | Nginx Troubleshooting | ✅ |
| DEVOPS-010 | Nginx Server Blocks (Virtual Hosts) | ✅ |

---

# 🚀 Practical Tasks Completed

## Linux Administration

- Linux Installation
- User Management
- Group Management
- Linux Commands
- File System Navigation
- File Permissions

---

## SSH

- Install OpenSSH
- Enable SSH Service
- Remote Login
- Verify SSH Status

---

## Firewall

- Install UFW
- Allow SSH
- Allow HTTP
- Allow HTTPS
- Enable Firewall

---

## Nginx

- Install Nginx
- Start Service
- Stop Service
- Restart Service
- Reload Configuration
- Test Configuration

---

## Virtual Hosts

Configured two websites on a single Ubuntu Server.

Website 1

```
company.local
```

Website 2

```
dev.company.local
```

Configured using

- Server Blocks
- sites-available
- sites-enabled
- Symbolic Links

---

# 🔍 Troubleshooting Performed

Completed practical troubleshooting for:

- Nginx Service Issues
- Configuration Errors
- Missing Semicolon
- Invalid Server Block
- Website Not Loading
- Wrong Root Directory
- Symbolic Link Problems
- Default Website Issues
- Browser Cache Issues
- Configuration Testing

Commands used

```bash
sudo nginx -t
sudo systemctl status nginx
sudo systemctl reload nginx
sudo systemctl restart nginx
sudo journalctl -u nginx
```

---

# 📂 Important Directories

```
/etc/nginx/
/etc/nginx/nginx.conf
/etc/nginx/sites-available/
/etc/nginx/sites-enabled/
/var/www/
/var/log/nginx/
```

---

# 📚 Concepts Learned

- Linux Administration
- SSH
- Firewall
- Web Server
- Apache vs Nginx
- Event Driven Architecture
- C10K Problem
- Server Blocks
- Virtual Hosts
- Document Root
- index.html
- nginx.conf
- sites-available
- sites-enabled
- Symbolic Links
- Reverse Proxy
- Troubleshooting

---

# 📸 Screenshots

Project screenshots are available inside the **screenshots/** directory.

Examples include

- Ubuntu Installation
- Linux Commands
- SSH
- Firewall
- Nginx Installation
- Nginx Default Page
- company.local
- dev.company.local
- Server Blocks Configuration
- Troubleshooting

---

# 💡 Skills Gained

- Linux System Administration
- Web Server Administration
- Nginx Configuration
- SSH
- Firewall Management
- Troubleshooting
- Git
- GitHub Documentation



# 📈 Outcome

Successfully configured an Ubuntu Server running Nginx to host multiple websites using Server Blocks while applying Linux administration, security, and troubleshooting best practices.

---

# 👨‍💻 Author

**Madawa Rajapaksha**

DevOps Engineer (Learning Journey)

GitHub:
https://github.com/madawaMax

LinkedIn:
https://www.linkedin.com/in/madawa-vishwajith-5a78112a7/