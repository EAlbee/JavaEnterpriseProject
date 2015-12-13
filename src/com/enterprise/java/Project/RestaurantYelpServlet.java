package com.enterprise.java.Project;

import com.beust.jcommander.JCommander;
import com.enterprise.java.Project.model.YelpAPI;
import com.enterprise.java.Project.model.TwoStepOAuth;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
//import org.json.simple.parser.
//import com.enterprise.

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by Student on 12/12/2015.
 */
@WebServlet(
        name = "RestaurantAreaSearchResults",
        urlPatterns = { "/RestaurantAreaSearchResults" }
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


        //String term = null;
        //String location = null;



        //String[] args = new String[] {term,location};



        YelpAPI.YelpAPICLI yelpApiCli = new YelpAPI.YelpAPICLI();
        logger.info("create yelpApiCli-010");
        logger.info("getParameter:term" + request.getParameter("term"));
        if (request.getParameter("term").length()  > 0) {
            //term = (request.getParameter("term"));

            yelpApiCli.setTerm(request.getParameter("term"));
            logger.info("updated term-015");
        }
        if (request.getParameter("location").length() > 0) {
            //location = (request.getParameter("location"));
            yelpApiCli.setLocation(request.getParameter("location"));
        }



        //new JCommander(yelpApiCli, args);

        YelpAPI yelpApi = new YelpAPI("McniIjle69sZSxqqC9IRcA","Jw-SrN4fMc3Qtnlja83QOVfWFe0","5rIIW7rOkcfUzLCN_UQGI_a6Gu1XszjH","o7khIl9s1sYFaEGHdV9i9BfUR94");
        //YelpAPI yelpApi = new YelpAPI();

        logger.info("new YelpAPI created");
        JSONArray businesses = new JSONArray();
        logger.info("start YelpQuery-020");
        businesses = yelpApi.queryAPI(yelpApi, yelpApiCli);
        logger.info(businesses.toString());

        session.setAttribute("businesses", businesses);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/RestaurantVisitSearchAndResults.jsp");
        dispatcher.forward(request, response);
    }
}
