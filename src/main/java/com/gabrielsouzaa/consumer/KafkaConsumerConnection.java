package com.gabrielsouzaa.consumer;

import com.gabrielsouzaa.entity.Fruit;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class KafkaConsumerConnection {

    @Incoming("topico01")
    @Outgoing("topico02")
    public Fruit process(Fruit fruit) {
        return fruit;
    }

}