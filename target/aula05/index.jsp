<html>
<link rel="stylesheet" href="style.css">
    <head>
        <title>PW1 aula05 - Atividade colaborativa</title>
    </head>
    <body>
        <div class="main">
            <h1>Formulario de soma</h1>
<%--            <a href="ShowRequestHeaders">Servlet com cabecalho de Requisicao</a>--%>
            <form method="POST" action="form.jsp">

                <p>Deseja quantos quantos Campos?</p>
                <input type="number" name="quantidade" />
                <input id="enviar-soma" type="submit" value="Enviar" />
                <p>campo de numero ou texto?</p>
                <input type="text" name="campo" />
                <input id="enviar-campo" type="submit" value="Enviar" />
            </form>
        </div>
</body>
</html>
