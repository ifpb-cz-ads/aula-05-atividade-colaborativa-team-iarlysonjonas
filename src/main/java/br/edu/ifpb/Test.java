package br.edu.ifpb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Test extends HttpServlet {
        
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter out = response.getWriter();

       
        String verificar = request.getParameter("tipo");
        String semEspacos = verificar.replaceAll(" ", "");
        out.println(semEspacos);
        out.println("Quantidade de caracteres na frase: " + semEspacos.length());
        
        

        //request.setAttribute("testcampo", verificar);
        //response.setContentType("text/html");
        out.println(verificar);
        
        //RequestDispatcher view = request.getRequestDispatcher("resultado.jsp");
        //view.forward(request, response);

            String resultado = "È um campo textual";
                out.println(resultado);

                if (!semEspacos.substring(0, semEspacos.length()).matches("[a-z]*")) {
                }
    
                if(!semEspacos.substring(3).matches("[0-9]*")){
                  }          
                //request.setAttribute("testcampo", resultado);
                //RequestDispatcher view = request.getRequestDispatcher("resultado.jsp");
                //view.forward(request, response);
                            
         }

}
             
    

    

