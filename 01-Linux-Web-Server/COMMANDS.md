# Commands Used

## Update Packages

sudo apt update

## Upgrade Packages

sudo apt upgrade -y

## Install Essential Packages

sudo apt install -y git curl wget vim tree zip unzip htop net-tools



| Command  | Purpose                |
| -------- | ---------------------- |
| `pwd`    | Show current directory |
| `ls`     | List files             |
| `ls -l`  | Long listing           |
| `ls -la` | Show hidden files      |
| `cd`     | Change directory       |




| Command | Meaning                              |
| ------- | ------------------------------------ |
| `mkdir` | Make Directory                       |
| `touch` | Create empty file / update timestamp |
| `cp`    | Copy                                 |
| `mv`    | Move / Rename                        |
| `rm`    | Remove                               |
| `cat`   | Display file content                 |
| `tree`  | Show directory structure             |



| Command       | Purpose                           |
| ------------- | --------------------------------- |
| `whoami`      | Show current user                 |
| `id`          | Show user ID, group ID and groups |
| `adduser`     | Create a new user                 |
| `groups`      | Show group membership             |
| `usermod -aG` | Add user to a group               |



| Command    | Purpose                        |
| ---------- | ------------------------------ |
| `chmod`    | Change file permissions        |
| `chown`    | Change file owner              |
| `ls -l`    | Show detailed file permissions |
| `chmod +x` | Make a file executable         |


| Command                   | Purpose                          |
| ------------------------- | -------------------------------- |
| `dpkg -l \| grep openssh` | Check OpenSSH packages           |
| `systemctl status ssh`    | Check SSH service status         |
| `systemctl enable ssh`    | Enable SSH at boot               |
| `systemctl start ssh`     | Start SSH service                |
| `ss -tlnp`                | Display listening ports          |
| `ssh user@ip`             | Connect to a remote Linux server |


| Command               | Purpose               |
| --------------------- | --------------------- |
| `ufw status`          | Check firewall status |
| `ufw allow ssh`       | Allow SSH connections |
| `ufw allow 80/tcp`    | Allow HTTP traffic    |
| `ufw allow 443/tcp`   | Allow HTTPS traffic   |
| `ufw enable`          | Enable firewall       |
| `ufw status numbered` | Show firewall rules   |



sudo apt update
sudo apt install nginx -y
nginx -v
sudo systemctl status nginx
sudo systemctl enable nginx
sudo systemctl is-enabled nginx
sudo ss -tlnp | grep :80
ip a




cd /var/www/html

ls -l

sudo cp index.html index.html.backup

sudo rm index.html

sudo nano index.html

cat index.html



# DEVOPS-010 Commands

## Create Website Directories

```bash
sudo mkdir -p /var/www/company.local
sudo mkdir -p /var/www/dev.company.local
```

## Create Configuration Files

```bash
sudo nano /etc/nginx/sites-available/company.local
sudo nano /etc/nginx/sites-available/dev.company.local
```

## Enable Websites

```bash
sudo ln -s /etc/nginx/sites-available/company.local /etc/nginx/sites-enabled/

sudo ln -s /etc/nginx/sites-available/dev.company.local /etc/nginx/sites-enabled/
```

## Test Configuration

```bash
sudo nginx -t
```

## Reload Nginx

```bash
sudo systemctl reload nginx
```

## Restart Nginx

```bash
sudo systemctl restart nginx
```

## Check Service

```bash
sudo systemctl status nginx
```

## Check Enabled Sites

```bash
ls -l /etc/nginx/sites-enabled
```

## Check Server Names

```bash
sudo nginx -T | grep server_name
```

## Check Listening Port

```bash
sudo ss -tlnp | grep :80
```

## Stop Nginx

```bash
sudo systemctl stop nginx
```

## Start Nginx

```bash
sudo systemctl start nginx
```




