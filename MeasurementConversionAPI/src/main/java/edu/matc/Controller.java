package edu.matc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



/**
 * Created by Kelly on 3/21/2017.
 */
@WebServlet(
        name = "Convert Measurement",
        urlPatterns = {"/measurement"}
)
public class Controller extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext servletContext = getServletContext();

        String fromType = request.getParameter("fromType");
        String toType = request.getParameter("toType");
        String amount = request.getParameter("amount");
        String returnType = request.getParameter("returnType").toLowerCase();



        if (fromType == null || fromType.isEmpty()
                || toType == null || toType.isEmpty()
                || returnType == null || returnType.isEmpty()
                || amount == null || amount.isEmpty()) {


            servletContext.setAttribute("message",
                    "Please enter valid information");
            String url = "/error.jsp";
            response.sendRedirect(url);
        } else {

            ConvertController convertController = new ConvertController();

            ConversionSet conversionSet = new ConversionSet();

            conversionSet.setFromType(fromType);
            conversionSet.setToType(toType);
            conversionSet.setMeasurementAmount(Double.parseDouble(amount));
            conversionSet.setReturnType(returnType);

            String conversionResult = convertController.convertMeasurement(conversionSet);

            servletContext.setAttribute("result", conversionResult);

            String url = "/result.jsp";

            RequestDispatcher dispatcher
                    = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }
    }
}