package com.noxus.draven.forth.neo4js.entity;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Person")
public class PersonEntity {

	@Id
	private final String name;

	private final Integer born;

	public PersonEntity(Integer born, String name) {
		this.born = born;
		this.name = name;
	}

	public Integer getBorn() {
		return born;
	}

	public String getName() {
		return name;
	}

}
