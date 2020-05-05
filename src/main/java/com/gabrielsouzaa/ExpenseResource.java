package com.gabrielsouzaa;

import com.gabrielsouzaa.entity.Expense;
import com.gabrielsouzaa.service.ExpenseService;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/expenses")
public class ExpenseResource {

    @Inject
    ExpenseService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllExpensesByClientID() {
        List<Expense> expenses = service.getAllExpensesByClientID();
        return Response.ok().entity(expenses).build();
    }
    
}