<%-- 
    Document   : detalle_alumnos
    Created on : Jun 9, 2016, 4:24:16 PM
    Author     : leandro araneda
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>
<br/>
<br/>
<div class="container">
      <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >
   
   
          <div class="panel panel-info">
            <div class="panel-heading">
                <c:forEach items="${listb}" var="fila">
              <h3 class="panel-title label label-default"><c:out value="${fila.per_nombre}"/> <c:out value="${fila.per_apellido}"/></h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-3 " align="center"> <img alt="User Pic" src="images/image1.png" class="img-circle img-responsive"> </div>
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information">
                    <tbody>
                      <tr>
                          <td><h5>Rut:</h5></td>
                          <td><h5><c:out value="${fila.per_rut}"/></h5></td>
                      </tr>
                      <tr>
                          <td><h5>Dirección:</h5></td>
                          <td><h5><c:out value="${fila.per_direccion}"/></h5></td>
                      </tr>
                      <tr>
                          <td><h5>N° Teléfonico:</h5></td>
                          <td><h5><c:out value="${fila.per_telefono}"/></h5></td>
                      </tr>
                   
                         <tr>
                             <tr>
                                 <td><h5>Correo:</h5></td>
                                 <td><h5><c:out value="${fila.per_correo}"/></h5></td>
                      </tr>
                        <tr>
                            <td><h5>Curso:</h5></td>
                            <td><h5><c:out value="${fila.cur_nombre}"/></h5></td>
                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
                
          </div>
        </div>
      </div>
    </div>
<jsp:include page="footer.jsp"/>
