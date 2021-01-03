<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credit App</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 <style>
img {
  display: block;
  margin-left: auto;
  margin-right: auto;
}
</style>
  
</head>
<body>
<jsp:include page="components/header.jsp"/>

 <div class="container">
 <h2>${msg} ${success}</h2>
 <p class="aligncenter">
	<img src="http://used-cars-fergus.com/wp-content/themes/melita/images/Credit-Application-June-2011.jpg"/>
</p>
	 <!-- h5>
          PLEASE PRINT THIS FORM, FILL IT OUT, &amp; BRING IT IN FOR A CREDIT CHECK.  THANK YOU.
    </h5>-->
	
</div>
</body>
</html>
