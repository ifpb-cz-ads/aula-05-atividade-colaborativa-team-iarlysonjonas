package br.edu.ifpb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(
        urlPatterns = {"/Test"})
public class Test extends HttpServlet {
        
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter out = response.getWriter();

       
        String verificar = request.getParameter("tipo");
        String semEspacos = verificar.replaceAll(" ", "");

        out.println(verificar);

                //Texto considerando só letras.
                if(semEspacos.equals("")){
                    out.println("Campo Vazio!");
                }
                else if (semEspacos.substring(0, semEspacos.length()).matches("[A-Z]*[a-z]*")) {
                    out.println("È um campo textual!");
                }
                //Texto considerando letras com números.
                else if(semEspacos.substring(0, semEspacos.length()).matches("[0-9]*")){
                    out.println("È um campo numérico!");
                }
                else{
                   out.println("È um campo textual!");
                }
         }

}