package edu.matc;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by kvang on 4/13/17.
 */
@Path("/json")
public class JsonConversion {

    @GET
    @Produces("text/html")
    public Response getPlainConversion(ConversionSet conversionSet) {

        String output = "HTML text: " + conversionSet;
        return Response.status(200).entity(output).build();
    }

    @GET
    @Produces("application/json")
    @Path("/json")
    public ConversionSet getConversionInJSON() {

        ConversionSet cs = new ConversionSet();
        cs.setFromType("cup");
        cs.setToType("teaspoon");
        cs.setMeasurementAmount(2.0);
        cs.setReturnType("json");


        return cs;
    }


    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response createProductInJSON() {

        String result = "Conversion Set created : ";
        return Response.status(201).entity(result).build();

    }
}
