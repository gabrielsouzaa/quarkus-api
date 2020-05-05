package com.gabrielsouzaa.entity;

import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class FruitDeserializer extends JsonbDeserializer<Fruit> {
    public FruitDeserializer(){
        super(Fruit.class);
    }
}
