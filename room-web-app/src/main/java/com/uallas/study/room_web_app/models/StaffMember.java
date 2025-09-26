package com.uallas.study.room_web_app.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE")
public class StaffMember {
    @Id
    @Column(name = "EMPLOYEE_ID")
    public String id;
    @Column(name = "FIRST_NAME")
    public String firstName;
    @Column(name = "LAST_NAME")
    public String lastName;
    @Column(name = "POSITION")
    @Enumerated(EnumType.STRING)
    public Position position;

    public StaffMember() {
        this.id = UUID.randomUUID().toString();
    }

    public StaffMember(String id, String firstName, String lastName, Position position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
