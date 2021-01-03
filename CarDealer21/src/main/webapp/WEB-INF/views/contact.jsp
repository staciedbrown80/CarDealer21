<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Us</title>
  
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

td {
    text-align: center;
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
${success} 
 <p class="aligncenter">
 Brown Automotive Group | 14410 Manchester Road, Ballwin, MO 63011 | ph#: (636)555-2020
 <img src="resources/images/image.jpg" alt="centered image" class="center">
</p>
</body>  
</html>
