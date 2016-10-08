<%-- 
    Document   : registrate
    Created on : May 26, 2016, 12:03:12 AM
    Author     : leandro araneda
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>
<br/>
<br/>
<div class="containe" id="social">
	  <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <form action="servlet_usuarios?p=3" method="POST" accept-charset="utf-8" class="form"><h2><span>Regístrate</span></h2>
                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="v2" value="" class="form-control input-lg" placeholder="Nombre" required/>
                        </div>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="v3" value="" class="form-control input-lg" placeholder="Apellido" required/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                          <input type="text" name="v1" value="" class="form-control input-group-lg" placeholder="Rut" input pattern=".{12,}" required title="El rut debe tener 12 caracteres" maxlength="12"required/>
                        </div>
                        <div class="col-xs-6 col-md-6" >
                            <h4 class="label label-success">Ejemplo: 11.111.111-1</h4>
                        </div>
                    </div>
                <div>
                    <h4>Curso</h4>
                    <select name="v9">
                        <c:forEach items="${cursos}" var="dato">
                        <option value="<c:out value="${dato.cur_cod}"/>"><c:out value="${dato}"/></option>
                        </c:forEach>
                    </select>
                </div>
                <br/>
                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="v5" value="" class="form-control input-lg" placeholder="Teléfono" input pattern=".{12,}" required title="El Nº teléfonico debe tener 12 carcateres" maxlength="12"required/>
                        </div>
                        <div class="col-xs-6 col-md-6">
                            <h4 class="label label-success">(Ejemplo: +56988888888)</h4>
                        </div>
                    </div>
                    <input type="text" name="v4" value="" class="form-control input-lg" placeholder="Dirección" required/>
                    <input type="text" name="v8" value="" class="form-control input-lg" placeholder="Coreo Electrónico" required/>
                    <input type="password" name="v6" value="" class="form-control input-lg" placeholder="Password" required/>
                    <input type="password" name="v7" value="" class="form-control input-lg" placeholder="Confirmar Password" required/>
                    <button class="btn btn-lg btn-success btn-block" type="submit">Crear cuenta</button>
            </form>          
          </div>
</div>            
</div>
<jsp:include page="footer.jsp"/>
