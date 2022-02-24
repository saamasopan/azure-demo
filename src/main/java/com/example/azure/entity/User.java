package com.example.azure.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class User {

	private String userId;
	private String firstName;
	private String lastName;
	
}
