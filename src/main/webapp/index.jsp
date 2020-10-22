<html>
<link rel="stylesheet" href="style.css">
<head>
    <title>PW1 aula05 - Atividade colaborativa</title>
</head>
<body>
<div class="main">
    <a href="ShowRequestHeaders">Servlet com cabecalho de Requisicao</a>
    <h1>Formulario de soma</h1>

    <form method="POST" action="form.jsp">

        <p>Deseja quantos Campos?</p>
        <input type="number" name="quantidade" />
        <input id="enviar-soma" type="submit" value="Enviar" />
    </form>

    <form method="POST" action="Test">

        <p>campo numerico ou textual?</p>
        <input type="text" name="tipo" />
        <input id="enviar-campo" type="submit" value="Enviar" />
    </form>

    <p id="gp">Get ou Post?</p>

    <form method="get" action="get.jsp">
        <input id="enviar-get" type="submit" value="GET">
    </form>

    <form method="post" action="post.jsp">
        <input id="enviar-post" type="submit" value="POST">
    </form>
</div>
</body>
</html>
