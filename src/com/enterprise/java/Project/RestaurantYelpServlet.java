package com.enterprise.java.Project;

import com.beust.jcommander.JCommander;
import com.enterprise.java.Project.model.YelpAPI;
import com.enterprise.java.Project.model.TwoStepOAuth;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import org.apache.log4j.Logger;
//import com.enterprise.

import java.io.IOException;

/**
 * Created by Student on 12/12/2015.
 */
@WebServlet(
        name = "RestaurantVisitSearchResults",
        urlPatterns = { "/RestaurantVisitSearchResults" }
)
public class RestaurantYelpServlet  extends HttpServlet {
    private final Logger logger = Logger.getLogger(RestaurantResultsServlet.class);
    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception ServletException  if there is a Servlet failure
     *@exception IOException       if there is an IO failure
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logger.info("**************************************************************************");
        logger.info("RestaurantYelpServlet doGet");

        String[] args = new String[0];

        YelpAPICLI yelpApiCli = new YelpAPICLI();
        new JCommander(yelpApiCli, args);

        YelpAPI yelpApi = new YelpAPI("", "", "", "");
        queryAPI(yelpApi, yelpApiCli);


        ServletContext context = getServletContext();
        HttpSession session = request.getSession();


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/RestaurantVisitSearchAndResults.jsp");
        dispatcher.forward(request, response);
    }
}
