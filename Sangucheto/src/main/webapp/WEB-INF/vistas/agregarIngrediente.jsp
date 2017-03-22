    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
        pageEncoding="ISO-8859-1"%>    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="agregado" modelAttribute="ingrediente" role="form" method="POST">  
  <div class="form-group">  
  	<label for="nombre">Nombre</label>  
	
  	<form:input id="nombre" class="form-control"  
  	type="text" path="nombre"  
  	placeholder="ingresar nombre"/>  
  </div>
  <div class="form-group">
  <label for="precio">Precio</label>  
	
  	<form:input id="precio" class="form-control"  
  	type="number" path="precio"  
  	placeholder="ingresar precio"/>  
  </div>
  <div class="form-group">
  <label for="tipo">tipo</label>  
	
   	<select name="tipo" >  
  	  <option>INGREDIENTE</option>
  	  <option>CONDIMENTO</option>
  	
  	</select>  
  </div>  
   <button type="submit"> enviar</button>  
   </form:form>  
</body>
</html>