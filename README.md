## USER TASK MANAGEMENT SERVICE - MICROSERVICE

## Architecture Overview
```bash
Client → API Gateway → User Task Service → Database
                         ↓
                    Other Microservices
```

## Tech Stack
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok

## Project Structure

## API Endpoints

## Database Configuration
```bash 
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/task_db
    username: root
    password: your_password

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```
## Author
- Swagat Murmu
- MCA Student | Full Stack Developer | Spring Boot Enthusiast


