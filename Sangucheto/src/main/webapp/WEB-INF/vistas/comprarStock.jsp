<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <c:forEach var="ingrediente" items="${stock}">


<td>${ingrediente.nombre}</td>
<td>${ingrediente.cantidad}</td>

 <form:form action="comprarStock" modelAttribute="stock" role="form" method="POST">  
  <div class="form-group">  
  	<label for="nombre">${ingrediente.nombre}</label>  
	
  	<form:input id="nombre" class="form-control"  
  	type="text" path="nombre"  
  	placeholder="ingresar nombre" value=""/>  
  </div>
  
   <button type="submit"> enviar</button>  
   </form:form>  


</c:forEach>
    
  
</body>
</html>