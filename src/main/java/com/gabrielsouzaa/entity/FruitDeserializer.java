package com.gabrielsouzaa.entity;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class FruitDeserializer extends ObjectMapperDeserializer<Fruit> {
    public FruitDeserializer(){
        super(Fruit.class);
    }
}