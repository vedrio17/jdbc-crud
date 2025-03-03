# JDBC CRUD Project

## Overview
This project demonstrates CRUD (Create, Read, Update, Delete) operations using JDBC (Java Database Connectivity) with MySQL. It provides a simple interface to interact with a MySQL database using Java.

## Features
- Establish a connection with MySQL using MySQL Connector
- Perform Create, Read, Update, and Delete operations
- Handle database transactions efficiently
- Use `PreparedStatement` to prevent SQL injection

## Technologies Used
- Java
- JDBC (Java Database Connectivity)
- MySQL
- MySQL Connector/J

## Prerequisites
Before running the project, ensure you have the following installed:
- Java Development Kit (JDK)
- MySQL Server
- MySQL Connector/J (JDBC Driver)

## Setup and Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/jdbc-crud-project.git
   ```
2. Open the project in your preferred IDE (Eclipse, IntelliJ, etc.).
3. Add MySQL Connector/J to the classpath.
4. Update database configurations in the `DatabaseConnection.java` file:
   ```java
   // Database Configuration
   private static final String URL = "jdbc:mysql://localhost:3306/your_database";
   private static final String USER = "your_username";
   private static final String PASSWORD = "your_password";
   ```
5. Run the `Main.java` file to execute the CRUD operations.

## Usage
- **Create:** Inserts new records into the database.
- **Read:** Retrieves and displays records from the database.
- **Update:** Modifies existing records.
- **Delete:** Removes records from the database.

## Example Code
### Establishing Database Connection
```java
Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
```

### Inserting Data
```java
String query = "INSERT INTO users (name, email) VALUES (?, ?)";
PreparedStatement pstmt = conn.prepareStatement(query);
pstmt.setString(1, "John Doe");
pstmt.setString(2, "john.doe@example.com");
pstmt.executeUpdate();
```

## Contributing
Feel free to contribute to this project by submitting pull requests or reporting issues.

