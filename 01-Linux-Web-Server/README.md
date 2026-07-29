# DEVOPS-001 - Linux Production Server Setup

## Objective

Prepare an Ubuntu Server for production use.

## Environment

- OS : Ubuntu 24.04.4 LTS
- Virtualization : Oracle VirtualBox
- Host OS : Windows 11

## Sprint

Sprint 1

## Status

In Progress


## SSH Configuration

### Objective

Configure secure remote access to the Ubuntu Server.

### Commands Used

- dpkg -l | grep openssh
- systemctl status ssh
- systemctl enable ssh
- ss -tlnp
- ssh username@server-ip

### Outcome

Successfully connected to the Ubuntu Server remotely using SSH from Windows.