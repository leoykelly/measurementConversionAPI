package edu.matc;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.IOException;


/**
 * Created by Kelly on 3/21/2017.
 */


@Path("/measurement")
public class Controller {

    String conversionResult;

    @GET
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String fromType = request.getParameter("fromType");
        String toType = request.getParameter("toType");
        String amount = request.getParameter("amount");
        String returnType = request.getParameter("returnType").toLowerCase();


        if (fromType == null || fromType.isEmpty()
                || toType == null || toType.isEmpty()
                || returnType == null || returnType.isEmpty()
                || amount == null || amount.isEmpty()) {


        } else {

            ConvertController convertController = new ConvertController();

            ConversionSet conversionSet = new ConversionSet();

            conversionSet.setFromType(fromType);
            conversionSet.setToType(toType);
            conversionSet.setMeasurementAmount(Double.parseDouble(amount));
            conversionSet.setReturnType(returnType);

            conversionResult = convertController.convertMeasurement(conversionSet);
        }
    }

        @Produces("text/plain")
        public Response getMessage() {

            return Response.status(200).entity(conversionResult).build();
        }



    }


