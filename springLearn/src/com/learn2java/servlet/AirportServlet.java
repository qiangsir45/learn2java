package com.learn2java.servlet;

import com.learn2java.service.AirportService;
import com.learn2java.service.impl.AirportServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/airport")
public class AirportServlet extends HttpServlet {
    private AirportService airportService;

    @Override
    public void init() throws ServletException {
        ServletContext context = getServletContext();
        System.out.println(context);
        ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
        airportService = ac.getBean("airportService", AirportServiceImpl.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list",airportService.show());
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
