package edu.matc;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by kvang on 4/13/17.
 */
@Path("/measurement")
public class JsonConversion {

    @GET
<<<<<<< HEAD
    @Path("/measurement")
=======
>>>>>>> 7479d9e7327a3f8beb57659c0e08b02f11baa9d5
    @Produces("application/json")
    public Response getConversionInJSON(
            @QueryParam("fromType") String fromType,
            @QueryParam("toType") String toType,
            @QueryParam("amount") Double amount,
            @QueryParam("returnType") String returnType
    ) {

        ConversionSet conversionSet = new ConversionSet();
        conversionSet.setFromType(fromType);
        conversionSet.setToType(toType);
        conversionSet.setMeasurementAmount(amount);

        ConvertController convertController = new ConvertController();
        Double convertedMeasurement = convertController.checkFromTypeCategory(conversionSet);

        //KitchenMath kitchenMath = new KitchenMath();
        //kitchenMath.convertCupToTsp(amount);

        String json = "{ \"fromType\" : \"" + conversionSet.getFromType() + "\", \"toType\" : \"" + conversionSet.getToType() + "\", \"amount\" : \"" + conversionSet.getMeasurementAmount() + "\", \"returnType\" : \"" + conversionSet.getReturnType() + "\", \"Conversion\" : \"" + convertedMeasurement + "\"}";


        return Response.status(200).entity(json).build();
    }

}
