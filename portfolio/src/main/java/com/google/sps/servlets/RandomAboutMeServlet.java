package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/** Servlet that returns a random aboutMe information. */
@WebServlet("/random-aboutMe")
public final class RandomAboutMeServlet extends HttpServlet {

  private List<String> aboutMes;

  @Override
  public void init() {
    aboutMes = new ArrayList<>();
    
    aboutMes.add("I am Yufan Chen!");
    aboutMes.add("I am a sophomore majoring in Electronic Engineering in Peking University.");
    aboutMes.add("I love sports!");
    aboutMes.add("I don't have pets.5555");
    aboutMes.add("My favorite coffee is latte!");
    aboutMes.add("I am exactly a kitchen killer and don't like cooking.");
    aboutMes.add("I love playing baseball and table tennis!");
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String aboutMe = aboutMes.get((int) (Math.random() * aboutMes.size()));

    response.setContentType("text/html;");
    response.getWriter().println(aboutMe);
  }
}