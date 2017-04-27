<%-- 
    Document   : Index
    Created on : 05/04/2017, 17:04:16
    Author     : john
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <title>Sis Resolve</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">
        <script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body class="container-fluid">
        <nav class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="navbar-header navbar-right">
                    <form class="navbar-form navbar-right" role="search">
                        <button type="submit" class="btn btn-default">Logar como cliente</button>
                        <div class="form-group">
                                <input type="text" class="form-control" placeholder="Login">
                        </div>
                        <div class="form-group">
                                <input type="text" class="form-control" placeholder="Senha">
                        </div>
                        <button type="submit" class="btn btn-default">Logar como servidor</button>
                        <a href="index.jsp" >Esqueci a senha</a>
                    </form>
                </div>
            </div>
        </nav>
        <div clas="">
            <br/>
            <div  class="row">
                <div class="col-md-6">
                    <p>testando</p>
                </div>
                <div class="col-md-5">
                    <form action="CadastroUsuario">
                        <div class="form-group input-group-lg">
                            <input type="text" class="form-control" placeholder="Login">
                            <input type="text" class="form-control" placeholder="senha">
                            <input type="text" class="form-control" placeholder="Confirma senha">
                            <input type="text" class="form-control" placeholder="Dica senha">
                            <input type="text" class="form-control" placeholder="nome">
                            <input type="text" class="form-control" placeholder="email">
                            <input type="text" class="form-control" placeholder="cidade">
                            <div class="btn-group btn-group-justified" role="group" aria-label="...">
                                <div class="btn-group" role="group">
                                    <button class="btn btn-default" type="submit">Criar conta Cliente</button>
                                </div>
                                <div class="btn-group" role="group">
                                    <button class="btn btn-default" type="submit">Criar conta Servidor</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            
        </div>
        
            
        
    </body>
</html>
