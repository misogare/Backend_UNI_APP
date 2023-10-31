package com.example.mybackend.controllers

import com.example.mybackend.Category
import com.example.mybackend.Course
import com.example.mybackend.DataRepository
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping


@RestController
@RequestMapping("/api/")
class CourseController {
    @GetMapping("/courses")
    fun getCourses(): List<Course> {
        return DataRepository().initializeMathCourses() + DataRepository().initializeEconCourses()
    }
    @GetMapping("/category")
    fun getcategories(): List<Category>{
        return DataRepository().initializeCategories()
    }
}