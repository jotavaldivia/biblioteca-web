<%-- 
    Document   : editar
    Created on : Jun 9, 2016, 7:17:20 PM
    Author     : leandro araneda
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>
<br/>
<br/>
<div class="container">    
        <div class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <c:forEach items="${listc}" var="fila">
                            <div class="panel-title label label-default">Editar datos</div>
                        </div>  
                        <div class="panel-body" >
                            <form action="servlet_usuarios?p=10" method="POST" id="signupform" class="form-horizontal" role="form">
                                <div class="form-group">
                                    <!-- Caja de texto oculta -->
                                    <input type="hidden" name="v1"
                                    value="<c:out value="${fila.per_rut}"/>"/>
                                    
                                    <label class="col-md-3 control-label"><h5>Nombres:</h5></label>
                                    <div class="col-md-9">
                                            <input type="text" name="v2" class="form-control" value="${fila.per_nombre}" required/>
                                    </div>
                                </div>        
                                <div class="form-group">
                                    <label class="col-md-3 control-label"><h5>Apellidos:</h5></label>
                                    <div class="col-md-9">
                                        <input type="text" name="v3" class="form-control" value="${fila.per_apellido}" required/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label"><h5>Rut:</h5></label>
                                    <div class="col-md-9">
                                        <input type="text" name="v4" class="form-control" value="${fila.per_rut}" input pattern=".{12,}" required title="El rut debe tener 12 caracteres" maxlength="12" required/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label"><h5>Dirección:</h5></label>
                                    <div class="col-md-9">
                                        <input type="text" name="v5" class="form-control" value="${fila.per_direccion}" required/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label"><h5>Teléfono:</h5></label>
                                    <div class="col-md-9">
                                        <input type="text" name="v6" class="form-control" value="${fila.per_telefono}" input pattern=".{12,}" required title="El Nº teléfonico debe tener 12 carcateres" maxlength="12" required/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label"><h5>Correo:</h5></label>
                                    <div class="col-md-9">
                                        <input type="text" name="v7" class="form-control" value="${fila.per_correo}" required/>
                                    </c:forEach>
                                    </div>
                                </div>                              
                                <div>
                                    <div class="col-md-offset-3 col-md-9">
                                        <button type="submit" class="btn btn-success">Guardar cambios</button>
                                    </div>
                                </div>
                                </form>
                         </div>
                    </div>
         </div>
    </div>
<jsp:include page="footer.jsp"/>
