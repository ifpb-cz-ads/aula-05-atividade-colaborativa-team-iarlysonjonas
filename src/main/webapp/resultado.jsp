<%@ page import="java.util.*" %>

<html>
<body>
<h2>Hello</h2>

<%

String resultado =request.getParameter("resultadofinal");
    out.print( "<p>"+ resultado  +"</p><br>" );

%>


<br>

</body>
</html>
