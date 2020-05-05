package com.gabrielsouzaa.resource;

import com.gabrielsouzaa.entity.Fruit;
import com.gabrielsouzaa.service.FruitService;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FruitResource {

    @Inject
    FruitService fruitService;

    @Inject
    @Channel("postFruit")
    Emitter<Fruit> fruitEmitter;

    @GET
    public List<Fruit> list() {
        return fruitService.list();
    }

    @POST
    public List<Fruit> add(Fruit fruit) {
        fruitService.add(fruit);
        fruitEmitter.send(fruit);
        return list();
    }
}