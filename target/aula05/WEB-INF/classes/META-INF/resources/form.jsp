<%@ page import="java.util.*" %>

<html>
<link rel="stylesheet" href="style.css">
<head>
    <title>PW1 aula05 - Atividade colaborativa</title>
</head>
<body>
<div class="main">
    <form method="POST" action="calcularsoma">

        <%
            int quantidade = Integer.parseInt(request.getParameter("quantidade"));
            out.print( "<p name= quantidade value= "+quantidade+" >Quantidade de campos: "+ quantidade +"</p>");
            out.print( "<input type=\"hidden\" name=\"quantidade\" value=\"" + quantidade + "\">");
            for(int i = 1; i <=quantidade; ++i){
                out.print("Campo " + i  + "<input type=\"number\" name=\"campo"+ i +" \"><br>");
            }
        %>
        <input id="somar" type="submit" value="Somar"/>
    </form>
</div>
</body>
</html>


<br>

</body>
</html>
