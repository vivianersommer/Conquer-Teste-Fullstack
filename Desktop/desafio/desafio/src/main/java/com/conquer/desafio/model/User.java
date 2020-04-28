package com.conquer.desafio.model;

public class User {
	
	private final String firstName;
	private final String lastName;
	private final int numberTurm;
	
	public User(String firstName,String lastName, int numberTurm) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.numberTurm = numberTurm;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getNumberTurm() {
		return numberTurm;
	}

}
