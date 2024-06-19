# SafetyNet

SafetyNet is a web application designed to provide users with notifications of alerts in their nearby region. Users can register on the website to receive timely updates about any safety concerns or alerts in their area. The application is built using React.js for the front end, Spring Boot for the back end, and MySQL for data storage.

## Features

- User Registration and Authentication
- Real-time Alert Notifications
- Responsive User Interface
- Location-based Alerts
- Admin Panel for Managing Alerts

## Technologies Used

- *Frontend:* React.js, Tailwind CSS
- *Backend:* Spring Boot
- *Database:* MySQL

## Prerequisites

- Node.js
- Java 11+
- MySQL
- Maven

## Installation

### Backend (Spring Boot)

1. Clone the repository:
   bash
   git clone https://github.com/yourusername/safetynet-backend.git
   cd safetynet-backend
   

2. Configure the MySQL database:
   Update the application.properties file in the src/main/resources directory with your MySQL database credentials.
   properties
   spring.datasource.url=jdbc:mysql://localhost:3306/safetynet
   spring.datasource.username=root
   spring.datasource.password=password
   spring.jpa.hibernate.ddl-auto=update
   

3. Build and run the application:
   bash
   mvn clean install
   mvn spring-boot:run
   

### Frontend (React.js)

1. Clone the repository:
   bash
   git clone https://github.com/yourusername/safetynet-frontend.git
   cd safetynet-frontend
   

2. Install the dependencies:
   bash
   npm install
   

3. Start the React application:
   bash
   npm start
   

## Usage

1. Navigate to http://localhost:3000 in your web browser to access the SafetyNet application.
2. Register a new account or log in with your existing credentials.
3. After logging in, you will receive real-time notifications about alerts in your nearby region.
4. Admin users can access the admin panel to manage alerts and user information.

## Project Structure

### Backend (Spring Boot)

src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── safetynet
│   │               ├── controller
│   │               ├── model
│   │               ├── repository
│   │               └── service
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com
            └── example
                └── safetynet


### Frontend (React.js)

src
├── components
├── pages
├── services
├── styles
└── App.js


## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure your code follows the project's coding standards and includes appropriate tests.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or inquiries, please contact [yourname@example.com](mailto:yourname@example.com).

---

Feel free to customize this README file according to your project's specific details and requirements.
