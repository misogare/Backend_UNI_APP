package com.example.mybackend.controllers

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/auth/")
class LoginController {
    @RequestMapping("/login",method = arrayOf(RequestMethod.GET, RequestMethod.POST)) //localhost:8080/login?username=aria&password=02440
    fun returnProjectCreators(@RequestParam(required = true, defaultValue = "") username: String, password: String ): String {
        return if (users.credential.contains(username)){
            if ( users.credential.get(username).equals(password)) "{\n" +
                    "  \"successfull\": true,\n" +
                    "  \"message\": \"Login successful\"\n" +
                    "}" else "{\n" +
                    "  \"successfull\": false,\n" +
                    "  \"message\": \"Login Failed\"\n" +
                    "}"
        }else "{\n" +
                "  \"successfull\": false,\n" +
                "  \"message\": \"your credentials are not in our database\"\n" +
                "}"
    }
    @RequestMapping("/forgotpassword")
    fun forgotPassword(@RequestParam(required = false, defaultValue = "") username: String): String {
        if (users.credential.contains(username)){
            // Send email with reset password link
            return "{\n" +
                    "  \"successfull\": true,\n" +
                    "  \"message\": \"Change the password\"\n" +
                    "}"
        } else {
            return "{\n" +
                    "  \"successfull\": false,\n" +
                    "  \"message\": \"User doesn't exist\"\n" +
                    "}"
        }
    }

    @RequestMapping("/resetpassword")
    fun resetPassword(@RequestParam("username") username: String,@RequestParam("password")password: String,@RequestParam("confirmPassword")confirmPassword: String ): String {
        if (users.credential.contains(username)){
            if (password.equals(confirmPassword)) {
                users.credential[username] = password
                return "{\n" +
                        "  \"successfull\": true,\n" +
                        "  \"message\": \"Password reset successful\"\n" +
                        "}"
            } else {
                return "{\n" +
                        "  \"successfull\": false,\n" +
                        "  \"message\": \"Passwords don't match\"\n" +
                        "}"
            }
        } else {
            return "{\n" +
                    "  \"successfull\": false,\n" +
                    "  \"message\": \"User doesn't exist\"\n" +
                    "}"
        }
    }
}
object users{
    val credential = hashMapOf("matt" to "1234","dad" to "125651")
}