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
        String[] campos = request.getParameterValues("campo");
        for (int i = 0; i <= quantidade; i++) {
            soma = soma + Integer.parseInt(campos[i]);
            int numero = i +1;
            out.println("valor " + numero + " é " + campos[i]);
            if(campos.length-1== i) {
                out.println("Valor da soma de todos é: " + soma);
            }
        }
        }
    }