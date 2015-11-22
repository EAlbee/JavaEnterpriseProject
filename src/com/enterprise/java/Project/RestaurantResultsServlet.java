package com.enterprise.java.Project;

import com.enterprise.java.Project.persistence.RestaurantVisitDao;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import org.apache.log4j.Logger;

/**
 * Created by Student on 10/31/2015.
 * @author   EAlbee
 */
@WebServlet(
        name = "RestaurantVisitSearchResults",
        urlPatterns = { "/RestaurantVisitSearchResults" }
)
public class RestaurantResultsServlet extends HttpServlet {
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
        logger.info("**************************************************************************");
        logger.info("RestaurantResultsServlet doGet");
        RestaurantVisitSearch restaurantVisitSearch = new RestaurantVisitSearch();
        ServletContext context = getServletContext();
        HttpSession session = request.getSession();
          //RestaurantVisitLog restaurantVisitLog = new RestaurantVisitLog();
          //Adding Dao here instead
        RestaurantVisitDao restaurantVisitDao = new RestaurantVisitDao();

        //ServletContext context = getServletContext();
        //context.setAttribute("project4Properties", properties);
        //employeeDirectory = context.getAttribute("employeeDirectory");

        //String param1 = request.getParameter("lastName");
        //EmployeeDirectory employeeDirectory = new EmployeeDirectory();



        //restaurantVisitDao = (RestaurantVisitDao)context.getAttribute("restaurantVisitDao");

        //String lastName = request.getParameter("lastName");
        //String searchID = request.getParameter("searchID");
        //String searchLastName = request.getParameter("searchLastName");

        String type = (request.getParameter("search"));
        restaurantVisitSearch.setSearchType(request.getParameter(type));
        restaurantVisitSearch.setSearchTerm(request.getParameter("searchValue"));

        if (type.equals("searchFoodItem")) {
            restaurantVisitDao.searchFoodItem(restaurantVisitSearch);
        }
        else if (type.equals("searchName")) {
            restaurantVisitDao.searchRestaurantName(restaurantVisitSearch);
       }
//
//        if (type.equals("searchID")) {
//           restaurantVisitDao.searchRestaurantVisit(restaurantVisitSearch);
//        }
//        else {
            //restaurantVisitDao.SearchEmployeeLastName(restaurantVisitSearch);
            //restaurantVisitDao.searchRestaurantVisit();
//        }
        //TEMP
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //String param1 = request.getParameter("firstName");
        logger.info("***Hey Albeeee: " + restaurantVisitSearch.getResults());
        //out.println("%%%%ALBEE" + restaurantVisitDao.searchRestaurantVisit(restaurantVisitSearch));
        logger.info("Results" + restaurantVisitSearch.VisitSearchToString());
//        session.setAttribute("term", restaurantVisitSearch.getSearchTerm());
//        session.setAttribute("type", restaurantVisitSearch.getSearchType());
        session.setAttribute("term", "ERIC");
        session.setAttribute("results", restaurantVisitSearch.getResults());

        //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/RestaurantVisitSearchResults.jsp");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/RestaurantVisitSearchAndResults.jsp");
        dispatcher.forward(request, response);
    }
}
