package com.conquer.desafio.model;

public class Turm {
	private final String name;
	private final String teacher;
	private final int numberTurm;
	
	public Turm(String name,String teacher, int numberTurm) {
		this.name = name;
		this.teacher = teacher;
		this.numberTurm = numberTurm;
	}
	
	public String getName() {
		return name;
	}

	public String getTeacher() {
		return teacher;
	}

	public int getNumberTurm() {
		return numberTurm;
	}

}
