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
        name = "Ping Test",
        urlPatterns = {"/measurement"}
)
public class Controller extends HttpServlet {
    private ConversionSet conversionSet;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
        //EmployeeDirectory employeeDirectory
               // = (EmployeeDirectory)servletContext.getAttribute("employeeDirectory");
        String fromType = request.getParameter("fromType");
        String toType = request.getParameter("toType");
        String measurementAmount = request.getParameter("amount");
        String returnType = request.getParameter("returnType");

        if (fromType == null || fromType.isEmpty() || (toType == null) || toType.isEmpty() || measurementAmount == null
                || measurementAmount.isEmpty() || returnType == null || returnType.isEmpty()) {


            servletContext.setAttribute("message",
                    "Please enter valid information");
            String url = "/error.jsp";
            response.sendRedirect(url);
        } else {

            ConvertController convertController = new ConvertController(conversionSet);
            String conversionResult = convertController.convertMeasurement();

            servletContext.setAttribute("results", conversionResult);

            String url = "/results.jsp";

            RequestDispatcher dispatcher
                    = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }
    }
}