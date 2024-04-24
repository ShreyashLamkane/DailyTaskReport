package com.dailytask.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("Updates")
public class Updates {
	@Id
	private int empId;
	
	private String doneToday;
	private String toBeDone;
	private String challenges;
	private String date;
	
	
	
	
}
