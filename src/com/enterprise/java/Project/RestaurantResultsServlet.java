package com.enterprise.java.Project;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


/**
 * Created by Student on 10/31/2015.
 * @author   EAlbee
 */
@WebServlet(
        name = "RestaurantVisitSearchResults",
        urlPatterns = { "/RestaurantVisitSearchResults" }
)
public class RestaurantResultsServlet extends HttpServlet {

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

        RestaurantVisitSearch restaurantVisitSearch = new RestaurantVisitSearch();
        ServletContext context = getServletContext();
        HttpSession session = request.getSession();
        RestaurantVisitLog restaurantVisitLog = new RestaurantVisitLog();

        //ServletContext context = getServletContext();
        //context.setAttribute("project4Properties", properties);
        //employeeDirectory = context.getAttribute("employeeDirectory");

        //String param1 = request.getParameter("lastName");
        //EmployeeDirectory employeeDirectory = new EmployeeDirectory();



        restaurantVisitLog = (RestaurantVisitLog)context.getAttribute("restaurantVisitLog");

        //String lastName = request.getParameter("lastName");
        //String searchID = request.getParameter("searchID");
        //String searchLastName = request.getParameter("searchLastName");

        String type = (request.getParameter("search"));
        restaurantVisitSearch.setSearchType(request.getParameter("search"));
        restaurantVisitSearch.setSearchTerm(request.getParameter("lastName"));

        if (type.equals("searchID")) {
            restaurantVisitLog.SearchEmployeeID(restaurantVisitSearch);
        }
        else {
            restaurantVisitLog.SearchEmployeeLastName(restaurantVisitSearch);

        }

        //TEMP
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //String param1 = request.getParameter("firstName");
        out.println("!!!Hey Albeeee: " + restaurantVisitSearch.getSearchTerm());
        out.println("%%%%ALBEE" + restaurantVisitSearch.getResults());

        session.setAttribute("term", restaurantVisitSearch.getSearchTerm());
        session.setAttribute("type", restaurantVisitSearch.getSearchType());
        session.setAttribute("results", restaurantVisitSearch.getResults());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/RestaurantVisitSearchResults.jsp");
        dispatcher.forward(request, response);
    }
}
