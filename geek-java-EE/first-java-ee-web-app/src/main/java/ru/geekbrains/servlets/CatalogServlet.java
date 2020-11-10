package ru.geekbrains.servlets;

import ru.geekbrains.persist.Product;
import ru.geekbrains.persist.Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/catalog")
public class CatalogServlet extends HttpServlet {

    private Repository Repository;

    @Override
    public void init() throws ServletException {
        Repository = (Repository) getServletContext().getAttribute("Repository");
        if (Repository == null) {
            throw new ServletException("Repository not initialized");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            if (req.getServletPath().equals("/catalog")) {
                List<Product> Product = Repository.getProduct();
                req.setAttribute("header", "Catalog");
                req.setAttribute("Products", Product);
                //getServletContext().getRequestDispatcher("/page_header").include(req, resp);
                getServletContext().getRequestDispatcher("/WEB-INF/views/catalog.jsp").forward(req, resp);
            } else if (req.getServletPath().equals("/main")) {

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
