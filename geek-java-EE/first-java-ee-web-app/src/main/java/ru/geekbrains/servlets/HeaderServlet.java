package ru.geekbrains.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/page_header")
public class HeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<link rel='stylesheet' href='" + req.getContextPath() + "/style.css'>");

        String header = (String) req.getAttribute("header");

        resp.getWriter().println("<h1>" + header + "</h1>");
        resp.getWriter().println("<ul>");
        resp.getWriter().println("<li><a href='"+ req.getContextPath() + "/main'>Main</a></li>");
        resp.getWriter().println("<li><a href='" + req.getContextPath() + "/catalog'>Catalog</a></li>");
        resp.getWriter().println("<li><a href='" + req.getContextPath() + "/product'>Products</a></li>");
        resp.getWriter().println("<li><a href='" + req.getContextPath() + "/cart'>Carts</a></li>");
        resp.getWriter().println("<li><a href='" + req.getContextPath() + "/order'>Orders</a></li>");
        resp.getWriter().println("</ul>");
    }
}
