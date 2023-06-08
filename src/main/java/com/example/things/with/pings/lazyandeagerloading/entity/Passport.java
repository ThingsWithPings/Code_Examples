package com.example.things.with.pings.lazyandeagerloading.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Viraj_107294
 * Viraj.Wickramasinghe@axiatadigitallabs.com
 * 6/4/2023
 */

@Entity
public class Passport {
    @Id
    @GeneratedValue
    private long id;
    private String number;

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}
}

