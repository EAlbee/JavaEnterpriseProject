package com.enterprise.java.Project;

import com.beust.jcommander.JCommander;
import com.enterprise.java.Project.model.YelpAPI;
import com.enterprise.java.Project.model.TwoStepOAuth;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
//import com.enterprise.

import java.io.IOException;
import java.lang.reflect.Method;

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

        ServletContext context = getServletContext();
        HttpSession session = request.getSession();


        String term = (request.getParameter("term"));
        String location = (request.getParameter("location"));

        String[] args = new String[] {term,location};

        YelpAPI.YelpAPICLI yelpApiCli = new YelpAPI.YelpAPICLI();
        new JCommander(yelpApiCli, args);

        YelpAPI yelpApi = new YelpAPI("McniIjle69sZSxqqC9IRcA","Jw-SrN4fMc3Qtnlja83QOVfWFe0",
                "5rIIW7rOkcfUzLCN_UQGI_a6Gu1XszjH","o7khIl9s1sYFaEGHdV9i9BfUR94");


        JSONArray businesses = new JSONArray();
        YelpAPI.queryAPI(yelpApi, yelpApiCli);


        session.setAttribute("businesses", businesses);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/RestaurantVisitSearchAndResults.jsp");
        dispatcher.forward(request, response);
    }
}
