package edu.matc;

import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by kvang on 4/13/17.
 */
@Path("/")
public class JsonConversion {

    private final Logger log = Logger.getLogger(this.getClass());

    @GET
    @Path("/measurement")
    @Produces("application/json")
    public Response getConversionInJSON(
            @QueryParam("fromType") String fromType,
            @QueryParam("toType") String toType,
            @QueryParam("amount") Double amount,
            @QueryParam("returnType") String returnType
    ) {
        String json = "{error}";


        if (fromType == null || fromType.isEmpty()
                || toType == null || toType.isEmpty()
                || returnType == null || returnType.isEmpty()
                || amount == null) {
            log.debug("Empty or null value: " + fromType);
            log.debug("Empty or null value: " + toType);
            log.debug("Empty or null value: " + amount);
            log.debug("Empty or null value: " + returnType);

        } else {
            ConversionSet conversionSet = new ConversionSet();

            conversionSet.setFromType(fromType);
            conversionSet.setToType(toType);
            conversionSet.setMeasurementAmount(amount);
            conversionSet.setReturnType(returnType);

            ConvertController convertController = new ConvertController();
            Double convertedMeasurement = convertController.convertMeasurement(conversionSet);


            json = "{ \"fromType\" : \"" + conversionSet.getFromType() + "\", \"toType\" : \"" + conversionSet.getToType() + "\", \"amount\" : \"" + conversionSet.getMeasurementAmount() + "\", \"returnType\" : \"" + conversionSet.getReturnType() + "\", \"Conversion\" : \"" + convertedMeasurement + "\"}";
        }

        return Response.status(200).entity(json).build();
    }

}
