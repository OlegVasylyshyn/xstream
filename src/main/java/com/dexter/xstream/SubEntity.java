package com.dexter.xstream;

import java.util.List;

public class SubEntity {

    private String name;
    private List<Integer> integers;
    private transient String ignore;

    public SubEntity() {
    }

    public SubEntity(String name, List<Integer> integers, String ignore) {
        this.name = name;
        this.integers = integers;
        this.ignore = ignore;
    }

    @Override
    public String toString() {
        return "SubEntity{" +
                "name='" + name + '\'' +
                ", integers=" + integers +
                ", ignore='" + ignore + '\'' +
                '}';
    }
}