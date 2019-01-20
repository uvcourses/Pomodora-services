package com.pomodora.services.Pomodoraservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pomodora.services.Pomodoraservices.beans.TaskFormBean;
import com.pomodora.services.Pomodoraservices.beans.TaskRepository;

@RestController
@RequestMapping("/")
public class TaskController {

	private final TaskRepository taskRepository;

	public TaskController(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value="/addTask", method=RequestMethod.POST )
	public TaskFormBean AddTask(@RequestBody TaskFormBean taskFormaBean) {
		
		return taskRepository.save(taskFormaBean);
		
	}
	
}
