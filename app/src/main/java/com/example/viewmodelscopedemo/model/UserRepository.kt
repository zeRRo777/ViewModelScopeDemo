package com.example.viewmodelscopedemo.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers():List<User>
    {
        delay(8000)
        val users:List<User> = listOf(
            User(1, "Pavel"),
            User(2, "Sacha"),
            User(3, "Macha"),
            User(4, "Pidr"),
        )

        return users
    }
}