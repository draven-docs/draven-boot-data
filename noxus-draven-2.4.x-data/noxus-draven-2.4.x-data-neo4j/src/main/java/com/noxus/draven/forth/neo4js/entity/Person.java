package com.noxus.draven.forth.neo4js.entity;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * 〈功能概述〉<br>
 *
 * @className: Person
 * @package: com.noxus.draven.neo4js.entity
 * @author: draven
 * @date: 2020/12/1 16:08
 */
@Node("Person1")
public class Person {
    @Id
    @GeneratedValue(generatorRef="")
    //默认策略
    //(GeneratedValue.InternalIdGenerator.class)
    //UUID策略
    //(GeneratedValue.UUIDGenerator.class)
    private Long id;
    @Property
    private final String lastname;
    @Property
    private final String firstname;


    public Person(Long id, String lastname, String firstname) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public Person(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
