package com.cmst.tasksplanner.controller


import com.cmst.tasksplanner.controller.dto.UserDto
import com.cmst.tasksplanner.exception.UserNotFoundException
import com.cmst.tasksplanner.model.User
import com.cmst.tasksplanner.services.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UsersController(@Autowired val usersService: UsersService) {

    @PostMapping
    fun create(@RequestBody userDto: UserDto): User {
        return usersService.save(userDto)
    }

    @GetMapping
    fun getUsers(): List<User>? {
        return usersService.all()
    }

    @GetMapping("/{id}")
    fun findUserById(@PathVariable id: String): User? {
        return usersService.findUserById(id) ?: throw UserNotFoundException()
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String, @RequestBody userDto: UserDto): User? {
        return usersService.update(id, userDto)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String): Boolean {
        return usersService.delete(id)
    }


}