# Microservices Architecture Project

A lightweight, scalable microservices backend designed to demonstrate distributed systems architecture, independent service deployment, and clean software design patterns.

## 📌 Features

* **Decoupled Architecture:** Services are independently built, deployable, and scalable.

* **Service-to-Service Communication:** Synchronous or asynchronous communication between services.

* **API Management:** Centralized entry point handling requests and routing.

* **Containerization Ready:** Configured for local running and containerization with Docker.

* **Clean Code & Practices:** Built following modern backend design principles and modular project structures.

## 🛠 Tech Stack

*Tools and frameworks:*

* **Languages:** Java 

* **Frameworks:** Spring Boot /

* **Database:** MySQL  

* **Messaging / Inter-Service:** REST

* **Containerization & Tools:** Docker, Docker Compose, Git, Kubernetes

## 📁 Repository Structure

```
├── accounts/            # Accounts Service
├── cards/               # Cards Service
├── loan/                # Loan Service
├── config/              # Config/Eureka Service
├── api-gateway/         # Central API Gateway / Reverse Proxy
└── docker-compose.yml   # Orchestration configuration
```

## 🔗 Endpoints & API Reference

| Service | Base URL | Description | 
| ----- | ----- | ----- | 
| **API Gateway** | `http://localhost:8080` | Entry point for all services | 
| **Service accounts** | `http://localhost:8081` | Direct service endpoint | 
| **Service cards** | `http://localhost:8082` | Direct service endpoint | 
| **Service loan** | `http://localhost:8083` | Direct service endpoint | 

## 
