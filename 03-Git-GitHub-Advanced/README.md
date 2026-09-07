# Project 03 – Git & GitHub Advanced

## 📌 Task Objective

Implement and practice a professional Git and GitHub workflow for DevOps development.

The project focuses on repository management, branching, remote repositories, Pull Requests, merge conflict resolution, `.gitignore`, SSH authentication, and professional Git workflows.

---

## 🛠️ Technologies

* Git
* GitHub
* SSH
* Linux

---

## 🔄 Git Workflow

```text
Developer
    ↓
Feature Branch
    ↓
Commit
    ↓
Push
    ↓
Pull Request
    ↓
Code Review
    ↓
Merge
    ↓
Main Branch
```

---

## 📚 Git Skills Practiced

### Git Basics

* Initialize a Git repository
* Configure Git user information
* Check repository status
* Stage files
* Create professional commits
* View Git history using `git log`
* Compare changes using `git diff`
* Maintain a clean Git history
* Use professional commit messages

### Branch Management

* Create and switch branches
* Check the current branch
* List local branches
* Create and switch to a branch using one command
* Develop using feature branches
* Rename branches
* Delete local branches
* Delete remote branches
* Switch between `main` and feature branches

### Remote Repository

* Create and manage a GitHub repository
* Connect a local repository to GitHub
* Check remote repository URLs
* Push the `main` branch
* Push feature branches
* Track remote branches
* Use `git push -u origin <branch-name>`
* View remote branches
* Use `git fetch`
* Synchronize local and remote repositories

### Branch Synchronization

* Use `git switch`
* Use `git checkout`
* Update the `main` branch
* Fetch remote changes
* Understand local vs remote branches
* Synchronize feature branches with the latest `main`

---

## 🔀 Merge & Conflict Resolution

Practiced the complete feature branch merge workflow:

```text
Feature Branch
      ↓
Pull Request
      ↓
Review
      ↓
Merge
      ↓
Main
```

Also practiced:

* Fast-forward merges
* Non-fast-forward merges
* Intentionally creating merge conflicts
* Identifying merge conflicts
* Manually resolving conflicts
* Staging resolved files
* Completing merge commits
* Verifying merge results

---

## 🚫 .gitignore

Configured `.gitignore` to prevent unnecessary and sensitive files from being tracked.

Example rules:

```gitignore
target/
*.log
.env
.idea/
.vscode/
*.tmp
```

### Verification

Temporary files were created to verify the ignore rules:

```bash
touch test.log
touch test.tmp
```

Then:

```bash
git status
```

The files did not appear in the Git status output, confirming that the `.gitignore` rules were working correctly.

---

## 🔐 SSH Authentication

Configured SSH authentication for GitHub.

Practiced:

* Generate an SSH key pair
* Add the public key to GitHub
* Test the SSH connection
* Use SSH instead of HTTPS
* Push and pull using SSH authentication

Example remote:

```text
git@github.com:madawaMax/DevOps-Internship-Program.git
```

---

## 🐙 GitHub Workflow

Practiced a professional GitHub workflow:

1. Create a feature branch
2. Make changes
3. Commit changes
4. Push the feature branch
5. Create a Pull Request
6. Review the Pull Request
7. Merge into `main`

### Branch Protection Concepts

Studied branch protection concepts such as:

* Preventing direct changes to `main`
* Requiring Pull Requests
* Requiring code reviews
* Preventing force pushes
* Preventing branch deletion

---

## ✅ Project Outcome

Successfully practiced a professional Git and GitHub workflow suitable for DevOps development.

The project demonstrates practical knowledge of:

* Git repository management
* Branching strategies
* Remote repositories
* Pull Requests
* Merge conflict resolution
* `.gitignore`
* SSH authentication
* GitHub collaboration workflow

