package com.example.quiz.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "quiz")
public class Quiz {
	
	@Id
	private Integer id;
	
	private String question;
	
	private boolean answer;
	
	private String author;

}
