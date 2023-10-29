# Product Management System - Backend
This is an inventory management system with features to add, edit, and delete a product.

Backend is built using the following tecnologies:-
```bash
    -Spring Boot
    -Spring Data JPA
    -Spring MVC
    -MySQL database
    -Hibernate
```
This project's frontend can be found in the following repository:-
```bash
https://github.com/SufiyanGolandaz/Product-Management-System-frontend
```
## API Reference

#### Get all products

```http
  GET /
```



#### Get a product

```http
  GET /{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Integer` | **Required**. Id of product to fetch |

#### Delete a product

```http
  GET /deleteProduct/{id}
  
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Integer` | **Required**. Id of product to delete |

#### Edit a product
```http
  POST /editProduct/{id}
  
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Integer` | **Required**. Id of product to edit |

#### Add new product
```http
  POST /saveProduct
  
```

## Run Locally

Clone the project

```bash
  git clone https://github.com/SufiyanGolandaz/Product-Management-System-Backend.git
```

Open the project in Eclipse/ IntelliJ


Install dependencies from Eclipse marketplace/browser

```bash
    -Maven
    -MySQL
    -Spring Tool Suite
```
Create a schema in MySQL Workbench with the following name:-
```bash
    product_management
```
#### No need to create tables, Spring will take care of that for us. 

Create application.properties file under 

```bash
  /ProductManagementSystem/src/main/resources/application.properties
```
Add following lines:-

```bash

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

spring.jpa.generate-ddl=true

spring.jpa.hibernate.ddl-auto=create

server.port=8082  //This is optional, app will run on port 8080 by default

spring.datasource.username= Give your MySQL username

spring.datasource.password= Give your MySQL password

spring.datasource.url=jdbc:mysql://localhost:3306/product_management
```
Open the following class:-
```bash
/ProductManagementSystem/src/main/java/com/springboot/backend/ProductManagementSystemApplication.java
```

Right click and run as Java application:-
![image](https://github.com/SufiyanGolandaz/Product-Management-System-Backend/assets/42806710/33dfecca-d039-47e6-bb8e-964a74cd9889)

Upon successful run, you will get following logs in console:-
![image](https://github.com/SufiyanGolandaz/Product-Management-System-Backend/assets/42806710/2df84a3e-22d5-4763-aa3e-b37d63814ab2)


### Additionally if you want a .jar file

Right click on your project
-> Select Run as->Choose Maven build
![image](https://github.com/SufiyanGolandaz/Product-Management-System-Backend/assets/42806710/132937b4-e1d6-4d2c-8dc5-df4e981c6118)


Under goals type "package" and Click on Run.
![image](https://github.com/SufiyanGolandaz/Product-Management-System-Backend/assets/42806710/b760cb8f-d4e4-44c3-81a0-ed5e085841f3)

If build is successful you will get this message in console

![image](https://github.com/SufiyanGolandaz/Product-Management-System-Backend/assets/42806710/2becfc89-0060-4bc4-8861-a8214fa713e2)






