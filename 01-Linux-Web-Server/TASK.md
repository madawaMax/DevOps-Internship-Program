# Sprint 1 - Linux Server Setup

## DEVOPS-001 - Ubuntu Server Installation

### Objective
Install Ubuntu Server in a Virtual Machine and prepare the environment for DevOps practice.

### Tasks Completed
- Installed Ubuntu Server 24.04 LTS
- Configured hostname
- Updated package repositories
- Upgraded installed packages
- Installed basic utilities (tree, unzip, zip, net-tools)
- Verified operating system information

### Status
✅ Completed

---

## DEVOPS-002 - Linux Users & Groups

### Objective
Learn Linux user and group management.

### Tasks Completed
- Created new users
- Verified user information using id
- Checked user groups
- Added user to sudo group
- Verified sudo permissions

### Status
✅ Completed

---

## DEVOPS-003 - Linux Commands

### Objective
Practice essential Linux file system commands.

### Tasks Completed
- Navigated directories
- Created directories
- Created empty files
- Renamed files
- Copied files
- Moved files
- Deleted files
- Listed hidden files
- Checked current directory
- Practiced directory navigation

### Commands Used
- pwd
- ls
- ls -la
- mkdir
- touch
- cp
- mv
- rm
- cd

### Status
✅ Completed

---

## DEVOPS-004 - File Permissions

### Objective
Understand Linux file permissions and ownership.

### Tasks Completed
- Viewed file permissions
- Changed permissions using chmod
- Changed file owner using chown
- Practiced 755 and 644 permissions
- Learned permission structure (rwx)

### Commands Used
- ls -l
- chmod
- chown

### Status
✅ Completed

---

## DEVOPS-005 - SSH Configuration

### Objective
Verify and understand SSH service.

### Tasks Completed
- Verified OpenSSH installation
- Checked SSH service status
- Verified SSH is enabled
- Connected to server using SSH
- Verified listening port

### Commands Used
- dpkg -l | grep openssh
- systemctl status ssh
- systemctl enable ssh
- systemctl is-enabled ssh
- ss -tlnp
- ssh

### Status
✅ Completed

---

## DEVOPS-006 - Firewall Configuration

### Objective
Configure Ubuntu Firewall (UFW).

### Tasks Completed
- Installed UFW
- Allowed SSH
- Allowed HTTP (80)
- Allowed HTTPS (443)
- Enabled Firewall
- Verified firewall rules

### Commands Used
- ufw status
- ufw allow OpenSSH
- ufw allow 80
- ufw allow 443
- ufw enable
- ufw status numbered

### Status
✅ Completed

---

## DEVOPS-007 - Nginx Installation

### Objective
Install and verify Nginx Web Server.

### Tasks Completed
- Installed Nginx
- Verified installation
- Started Nginx service
- Enabled service at boot
- Verified service status
- Verified listening on port 80
- Opened default Nginx page

### Commands Used
- apt install nginx
- nginx -v
- systemctl status nginx
- systemctl enable nginx
- systemctl is-enabled nginx
- ss -tlnp | grep :80

### Status
✅ Completed

---

## DEVOPS-008 - Deploy Static Website

### Objective
Deploy a custom HTML page using Nginx.

### Tasks Completed
- Navigated to /var/www/html
- Backed up default index page
- Removed default page
- Created new index.html
- Added custom HTML content
- Verified website in browser

### Commands Used
- cd /var/www/html
- cp
- rm
- nano
- cat

### Result
Successfully deployed custom static website using Nginx.

### Status
✅ Completed


---

## DEVOPS-009 - Custom Nginx Website Deployment

### Objective
Deploy a custom static website on the Nginx web server.

### Tasks Completed
- Navigated to the Nginx web root directory
- Backed up the default Nginx web page
- Removed the default index page
- Created a new custom index.html file
- Added custom HTML content
- Verified website content using cat
- Tested website successfully from the browser

### Commands Used
- pwd
- cd /var/www/html
- ls -l
- sudo cp index.nginx-debian.html index.nginx-debian.html.backup
- sudo rm index.nginx-debian.html
- sudo nano index.html
- cat index.html

### Result
Successfully deployed a custom HTML website using Nginx. The browser displayed the custom page containing:
- Welcome to XFusion Technologies
- DevOps Internship Program
- Server: Ubuntu 24.04
- Web Server: Nginx
- Configured by Madawa Rajapaksha

### Status
✅ Completed