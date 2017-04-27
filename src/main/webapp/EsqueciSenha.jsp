<%-- 
    Document   : EsqueciSenha
    Created on : 25/04/2017, 21:49:48
    Author     : john
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <title>SisResolve</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">
        <script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body class="container-fluid">
        <nav class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="navbar-header navbar-right">
                </div>
            </div>
        </nav>
        <br/>
        <div  class="row">
            <div class="col-md-12">
                <form action="cadastrarContato.jsp">
                    <div class="form-group input-group-lg">
                        <input type="text" class="form-control" placeholder="Login">
                        <input type="text" class="form-control" placeholder="nome">
                        <input type="text" class="form-control" placeholder="Dica senha">
                        <div class="btn-group btn-group-justified" role="group" aria-label="...">
                            <div class="btn-group" role="group">
                                <button class="btn btn-default" type="submit">Cliente</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button class="btn btn-default" type="submit">Servidor</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
