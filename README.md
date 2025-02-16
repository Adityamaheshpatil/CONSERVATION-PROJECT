https://sites.google.com/view/nandan-mp1-portfolio?usp=sharing
## Overview:
# 🌲 Forest Conservation Project 🌳

**An interactive platform focused on forest conservation, featuring data collection, report generation, and user engagement tools.** This project uses a **React** frontend, **Java Spring Boot** backend, and **MongoDB** database, connected through secure RESTful APIs. Users can submit and access forest data, generate reports, and manage accounts securely.

---

## 🏗️ Project Structure

- **Frontend**: Built with React to enable smooth user interaction and data visualization.
- **Backend**: Java Spring Boot handles business logic, security, and database interactions.
- **Database**: MongoDB stores and manages dynamic data related to forest conservation.

---

## 🖥️ Frontend (React) Features

### 🎨 User Interface (UI)
- **Clean and interactive UI** for easy navigation.
- **Features**: Data queries, report submission, and access to submitted reports.
- **Authentication screens** for login and registration.

### 🔍 Query System
- Search and filter forest-related data, including conservation efforts and environmental statistics.
- **Advanced filters and sorting options** to customize results.

### 📝 Report Submission
- Submit new forest conservation reports, like deforestation, illegal activities, and wildlife conservation.
- **Form validation** and error handling for accurate submissions.

### 👤 User Account Management
- **User roles**: Admin and User.
- Profile management with options to edit personal info and passwords.

### 📊 Data Visualization
- **Charts and graphs** to visualize statistics, including deforestation rates and wildlife trends.

### 🌐 Integration with Backend
- Uses **RESTful APIs** for secure data exchange with the backend.
- **JWT Authentication** for access control.

---

## 🛠️ Backend (Java Spring Boot) Features

### Core Structure
- **Controllers**: `QueryController`, `ReportController`, and `UserController` manage endpoints for various features.
- **Services**: `QueryService`, `ReportService`, and `UserService` contain business logic for processing and validation.
- **Repositories**: `QueryRepository`, `ReportRepository`, and `UserRepository` handle database interactions with MongoDB.

### Database (MongoDB)
- **User Data**: Stores profiles, secure authentication, and roles.
- **Query Data**: Environmental and conservation information available for querying.
- **Reports**: Logs forest conditions, illegal activities, and conservation efforts.

### 🔒 Security
- **JWT Authentication**: Token-based login for secure access.
- **Role-based Access Control**: Restricts features based on user roles.
- **CORS Configuration**: Secure cross-origin requests from the frontend.

---

## 📚 Key APIs

- **User Authentication API**: Handles login, registration, and token validation.
- **Query API**: Enables forest data queries from MongoDB.
- **Report API**: Submit, view, and manage reports on forest conservation.

---

## 🔒 Security and Cross-Origin Resource Sharing (CORS)
- Managed by **`CorsConfig.java`** and **`SecurityConfig.java`**, ensuring secure communication between frontend and backend with proper CORS policies.

---

## 🧪 Testing

- Basic **unit and integration tests** in `ForestConservationApplicationTests.java` verify core functionalities, including authentication, query processing, and report submission.

---

## 🚀 Workflow

1. **User Interaction**: The user navigates through the React frontend to query, submit reports, or view data.
2. **Frontend & Backend Communication**: The frontend sends API requests to the backend over HTTP, using JWT tokens for secure operations.
3. **Business Logic Execution**: The backend processes the requests, applies validation, and interacts with MongoDB.
4. **Database Operations**: MongoDB manages and retrieves data such as reports, user profiles, and query results.

---

## 📈 Conclusion
This Forest Conservation System is a comprehensive platform that empowers users to interact with forest conservation data meaningfully. It provides a **smooth user experience** with React, enforces **secure data processing** with Java Spring Boot, and uses **scalable storage** with MongoDB. Security features like JWT and CORS ensure safe, seamless communication between the frontend and backend.

---

Feel free to explore the repository, contribute, or reach out for any questions! 😊

