<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"/>
<br/>
<br/>
    <form action="servlet_usuarios?p=6" method="POST">
        <fieldset>
            <legend>Borrar Alumno</legend>
            <c:forEach items="${lista}" var="fila">
                <!-- Caja de texto oculta -->
                <input type="hidden" name="v1"
                       value="<c:out value="${fila.per_rut}"/>"/>
                <h2>
                    <p>¿Seguro(a) desea borrar al alumno: 
                       <br/>
                       <c:out value="${fila.per_nombre}"/> <c:out value="${fila.per_apellido}"/> ?
                    </p>   
                </h2>
            </c:forEach>
                <input class="btn btn-danger" type="submit" value="Borrar" />
        </fieldset>
    </form>
<jsp:include page="footer.jsp"/>