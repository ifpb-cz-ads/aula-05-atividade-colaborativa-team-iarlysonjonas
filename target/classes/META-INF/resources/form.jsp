<%@ page import="java.util.*" %>

<html>
<body>
<h2>Hello World!</h2>
<form method="POST" action="calcularsoma">

<%
int quantidade = Integer.parseInt(request.getParameter("quantidade"));
//out.print("<input type=\"hidden\" type=\"number\" name=\"'"+ quantidade +"' \" value=\"'"+ quantidade +"' \">");
for(int i = 1; i <=quantidade; ++i){
    out.print("Campo " + i  + "<input type=\"number\" name=\"campo"+ i +" \"><br>");
}
%>

<input type="submit" value="Soma"/>

</form>




<br>

</body>
</html>
