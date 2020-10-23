package br.edu.ifpb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        urlPatterns = {"/post"})
public class Post extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        int campo1 = Integer.parseInt(request.getParameter("campo1"));
        int campo2 = Integer.parseInt(request.getParameter("campo2"));

        int subtracao = campo1 - campo2;

        out.println("a subtracao dos campos e:" + subtracao);
    }
}
