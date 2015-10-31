package com.enterprise.java.Project;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
/**
 * Created by Student on 10/30/2015.
 */
public class RestaurantSearchServlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/RestaurantVisitSearchContent.jsp";
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        // RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/EmployeeSearch.jsp");
        // dispatcher.forward(request, response);
    }

}
