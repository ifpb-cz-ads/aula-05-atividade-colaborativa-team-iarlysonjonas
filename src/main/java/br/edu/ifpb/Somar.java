package br.edu.ifpb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(
    urlPatterns = {"/calcularsoma"})
public class Somar extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        int soma = 0;
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        for (int i = 1; i <= quantidade; ++i) {
            int campo = Integer.parseInt(request.getParameter("campo"+i));
            soma = soma + campo;
        }
        out.println(soma);
    }
}