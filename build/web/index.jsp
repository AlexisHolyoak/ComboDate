<%-- 
    Document   : index
    Created on : 15/04/2017, 02:25:55 PM
    Author     : peral
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dream Team</title>
        <link href="css/jquerysctipttop.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
          <style>
              body { background-color:#434A53;}
              h2 { color:#fff; margin-top:20px;}
              .form-control { display:inline; float:left; margin-right:20px;}
              .container { margin-top:150px;}
              h1 { color:#fff;}
          </style>
    </head>
    <body>
        <!--TODO: Cambiar el nombre del servlet -->
        <form method="post" action="Servlet">
             <div class="container">
                <h1>Bienvenido</h1>
                <h2>Ingresa La fecha :)</h2>
                <input type="text" id="date" data-format="DD-MM-YYYY" data-template="D MMM YYYY" name="date" value="28-02-2016" class="form-control">
                <input type="submit"  class="btn " value="Procesar"/>
             </div>
            <script src="js/jquery-1.12.1.min.js"></script>
            <script src="js/moment.min.js"></script>
            <script src="js/combodate.js"></script>
            <script>
                <!--not using datetime nor time, only date-->
            $(function(){
                $('#date').combodate({customClass: 'form-control'});    
                  $('#datetime').combodate(); 
                  $('#time').combodate({
                    firstItem: 'name', //show 'hour' and 'minute' string at first item of dropdown
                    minuteStep: 1,
                          customClass: 'form-control'
                });   
            });
            </script>
           
        </form>
    </body>
</html>
