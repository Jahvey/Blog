package com.ssh.model;

import com.ssh.model.Score;

public class Student {
	
	private Long id;
	private String username;
	private String password;
	private String name;
	private String sex;
//	private Score score;


	private String description;
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

//	public void setScore(Score score) {
//		this.score = score;
//	}
//	public Score getScore() {
//		return score;
//	}
	
	
	

}
