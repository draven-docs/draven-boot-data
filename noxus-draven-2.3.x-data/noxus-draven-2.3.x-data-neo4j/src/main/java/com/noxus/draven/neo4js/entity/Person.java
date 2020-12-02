package com.noxus.draven.neo4js.entity;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * 〈功能概述〉<br>
 *
 * @className: Person
 * @package: com.noxus.draven.neo4js.entity
 * @author: draven
 * @date: 2020/12/1 16:08
 */
@NodeEntity(label = "Person")
public class Person {
    private Long id;

    private String lastname;

    private String firstname;

    //CREATE (person:Person{id:123,lastname:"Lokesh",firstname:"firstname"})

    public void setId(Long id) {
        this.id = id;
    }

    //@Id
    public Long getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
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
