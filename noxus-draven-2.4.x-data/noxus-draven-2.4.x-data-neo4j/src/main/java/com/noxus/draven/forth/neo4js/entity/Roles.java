package com.noxus.draven.forth.neo4js.entity;

import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import java.util.List;

@RelationshipProperties
public class Roles {

	private final List<String> roles;

	@TargetNode
	private final PersonEntity person;

	public Roles(PersonEntity person, List<String> roles) {
		this.person = person;
		this.roles = roles;
	}

	public List<String> getRoles() {
		return roles;
	}
}
