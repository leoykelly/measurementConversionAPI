package edu.matc;

import javax.servlet.RequestDispatcher;
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
    String fromMeasurnment;
    String toMeasurement;
    String measurementAmount;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "/results.jsp";

        Convert converter = new Convert(fromMeasurnment, toMeasurement, measurementAmount );



        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}