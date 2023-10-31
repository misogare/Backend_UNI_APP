# Backend_UNI_APP

Backend_UNI_APP is a backend application that provides a set of APIs for managing courses, categories, and user authentication. This application serves as the backend for the Uni_app_template Android application.

## APIs

### Courses
- **GET /api/courses**: Retrieve a list of all available courses.

### Categories
- **GET /api/category**: Retrieve a list of all categories.

### Authentication
- **POST /auth/login**: Authenticate a user by providing their username and password.
- **GET /auth/forgotpassword**: Send a reset password link to a user.
- **POST /auth/resetpassword**: Reset a user's password.

## How to Use the APIs

### Courses
- To retrieve a list of all courses, send a GET request to `/api/courses`. The response will be a JSON array of course objects.

### Categories
- To retrieve a list of all categories, send a GET request to `/api/category`. The response will be a JSON array of category objects.

### Authentication

#### User Login
- To authenticate a user, send a POST request to `/auth/login` with the following parameters:
  - `username`: The user's username.
  - `password`: The user's password.

- The response will be a JSON object with the following properties:
  - `successfull`: A boolean value indicating whether the login was successful.
  - `message`: A string message indicating the reason for the success or failure of the login.

#### Forgot Password
- To send a reset password link to a user, send a GET request to `/auth/forgotpassword` with the following parameter:
  - `username`: The user's username.

- The response will be a JSON object with the following properties:
  - `successfull`: A boolean value indicating whether the reset password link was sent successfully.
  - `message`: A string message indicating the reason for the success or failure of the reset password link.

#### Reset Password
- To reset a user's password, send a POST request to `/auth/resetpassword` with the following parameters:
  - `username`: The user's username.
  - `password`: The user's new password.
  - `confirmPassword`: The user's new password confirmation.

- The response will be a JSON object with the following properties:
  - `successfull`: A boolean value indicating whether the password reset was successful.
  - `message`: A string message indicating the reason for the success or failure of the password reset.

## Example Usage

### Get a List of All Courses

```bash
curl -X GET http://localhost:8080/api/courses
```

###Get a List of All Categories
```bash
curl -X GET http://localhost:8080/api/category
```

###Login a User
```bash
curl -X POST http://localhost:8080/auth/login -d 'username=matt&password=1234'
```

###Send a Reset Password Link to a User
```bash
curl -X GET http://localhost:8080/auth/forgotpassword -d 'username=matt'
```

###Reset a User's Password
```bash
curl -X POST http://localhost:8080/auth/resetpassword -d 'username=matt&password=newpassword&confirmPassword=newpassword'
```
