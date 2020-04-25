package com.conquer.desafio.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	
	private final UUID id;
	private final String name;
	private final int team;
	
	public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name,@JsonProperty("team") int team) {
		this.id=id;
		this.name=name;
		this.team=team;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTeam() {
		return team;
	}
}
