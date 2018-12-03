package com.mcnz.restful.java.example;

import javax.ws.rs.*;

@Path("/") 
public class DriverLoggerService {

   MyDBClient myDB = new MyDBClient();
    
   @Path("/createtrip/") 
   @PUT 
   @Consumes("application/json") 
   public Response createTrip(Trip trip) { 
         if (trip.ID exists in database) {
            return exists
         } else {
            put this trip into database  
         }
         return succeeded
   } 
 
   @Path("/updatetrip/{trip:\\d+}/") 
   @POST 
   @Consumes("application/json") 
   public Response updateTrip(Trip trip
                             @PathParam("trip") int tripID) { 
        if (trip.ID NOT exists in database) {
            return NOT exists
         } else {
            1. get this trip from database
            2. update this trip
            3. put it back to the database
         }
         return succeeded
   } 
 
   @Path("/driver/{id:\\d+}/") 
   @DELETE 
   public Response deleteDriver(@PathParam("id")  int id) { 
       ...... 
   } 
 
   @Path("/driver/{id:\\d+}/") 
   @GET 
   @Produces("application/json") 
   public Driver getPerson(@PathParam("id") int id) { 
       Driver dr = myDB.getDriver(id);
       
       return dr
   } 
   
   @Path("/trip/{id:\\d+}/") 
   @GET 
   @Produces("application/json") 
   public Trip getTrip(@PathParam("id") int id) { 
       Trip tp = myDB.getTrip(id);
       
       return tp
   } 
   
   @Path("/trips/{beginDate:\\d{4}-\\d{2}-\\d{2}},{endDate:\\d{4}-\\d{2}-\\d{2}}/") 
   @GET 
   @Produces("application/json") 
   public Account[] getTripsByDateBetween(
      @PathParam("beginDate") String beginDate,
      @PathParam("endDate") String endDate) throws ParseException { 
       Trip[] tps = myDB.findTrips(String beginDate, String endDate);
       return tps;
   } 

}
