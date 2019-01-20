package com.pomodora.services.Pomodoraservices.beans;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TaskDetails")
public class TaskFormBean {
   
	private String taskid;
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskCategory() {
		return taskCategory;
	}
	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}
	public String getTaskRemarks() {
		return taskRemarks;
	}
	public void setTaskRemarks(String taskRemarks) {
		this.taskRemarks = taskRemarks;
	}
	public String getTaskTarget() {
		return taskTarget;
	}
	public void setTaskTarget(String taskTarget) {
		this.taskTarget = taskTarget;
	}
	private String taskName;
	private String taskCategory;
	private String taskRemarks;
	private String taskTarget; 
	
	
}
