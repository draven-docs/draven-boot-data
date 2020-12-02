package com.noxus.draven.cassandras.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * 〈功能概述〉<br>
 *
 * @className: Person
 * @package: com.noxus.draven.cassandras.entity
 * @author: draven
 * @date: 2020/12/2 15:30
 */
@Table
public class Person {

    @Id
    private String id;
    private String firstname;
    private String lastname;

    public Person() {
    }

    public Person(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // … getters and setters omitted


    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
