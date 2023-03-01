package com.example.calculatrice.api;

import com.example.calculatrice.utilitaire.Maths;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/calculatrice")
public class CalculRessource {

    @Path("/add/n1={n1}-n2={n2}")
    @GET
    public String add(@PathParam("n1") int n1, @PathParam("n2") int n2){
        return String.format("%d + %d = %d", n1, n2, (n1+n2));
    }

    @Path("/sous/n1={n1}-n2={n2}")
    @GET
    public String sous(@PathParam("n1") int n1, @PathParam("n2") int n2){
        return String.format("%d - %d = %d", n1, n2, (n1-n2));
    }

    @Path("/multi/n1={n1}-n2={n2}")
    @GET
    public String multi(@PathParam("n1") int n1, @PathParam("n2") int n2){
        return String.format("%d * %d = %d", n1, n2, (n1*n2));
    }

    @Path("/div/n1={n1}-n2={n2}")
    @GET
    public String div(@PathParam("n1") int n1, @PathParam("n2") int n2){
        return String.format("%d / %d = %f", n1, n2, ((float)n1/(float)n2));
    }

    @Path("/fact/n1={n1}")
    @GET
    public String fact(@PathParam("n1") int n1){
        return String.format("%d! = %d ", n1, Maths.fact(n1));
    }

}
