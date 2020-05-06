package com.gabrielsouzaa.resource;

import com.gabrielsouzaa.entity.Fruit;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.List;

@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FruitResource {

    @Inject
    @Channel("postFruit")
    Emitter<Fruit> fruitEmitter;

    @GET
    public List<Fruit> list() {
        return Fruit.listAll();
    }

    @POST
    public Response add(Fruit fruit) throws URISyntaxException {
        fruit.persist();
        fruitEmitter.send(fruit);
        return Response.status(201).build();
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Fruit getByName(@PathParam(value = "name") String name) {
        return Fruit.findByName(name);
    }
}