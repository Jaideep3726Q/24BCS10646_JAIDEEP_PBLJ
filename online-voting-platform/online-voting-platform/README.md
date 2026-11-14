# 🗳 Online Voting Platform

A full-stack **Online Voting Platform** developed using **Spring Boot**, **Spring Security**, **PostgreSQL**, and **Bootstrap 5**. The application provides a secure and user-friendly interface to manage voters, candidates, voting, election results, and vote history.

---

## 📖 Overview

The Online Voting Platform is designed to digitize the election process by allowing administrators to:

* Register and manage voters
* Add, update, and remove candidates
* Cast votes securely
* View complete vote history
* Display the election winner

The project follows a layered architecture using Spring Boot, REST APIs, Hibernate (JPA), and PostgreSQL.

---

# ✨ Features

* 👤 Voter Registration
* 📋 View Registered Voters
* 🏛 Candidate Management
* 📝 Update Candidate Details
* 🗑 Delete Candidates
* 🗳 Cast Vote
* ✅ One Vote Per Voter Validation
* 📜 Vote History
* 🏆 Election Winner
* ✔ Form Validation
* 🔒 Spring Security
* 🌐 REST APIs
* 💾 PostgreSQL Database Integration
* 📱 Responsive Bootstrap UI

---

# 🛠 Tech Stack

## Backend

* Java 21
* Spring Boot 4
* Spring Web MVC
* Spring Data JPA
* Hibernate
* Spring Security
* Maven

## Frontend

* HTML5
* CSS3
* Bootstrap 5
* Bootstrap Icons
* JavaScript

## Database

* PostgreSQL 18

## Development Tools

* Eclipse IDE
* Git
* GitHub

---

# 📂 Project Structure

```text
online-voting-platform
│
├── src
│   └── main
│       ├── java
│       │   └── com.voting
│       │       ├── config
│       │       ├── controller
│       │       ├── entity
│       │       ├── exception
│       │       ├── repository
│       │       ├── service
│       │       └── OnlineVotingPlatformApplication.java
│       │
│       └── resources
│           ├── static
│           │   ├── css
│           │   ├── js
│           │   ├── index.html
│           │   ├── dashboard.html
│           │   ├── voter.html
│           │   ├── candidate.html
│           │   ├── vote.html
│           │   ├── history.html
│           │   └── winner.html
│           │
│           └── application.properties
│
├── pom.xml
├── README.md
└── screenshots
```

---

# 🚀 Getting Started

## 1. Clone the Repository

```bash
git clone https://github.com/Devaanshhh/online-voting-platform.git
```

## 2. Open the Project

Import the project into **Eclipse IDE** as a Maven project.

---

## 3. Create PostgreSQL Database

```sql
CREATE DATABASE online_voting;
```

---

## 4. Configure Database

Update your `application.properties`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/online_voting
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=9999
```

---

## 5. Run the Application

Run:

```
OnlineVotingPlatformApplication.java
```

Open:

```
http://localhost:9999
```

---

# 📋 Modules

* 🏠 Home Page
* 📊 Dashboard
* 👤 Voter Management
* 🏛 Candidate Management
* 🗳 Cast Vote
* 📜 Vote History
* 🏆 Winner Page

---

# 🌐 REST API Endpoints

## Voter

| Method | Endpoint          |
| ------ | ----------------- |
| POST   | `/voter/register` |
| GET    | `/voter`          |
| GET    | `/voter/{id}`     |
| DELETE | `/voter/{id}`     |

---

## Candidate

| Method | Endpoint          |
| ------ | ----------------- |
| POST   | `/candidate`      |
| GET    | `/candidate`      |
| GET    | `/candidate/{id}` |
| PUT    | `/candidate/{id}` |
| DELETE | `/candidate/{id}` |

---

## Vote

| Method | Endpoint                        |
| ------ | ------------------------------- |
| POST   | `/vote/{voterId}/{candidateId}` |
| GET    | `/vote`                         |
| GET    | `/vote/{id}`                    |
| GET    | `/vote/voter/{voterId}`         |
| GET    | `/vote/candidate/{candidateId}` |

---

## Winner

| Method | Endpoint  |
| ------ | --------- |
| GET    | `/winner` |

---

# ✔ CRUD Operations

| Module    | Create | Read | Update | Delete |
| --------- | :----: | :--: | :----: | :----: |
| Candidate |    ✅   |   ✅  |    ✅   |    ✅   |
| Voter     |    ✅   |   ✅  |    ❌   |    ✅   |
| Vote      |    ✅   |   ✅  |    ❌   |    ❌   |

---

# ✔ Validation

The application validates:

* Required fields
* Email format
* Password presence
* Duplicate voter registration
* One vote per voter
* Resource existence

---

# 🔒 Security

The application uses **Spring Security** with:

* HTTP Basic Authentication
* BCrypt Password Encryption
* Protected REST APIs
* Public access to frontend pages

---

# 🖼 Screenshots

## 🏠 Home Page

![Home](screenshots/home.png)

---

## 📊 Dashboard

![Dashboard](screenshots/dashboard.png)

---

## 👤 Voter Management

![Voter](screenshots/voter.png)

---

## 🏛 Candidate Management

![Candidate](screenshots/candidate.png)

---

## 🗳 Cast Vote

![Vote](screenshots/vote.png)

---

## 📜 Vote History

![History](screenshots/history.png)

---

## 🏆 Election Winner

![Winner](screenshots/winner.png)

---

# 🚀 Future Enhancements

* JWT Authentication
* Admin Login
* Voter Login
* Election Scheduling
* Candidate Photos
* Live Result Dashboard
* Charts & Analytics
* Email Notifications
* Result Export (PDF/Excel)
