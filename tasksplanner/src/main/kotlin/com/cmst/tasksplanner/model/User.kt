package com.cmst.tasksplanner.model

import com.cmst.tasksplanner.controller.dto.UserDto


data class User(val oid: Long, val id: String, var username: String, var password: String, var fullName: String,
                var email: String, var phone: String) {

    constructor(oid: Long, userDto: UserDto) :
            this(oid, userDto.id, userDto.username, userDto.password, userDto.fullName, userDto.email, userDto.phone)
}