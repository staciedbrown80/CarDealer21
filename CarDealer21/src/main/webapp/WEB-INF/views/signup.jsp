<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
</head>
<body>
<jsp:include page="components/header.jsp"/>
 <div class="container">
 <h2>${msg} ${success} <span class="text-danger">${error}</span> </h2>
 <div class="col-lg-4 col-md-6 col-sm-12">
 
	 <form:form action="signup" modelAttribute="accounts" method="Post">
	 <form:input path="lname"  placeholder="Enter Last name" class="form-control"/><br>
	 <form:input path="fname"  placeholder="Enter First name" class="form-control"/><br>
	 <form:input type="email" path="email"  placeholder="Enter Email" class="form-control"/><br>
	  <form:input type="password" path="password"  placeholder="Enter Password" class="form-control"/><br>
	  <button type="submit" class="btn btn-success">submit</button>
	  
	 </form:form>
 
 
 <!-- <form action="signup" method="Post"> 
 <input type="text" name="lname" placeholder="Enter Last name" class="form-control"><br>
 <input type="text" name="fname" placeholder="Enter First name" class="form-control"><br>
 <input type="email" name="email" placeholder="Enter Email" class="form-control"><br>
 <input type="password" name="password" placeholder="Enter Password" class="form-control"><br>
 <input type="password" name="password2" placeholder="Re-Enter Password" class="form-control"><br>
 <button type="submit" class="btn btn-success">submit</button>
 </form> -->
 </div>
 </div>
</body>
</html>