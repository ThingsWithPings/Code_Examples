package com.example.things.with.pings.lazyandeagerloading.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Viraj_107294
 * Viraj.Wickramasinghe@axiatadigitallabs.com
 * 6/4/2023
 */

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToOne(fetch = FetchType.EAGER)
    private Passport passport;

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Passport getPassport() {return passport;}
    public void setPassport(Passport passport) {this.passport = passport;}
}

