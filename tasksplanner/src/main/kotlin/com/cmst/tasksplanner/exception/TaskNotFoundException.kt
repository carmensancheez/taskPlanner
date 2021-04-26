package com.cmst.tasksplanner.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus


@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Task not found")
class TaskNotFoundException: RuntimeException()