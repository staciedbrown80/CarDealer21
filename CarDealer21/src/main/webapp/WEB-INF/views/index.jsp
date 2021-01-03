<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">   
<title>Home</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
img {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 25%;
}

.img-container {
  float: left;
  width: 25%;
  padding: 5px;
}

.clearfix::after {
  content: "";
  clear: both;
  display: table;
}


</style>
</head>

<body>
<jsp:include page="components/header.jsp"/>

    <h1>${msg} <%-- ${success} --%></h1>
    
   <!--  First name ${user.fname}
    Last Name ${user.lname}
    Email ${user.email} -->
<p class="aligncenter">
 <img src="resources/images/image.jpg" alt="centered image" class="center">
</p>	<!-- <img src="https://pictures.dealer.com/s/slhonda/0875/e5bb21c53aba47c0d3323d66649fd484x.jpg">-->
    
 <div class="clearfix">

   <div class="img-container">
     <img src="resources/images/Honda Accord Car.jpg" alt="HondaAccord1" style="width:425px">
    
  </div>
  <div class="img-container">
     <img src="resources/images/Honda Accord gray.jpg" alt="HondaAccord3" style="width:435px">
    
  </div>
  <div class="img-container">
     <img src="resources/images/bmw-x-series-x6-modelfinder-cosy.jpg" alt="BMWX6-3" style="width:450px">
    
  </div>
  <div class="img-container">
     <img src="resources/images/BMW_X6_USD00BMS212A021001.jpg" alt="BMWX6-2" style="width:360px">
    
  </div>  
 
</div>
   
</body>
</html>

