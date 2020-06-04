package com.learn2java.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/validcode")
public class ValidCodeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BufferedImage image = new BufferedImage(200,100,BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,200,100);
        List<Integer> randList = new ArrayList<Integer>();
        Random random = new Random();
        for(int i=0;i<4;i++){
            randList.add(random.nextInt(10));
        }
        graphics.setFont(new Font("宋体",Font.BOLD|Font.ITALIC,40));
        Color[] colors = new Color[]{Color.yellow,Color.red,Color.green,Color.gray,Color.pink,Color.blue};
        for(int i=0;i<randList.size();i++){
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawString(randList.get(i)+"",i*40,70+(random.nextInt(21)-10));
        }
        for (int i = 0; i <2 ; i++) {
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawLine(0,random.nextInt(101),200,random.nextInt(101));
        }
        ServletOutputStream outputStream = resp.getOutputStream();
        ImageIO.write(image,"jpg",outputStream);

        HttpSession session = req.getSession();
        session.setAttribute("code",""+randList.get(0)+randList.get(1)+randList.get(2)+randList.get(3));
    }
}
