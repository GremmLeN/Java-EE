package ru.geekbrains.servlets;

import ru.geekbrains.persist.Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"", "/", "/main"})
public class MainServlet extends HttpServlet {

    private ru.geekbrains.persist.Repository Repository;

    @Override
    public void init() throws ServletException {
        Repository = (Repository) getServletContext().getAttribute("Repository");
        if (Repository == null) {
            throw new ServletException("Repository not initialized");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/views/Main_menu.jsp").forward(req, resp);
        //req.setAttribute("header", "Main");
        //getServletContext().getRequestDispatcher("/page_header").include(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
