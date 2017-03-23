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
        urlPatterns = {"/ping"}
)
public class TestServlet extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String url = "/ping.jsp";

            RequestDispatcher dispatcher
                    = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }
    }