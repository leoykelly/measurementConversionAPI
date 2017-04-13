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
    @Path("{fromType}/{amount}/{toType}/{returnType}")
    @Produces("application/json")
    public Response getConversionInJSON(
            @PathParam("fromType") String fromType,
            @PathParam("amount") Double amount,
            @PathParam("toType") String toType,
            @PathParam("returnType") String returnType
    ) {
        ConversionSet conversionSet = new ConversionSet();
        conversionSet.setMeasurementAmount(amount);
        ConvertController convertController = new ConvertController();
        Double convertedMeasurement = convertController.checkFromTypeCategory(conversionSet);

        //KitchenMath kitchenMath = new KitchenMath();
        //kitchenMath.convertCupToTsp(amount);




        String json = "{ \"fromType\" : \"" + fromType + "\", \"amount\" : \"" + amount + "\", \"toType\" : \"" + toType + "\", \"returnType\" : \"" + returnType + "\", \"Conversion\" : \"" + convertedMeasurement + "\"}";


        return Response.status(200).entity(json).build();
    }

}
