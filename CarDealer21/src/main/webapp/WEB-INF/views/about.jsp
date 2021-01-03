<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <style>
img {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 35%
}
</style>
</head>
<body>
<jsp:include page="components/header.jsp"/>

 <div class="container">
<p class="aligncenter">
 <img src="resources/images/image.jpg" alt="centered image" class="center">
</p> 
 <h2>${msg} ${success}</h2>
     <h5>We are Brown Automotive Group, the #1 Dealership in Missouri!</h5>  
           <p>We are a different kind of car dealer at Brown Automotive Group.  We have simple, no-haggle pricing, professional sales people and a low-pressure sales approach.</p>                                                                                                        
     <h5> We Can Finance Anybody!</h5>
           <p>We would like to thank you for visiting our website and considering our dealership for the purchase of your next vehicle. It is our goal to provide you with an excellent purchase and ownership experience.</p>       
    
	
</div>
</body>
</html>
