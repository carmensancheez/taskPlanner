package com.cmst.tasksplanner.model

import com.cmst.tasksplanner.controller.dto.TaskDto

data class Task(val oid: Long, val id: String, var description: String, var assignedTo: String,
                var date: String, var status: String, var userId: String) {

    constructor(oid: Long, taskDto: TaskDto) :
            this(oid, taskDto.id, taskDto.description, taskDto.assignedTo, taskDto.date,
                taskDto.status, taskDto.userId)
}