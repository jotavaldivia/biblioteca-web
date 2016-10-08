<%-- 
    Document   : registrate
    Created on : May 26, 2016, 12:03:12 AM
    Author     : leandro araneda
--%>
<jsp:include page="header.jsp"/>
<br/>
<br/>
<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
            <div class="box">
                <div class="box-icon">
                    <img src="images/1.png">
                </div>
                <div class="text-center">
                    <h4 class="text-center h3">Biblioteca</h4>
                    <p>Este sistema tiene como objetivo ayudar y agilizar el sistema de biblioteca del Colegio Cristiano de Curicó para así tener
                        una biblioteca mucho más ordenada y monitoreando los registros de pedidos de libros. </p>
                </div>
            </div>
        </div>
        
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
            <div class="box">
                <div class="box-icon">
                    <img src="images/Registrate.png">
                </div>
                <div class="text-center">
                    <h4 class="text-center h3">Registrate!</h4>
                    <p>Solo dirígete a la biblioteca de tu colegio y para que te registren en el sistema.</p>
                    <%
                if((String)session.getAttribute("nombre2")!=null){
                   %>
                    <a href="servlet_usuarios?p=7" class="btn btn-info">Crear Cuenta</a>
                    <% } %>
                </div>
            </div>
        </div>
	</div>
</div>
<jsp:include page="footer.jsp"/>