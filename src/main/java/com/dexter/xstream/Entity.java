package com.dexter.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

@XStreamAlias("entity")
public class Entity {

    @XStreamAlias("entity name")
    private String name;
    private int number;
    private SubEntity subEntity;
    private List<SubEntity> subEntities;

    public Entity() {
    }

    public Entity(String name, int number, SubEntity subEntity, List<SubEntity> subEntities) {
        this.name = name;
        this.number = number;
        this.subEntity = subEntity;
        this.subEntities = subEntities;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", subEntity=" + subEntity +
                ", subEntities=" + subEntities +
                '}';
    }
}


