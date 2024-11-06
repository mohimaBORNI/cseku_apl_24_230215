# Grocery Management System

A Java-based application to manage a grocery store's inventory, orders, and customer interactions. This system provides functionalities for handling products, customers, orders, payments, and staff, with support for both online and offline payment processing.

## Features

- **Inventory Management**: Track and manage grocery items with classes for products, categories, and inventory.
- **Order Processing**: Create and manage orders, with support for both online and offline payments.
- **Customer Management**: Handle customer information and order history.
- **Staff Management**: Manage staff members who interact with the system.
- **Payment Processing**: Integrated payment processing with support for multiple payment methods.

## Project Structure

```
grocery-management-system/
├── src/
│   ├── Cart.java
│   ├── Category.java
│   ├── Customer.java
│   ├── GroceryProduct.java
│   ├── Inventory.java
│   ├── Main.java
│   ├── OfflinePayment.java
│   ├── OnlinePayment.java
│   ├── Order.java
│   ├── PaymentProcessor.java
│   ├── Product.java
│   └── Staff.java
├── README.md
└── LICENSE
```

- **src/**: Contains all Java source files for the project.
- **README.md**: Project documentation.
- **LICENSE**: Licensing information for the project.

## Class Structure

### Main Classes
- **Main**: The entry point of the application, handling initialization and program flow.
- **Customer**: Manages customer details, including order history and profile information.
- **Order**: Represents customer orders, tracking products and payment status.

### Inventory and Product Management
- **Product**: Basic properties of a product (e.g., name, price).
- **GroceryProduct**: A subclass of Product specific to grocery items.
- **Category**: Organizes products into categories for easier management.
- **Inventory**: Tracks available stock and manages product availability.

### Payment System
- **PaymentProcessor**: Core class for managing payment processing.
- **OnlinePayment**: Handles online transactions.
- **OfflinePayment**: Manages offline or in-store payments.

### Cart and Additional Functionality
- **Cart**: Allows customers to add or remove products before placing an order.
- **Staff**: Manages staff information and roles within the system.

## Getting Started

### Prerequisites
- **Java Development Kit (JDK)** 8 or above
- **IDE**: Any Java-compatible IDE (e.g., IntelliJ, Eclipse)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/tajbid-panthom/cseku_apl_24_230235/tree/main/Project%20Task%202
   ```
2. Open the project in your preferred Java IDE.
3. Compile and run the `Main.java` file.

## Usage
1. Run the `Main` class to start the application.
2. Follow on-screen prompts to add customers, manage inventory, place orders, and process payments.

## Contributing
1. Fork the repository.
2. Create your feature branch:
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. Commit your changes:
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
4. Push to the branch:
   ```bash
   git push origin feature/AmazingFeature
   ```
5. Open a pull request.


## Contact
For any inquiries, please reach out to [your-email@example.com](230235@ku.ac.bd).
