package com.mcnz.restful.java.example;

import javax.ws.rs.*;

@Path("/") 
public class DriverLoggerService {

   MyDBClient myDB = new MyDBClient();
    
   @Path("/driver/id:\\d+}/") 
   @POST 
   @Consumes("application/json") 
   public Response createPerson(Person person) { 
       ...... 
   } 
 
   @Path("/person/") 
   @PUT 
   @Consumes("application/json") 
   public Response updatePerson(Person person) { 
       ...... 
   } 
 
   @Path("/person/{id:\\d+}/") 
   @DELETE 
   public Response deletePerson(@PathParam("id") 
   int id) { 
       ...... 
   } 
 
   @Path("/driver/{id:\\d+}/") 
   @GET 
   @Produces("application/json") 
   public Driver readPerson(@PathParam("id") int id) { 
       Driver dr = myDB.getDriver(id);
       
       return dr
   } 
   
   @Path("/trip/{id:\\d+}/") 
   @GET 
   @Produces("application/json") 
   public Trip readPerson(@PathParam("id") int id) { 
       Trip tp = myDB.getTrip(id);
       
       return tp
   } 

}
