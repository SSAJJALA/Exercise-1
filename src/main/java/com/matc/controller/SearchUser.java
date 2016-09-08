package com.matc.controller;

import com.matc.entity.User;
import com.matc.persistence.UserData;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In doGet() method - Info message");
        logger.warn("In doGet() method - Warn message");

        UserData userData = new UserData();
        String type = req.getParameter("searchType");

        if (type.equals("searchAll")) {
            System.out.println(type);
            req.setAttribute("users", userData.getAllUsers());
        }   else if (type.equals("searchByName")) {
                System.out.println(type);
                String lname = req.getParameter("lname");
                req.setAttribute("users", userData.getUser(lname));
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}