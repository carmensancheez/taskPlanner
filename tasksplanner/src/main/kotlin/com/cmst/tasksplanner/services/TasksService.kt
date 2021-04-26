package com.cmst.tasksplanner.services

import com.cmst.tasksplanner.controller.dto.TaskDto
import com.cmst.tasksplanner.model.Task

interface TasksService {

    fun save(taskDto: TaskDto): Task

    fun update(taskId: String, taskDto: TaskDto): Task

    fun findTaskById(taskId: String): Task?

    fun all(): List<Task>

    fun delete(taskId: String): Boolean

}