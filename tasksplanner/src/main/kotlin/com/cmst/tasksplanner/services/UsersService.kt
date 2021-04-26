package com.cmst.tasksplanner.services


import com.cmst.tasksplanner.controller.dto.UserDto
import com.cmst.tasksplanner.model.User

interface UsersService {

    fun save(userDto: UserDto): User

    fun update(userId: String, userDto: UserDto): User

    fun findUserById(userId: String): User?

    fun all(): List<User>

    fun delete(userId: String): Boolean

}