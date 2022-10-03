<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">

    <title>Directriz</title>
</head>
<body>
    <div  class="form-floating, container">
        <%--@elvariable id="directrizInvestigacion" type="java"--%>
        <form:form action="DirectrizInvestigacion/guardarDirectriz" method="post" modelAttribute="directrizInvestigacion">
        <label for="floatingTextarea2">Directriz de investigación</label>
        <textarea class="form-control" placeholder="Ingrese directriz" id="floatingTextarea2" style="height: 100px"></textarea>
            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-primary">Guardar</button>
            </div>
        </form:form>
    </div>
</body>
</html>