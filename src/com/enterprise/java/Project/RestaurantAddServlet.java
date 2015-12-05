package com.enterprise.java.Project;

import com.enterprise.java.Project.persistence.RestaurantVisitDao;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import org.apache.log4j.Logger;
import java.math.*;
import java.util.Date;


/**
 * Created by Student on 10/31/2015.
 * @author   EAlbee
 */
@WebServlet(
        name = "RestaurantVisitAddResults",
        urlPatterns = { "/RestaurantVisitAddResults" }
)
public class RestaurantAddServlet extends HttpServlet {
    //LOGGER
    private final Logger logger = Logger.getLogger(RestaurantResultsServlet.class);
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
        logger.info("RestaurantAddServlet doGet");

        RestaurantVisit restaurantVisit = new RestaurantVisit();
        ServletContext context = getServletContext();
        HttpSession session = request.getSession();

        RestaurantVisitDao restaurantVisitDao = new RestaurantVisitDao();

        restaurantVisit.setVisitRestaurantName(request.getParameter("name"));
        restaurantVisit.setVisitItem(request.getParameter("foodItem"));
        restaurantVisit.setVisitTotalCost(new Double(request.getParameter("cost")));
        restaurantVisit.setVisitDate((java.sql.Date) new Date(request.getParameter("date")));

        restaurantVisitDao.addRestaurantVisit(restaurantVisit);

//
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //String param1 = request.getParameter("firstName");
        //logger.info("***Hey Albeeee: " + restaurantVisitSearch.getResults());
//        session.setAttribute("term", restaurantVisitSearch.getSearchTerm());
//        session.setAttribute("type", restaurantVisitSearch.getSearchType());
        //session.setAttribute("term", "ERIC");
        session.setAttribute("name", restaurantVisit.getVisitRestaurantName());
        session.setAttribute("foodItem", restaurantVisit.getVisitItem());
        session.setAttribute("cost", restaurantVisit.getVisitTotalCost());
        session.setAttribute("date", restaurantVisit.getVisitDate());

        //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/RestaurantVisitSearchResults.jsp");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/RestaurantVisitSearchAndResults.jsp");
        dispatcher.forward(request, response);
    }
}
