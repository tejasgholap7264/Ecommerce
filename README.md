
# E-commerce Application


## Overview
I have developed an **E-commerce Application** that provides a robust backend for managing users, products, categories, carts, orders, and authentication. The project is built using **Spring Boot** and follows a clean, scalable design pattern to ensure maintainability and performance.

---

## Database Design
The application uses a relational database structure to handle all entities effectively. Below is the Entity Relationship Diagram (ERD) showcasing the database structure:

![Database Design](https://github.com/user-attachments/assets/b317d7dd-9c54-4c12-9701-4eb1cbdb769f)


---

## Features and Modules

### **1. Category Management**
I have implemented endpoints for managing categories:
- **Create a new category.**
- **Retrieve all categories with pagination and sorting.**
- **Update existing categories.**
- **Delete categories.**

### **2. Product Management**
The product module supports:
- **Adding, updating, and deleting products.**
- **Searching products by category, keywords, and seller.**
- **Updating product images with multipart file uploads.**

### **3. Authentication and Authorization**
- **User sign-up, login, and logout.**
- **Role-based access control for admin, seller, and user.**
- **JWT-based secure token authentication.**

### **4. User Address Management**
- **CRUD operations for managing user addresses.**
- **Retrieve user-specific addresses for streamlined order processing.**

### **5. Cart Operations**
- **Add products to the cart.**
- **Update product quantities.**
- **Retrieve user-specific cart details.**
- **Remove items from the cart.**

### **6. Order Processing**
- **Place orders with selected payment methods.**
- **Future scope for payment gateway integration and order tracking.**

---

## API Documentation

### **Category Endpoints**
| Method | Endpoint                              | Description                         | Request Body | Parameters              | Response           |
|--------|--------------------------------------|-------------------------------------|--------------|-------------------------|--------------------|
| POST   | `/api/admin/categories`              | Create a new category               | `CategoryDTO` | None                    | `CategoryDTO`      |
| GET    | `/api/public/categories`             | Get paginated list of categories    | None         | `pageNumber`, `pageSize`, `sortBy`, `sortOrder` | `CategoryResponse` |
| PUT    | `/api/admin/categories/{categoryId}` | Update a category                   | `CategoryDTO` | `categoryId`            | `CategoryDTO`      |
| DELETE | `/api/admin/categories/{categoryId}` | Delete a category                   | None         | `categoryId`            | `CategoryDTO`      |

### **Product Endpoints**
| Method | Endpoint                                  | Description                           | Request Body        | Parameters                          | Response            |
|--------|------------------------------------------|---------------------------------------|---------------------|-------------------------------------|---------------------|
| POST   | `/api/admin/categories/{categoryId}/product` | Add a product to a category           | `ProductDTO`        | `categoryId`                        | `ProductDTO`        |
| GET    | `/api/public/products`                   | Get all products                      | None                | `pageNumber`, `pageSize`, `sortBy`, `sortOrder` | `ProductResponse`   |
| GET    | `/api/public/categories/{categoryId}/products` | Get products by category             | None                | `categoryId`, `pageNumber`, `pageSize`, `sortBy`, `sortOrder` | `ProductResponse`   |
| GET    | `/api/public/products/keyword/{keyword}` | Search products by keyword            | None                | `keyword`, `pageNumber`, `pageSize`, `sortBy`, `sortOrder` | `ProductResponse`   |
| PUT    | `/api/product/{productId}`               | Update an existing product            | `ProductDTO`        | `productId`                         | `ProductDTO`        |
| PUT    | `/api/products/{productId}/image`        | Update product image                  | `Multipart File`    | `productId`                         | `ProductDTO`        |
| DELETE | `/api/admin/products/{productId}`        | Delete a product                      | None                | `productId`                         | Status Message      |

### **Authentication Endpoints**
| Method | Endpoint           | Description                                  | Request Body       | Parameters | Response                |
|--------|---------------------|----------------------------------------------|--------------------|------------|-------------------------|
| POST   | `/signin`           | Authenticate a user                         | `LoginRequest`     | None       | `UserInfoResponse`, `HttpStatus 200` |
| POST   | `/signup`           | Register a new user                         | `SignupRequest`    | None       | `MessageResponse`, `HttpStatus 200` |
| POST   | `/signout`          | Sign out the user (cookie-based approach)   | None               | None       | `MessageResponse`, `HttpStatus 200` |
| GET    | `/username`         | Retrieve the username of the logged-in user | None               | None       | `UserInfoResponse`, `HttpStatus 200` |
| GET    | `/user`             | Retrieve user details                       | None               | None       | `UserResponse`, `HttpStatus 200` |

### **Address Management Endpoints**
| Method | Endpoint                   | Description                                    | Request Body   | Parameters     | Response                     |
|--------|----------------------------|------------------------------------------------|----------------|----------------|------------------------------|
| POST   | `/addresses`               | Create a new address                          | `AddressDTO`   | None           | `AddressDTO`, `HttpStatus 201` |
| GET    | `/addresses`               | Retrieve all addresses                        | None           | None           | List of `AddressDTO`, `HttpStatus 200` |
| GET    | `/addresses/{addressId}`   | Retrieve an address by its ID                 | None           | `addressId`    | `AddressDTO`, `HttpStatus 200` |
| GET    | `/users/addresses`         | Retrieve all addresses for the logged-in user | None           | None           | List of `AddressDTO`, `HttpStatus 200` |
| PUT    | `/addresses/{addressId}`   | Update an existing address                    | `AddressDTO`   | `addressId`    | `AddressDTO`, `HttpStatus 200` |
| DELETE | `/addresses/{addressId}`   | Delete an address by ID                       | None           | `addressId`    | Status Message, `HttpStatus 200` |


### **Cart Module Endpoints**
| Method | Endpoint                                       | Description                                     | Request Body | Parameters                | Response       |
|--------|-----------------------------------------------|-------------------------------------------------|--------------|---------------------------|----------------|
| POST   | `/api/carts/products/{productId}/quantity/{quantity}` | Add a product with quantity to the user’s cart | None         | `productId`, `quantity`   | `CartDTO`      |
| GET    | `/api/carts`                                  | Retrieve all carts                             | None         | None                      | `CartDTO`      |
| GET    | `/api/carts/users/cart`                       | Retrieve the cart of the logged-in user        | None         | None                      | `CartDTO`      |
| PUT    | `/api/cart/products/{productId}/quantity/{operation}` | Update product quantity in the cart            | None         | `productId`, `operation`  | `CartDTO`      |
| DELETE | `/api/carts/{cartId}/product/{productId}`     | Remove a specific product from the cart        | None         | `cartId`, `productId`     | Status Message |

### **Order Endpoints**
| Method | Endpoint                                   | Description                          | Request Body        | Parameters          | Response      |
|--------|-------------------------------------------|--------------------------------------|---------------------|---------------------|---------------|
| POST   | `/order/users/payments/{paymentMethod}`    | Place an order with a payment method | `OrderRequestDTO`   | `paymentMethod`     | `OrderDTO`    |

---

## Technologies Used
- **Backend Framework**: Spring Boot
- **Database**: MySQL (with JPA/Hibernate for ORM)
- **Authentication**: Spring Security with JWT
- **Tools**: Maven, IntelliJ IDEA, Git

---

## Future Enhancements
- Integration with payment gateways like **Stripe** or **Razorpay**.
- Real-time order tracking system.
- Implementing a recommendation engine for personalized user experiences.
- Adding support for multi-language localization.

---
