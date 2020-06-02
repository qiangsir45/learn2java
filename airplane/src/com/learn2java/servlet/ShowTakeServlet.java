package com.learn2java.servlet;

import com.learn2java.service.AirportService;
import com.learn2java.service.impl.AirportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showtake")
public class ShowTakeServlet extends HttpServlet {
    private AirportService airportService = new AirportServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("takeport",airportService.showTakePort());
        req.getRequestDispatcher("showland").forward(req,resp);
    }
}
