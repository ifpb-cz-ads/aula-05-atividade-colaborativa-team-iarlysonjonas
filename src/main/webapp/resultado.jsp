<%@ page import="java.util.*" %>

<html>
<body>
<h2>Hello</h2>

<%

String resultado = (String)request.getParameter("testcampo");
    out.print( resultado );

%>


<br>

</body>
</html>
