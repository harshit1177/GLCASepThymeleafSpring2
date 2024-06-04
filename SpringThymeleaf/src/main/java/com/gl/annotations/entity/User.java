package com.gl.annotations.entity;

import lombok.Data;

@Data
public class User {

	 public String name;
     public String email;
	 public int age;

	public User(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

}
