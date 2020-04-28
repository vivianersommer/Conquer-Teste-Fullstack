package com.conquer.desafio.mysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer id;
	private String firstName;
	private String lastName;
	private int numberTurm;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumberTurm() {
		return numberTurm;
	}

	public void setNumberTurm(int numberTurm) {
		this.numberTurm = numberTurm;
	}

}
