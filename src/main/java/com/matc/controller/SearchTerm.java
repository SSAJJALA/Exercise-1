package com.matc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.matc.persistence.UserData;
import javax.servlet.RequestDispatcher;
import com.matc.entity.User;
import org.apache.log4j.Logger;

/**
 * Created by student on 9/2/16.
 */
@WebServlet(
        urlPatterns = {"/searchTerm"}
)

public class SearchTerm extends HttpServlet {
    private final Logger logger = Logger.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In doGet() from SearchTerm class - Info");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/searchTerm.jsp");
        dispatcher.forward(req, resp);
    }
}