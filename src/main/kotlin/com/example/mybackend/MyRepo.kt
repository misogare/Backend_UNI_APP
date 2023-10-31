package com.example.mybackend

data class Category(val name: String, val courses: List<Course>, val imageResourceId: Int, var checked: Boolean = false)
data class Course(val name: String, val duration: String, val instructor: String, val description: String, val location: String)