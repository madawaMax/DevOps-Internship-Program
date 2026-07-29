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



