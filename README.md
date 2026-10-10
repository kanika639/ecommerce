# E-Commerce Backend Application

## Project Overview
This project is an E-Commerce Backend Application developed using Java and Spring Boot. It provides REST APIs to manage products and perform CRUD operations.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST API
- PowerShell for API testing

## Project Architecture
The application follows a layered architecture:

- **Model:** Represents product data.
- **Repository:** Communicates with the database.
- **Service:** Contains business logic.
- **Controller:** Handles HTTP requests.
- **Exception:** Handles application errors.

## Database
Database Name: `ecommerce_db`

The Product entity includes:
- ID
- Name
- Price
- Quantity
- Description

## API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/products` | Get all products |
| POST | `/products` | Add a product |
| GET | `/products/{id}` | Get a product by ID |
| PUT | `/products/{id}` | Update a product |
| DELETE | `/products/{id}` | Delete a product |

## How to Run
1. Install Java and MySQL.
2. Configure the database in `application.properties`.
3. Open the project root folder in the terminal.
4. Run the application:

   `.\mvnw.cmd spring-boot:run`

5. Access the API at `http://localhost:8081/products`.

## Testing
The REST API was tested using PowerShell commands. Product creation, retrieval, updating, and deletion were tested.

## Conclusion
This project demonstrates a layered Spring Boot backend application with REST API endpoints and MySQL database integration.
