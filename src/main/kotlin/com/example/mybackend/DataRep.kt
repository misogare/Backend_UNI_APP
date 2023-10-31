package com.example.mybackend

class  DataRepository {
    // Simulate loading data from an API
    fun initializeCategories(): List<Category> {
        val mathCourses = initializeMathCourses()
        val econCourses = initializeEconCourses()

        return listOf(
                Category("Mathematics", mathCourses,12314124),
                Category("Economics", econCourses, 1241241245)
        )


    }

    fun initializeMathCourses(): List<Course> {
        return listOf(
                Course("Geometry", "6 weeks", "John Doe", "Learn geometry basics", "Location A"),
                Course("Algebra", "8 weeks", "Jane Smith", "Master algebraic equations", "Location B"),
                Course("Calculus", "10 weeks", "Mike Johnson", "Calculus for advanced learners", "Location C")
        )
    }

    fun initializeEconCourses(): List<Course> {
        return listOf(
                Course("Accounting", "12 weeks", "Emily Brown", "Fundamental accounting principles", "Location X"),
                Course("Economics", "8 weeks", "Chris Wilson", "Economics for beginners", "Location Y"),
                Course("Finance", "14 weeks", "Sarah Adams", "Financial management", "Location Z")
        )
    }

}