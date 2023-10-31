# Backend_UNI_APP
This is a backend application that provides APIs for courses and categories. It also provides APIs for user authentication.

APIs
Courses
/api/courses: Get a list of all courses.
/api/category: Get a list of all categories.
Authentication
/auth/login: Login a user.
/auth/forgotpassword: Send a reset password link to a user.
/auth/resetpassword: Reset a user's password.
How to use the APIs
Courses
To get a list of all courses, send a GET request to /api/courses. The response will be a JSON array of course objects.

To get a list of all categories, send a GET request to /api/category. The response will be a JSON array of category objects.

Authentication
To login a user, send a POST request to /auth/login with the following parameters:

username: The user's username.
password: The user's password.
The response will be a JSON object with the following properties:

successfull: A boolean value indicating whether the login was successful.
message: A string message indicating the reason for the success or failure of the login.
To send a reset password link to a user, send a GET request to /auth/forgotpassword with the following parameter:

username: The user's username.
The response will be a JSON object with the following properties:

successfull: A boolean value indicating whether the reset password link was sent successfully.
message: A string message indicating the reason for the success or failure of the reset password link.
To reset a user's password, send a POST request to /auth/resetpassword with the following parameters:

username: The user's username.
password: The user's new password.
confirmPassword: The user's new password confirmation.
The response will be a JSON object with the following properties:

successfull: A boolean value indicating whether the password reset was successful.
message: A string message indicating the reason for the success or failure of the password reset.
Example usage
Get a list of all courses
curl -X GET http://localhost:8080/api/courses

Get a list of all categories
curl -X GET http://localhost:8080/api/category

Login a user
curl -X POST http://localhost:8080/auth/login -d 'username=matt&password=1234'

Send a reset password link to a user
curl -X GET http://localhost:8080/auth/forgotpassword -d 'username=matt'

Reset a user's password
curl -X POST http://localhost:8080/auth/resetpassword -d 'username=matt&password=newpassword&confirmPassword=newpassword'
