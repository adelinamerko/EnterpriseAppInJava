# Lab3 - Spring Boot Data Access with Spring Data JPA and MySQL

## Project Aim
This project is a Spring Boot application that utilizes Spring Data JPA to perform CRUD (Create, Read, Update, Delete) operations on a MySQL database.

## Step 1: Generating the Spring Boot Project
We generated a Spring Boot project using Spring Initializr with the following dependencies:
1. Spring Web
2. Spring Data JPA
3. MySQL Driver

## Step 2: Setting Up the Database
- Created a MySQL database named "library".
- Created a table named "book" with id, title, and author columns.

## Step 3: Creating the Entity
- Created a Java class named "Book" in the model package, representing the "book" table.

## Step 4: Creating the Repository
- Created a Java interface named BookRepository in the repository package that extends JpaRepository.
- JpaRepository provides basic CRUD operations for the Book entity.

## Step 5: Creating the Controller
- Created a Java class named BookController in the controller package.
- This controller class defines endpoints for CRUD operations on books.

## Step 6: Running the Application
- Run the "main" method to start the Spring Boot Application

## Step 7: Use Docker to start a MySQL container to test the Spring Boot Rest endpoints. 
- Commands we used to run MySQL conatiner are:
  1. docker run --name my-mysql-container -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:8.1
  2. docker exec -it my-mysql-container mysql -uroot -p
## Step 8: To test this CRUD application we used Postman and the results are attached below:
  
