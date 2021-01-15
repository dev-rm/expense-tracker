package com.expense.tracker.expense.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="user")
public class User {

	private Long id;
	
	private String name;
	
	private String email;
}
