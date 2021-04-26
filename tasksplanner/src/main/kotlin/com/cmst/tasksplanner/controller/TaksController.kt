package com.cmst.tasksplanner.controller

import com.cmst.tasksplanner.controller.dto.TaskDto
import com.cmst.tasksplanner.exception.TaskNotFoundException
import com.cmst.tasksplanner.model.Task
import com.cmst.tasksplanner.services.TasksService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tasks")
class TasksController(@Autowired val tasksService: TasksService) {

    @PostMapping
    fun create(@RequestBody taskDto: TaskDto): Task {
        return tasksService.save(taskDto)
    }

    @GetMapping
    fun getTasks(): List<Task>? {
        return tasksService.all()
    }

    @GetMapping("/{id}")
    fun findTaskById(@PathVariable id: String): Task? {
        return tasksService.findTaskById(id) ?: throw TaskNotFoundException()
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String, @RequestBody taskDto: TaskDto): Task? {
        return tasksService.update(id, taskDto)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String): Boolean {
        return tasksService.delete(id)
    }


}