package com.qa.main;

public class Trainer {
	private String name;
	private String grade;

	public Trainer(){
		
	}
	
	public Trainer(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setTrainerGrade(String grade) {
		this.grade = grade;
	}
}
