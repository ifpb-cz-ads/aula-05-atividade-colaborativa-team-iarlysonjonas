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
  //      int quantidade = Integer.parseInt(request.getParameter("quantidade"));

                out.print("teste");
            }
        }

        //for (int i = 1; i<=quantidade; i++){
          // int valores = Integer.parseInt(request.getParameter("campo"+i));
            //soma = soma + valores;
            //out.println(soma);
        //}
        //out.println("Valor final: " + soma);

        //for (int i = 0; i<valores.length; i++){
           // soma = soma + Double.parseDouble(valores[i]);
     //   }
    
      //  out.println(soma);
    
        
        //request.setAttribute("soma", soma);
        //RequestDispatcher view = request.getRequestDispatcher("form.jsp");
        //view.forward(request, response);
 
    