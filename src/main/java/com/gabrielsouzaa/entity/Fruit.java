package com.gabrielsouzaa.entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Fruit extends PanacheMongoEntity {

    public String name;
    public String description;

    public Fruit() {
    }

    public Fruit(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static Fruit findByName(String name) {
        return find("name", name).firstResult();
    }

}