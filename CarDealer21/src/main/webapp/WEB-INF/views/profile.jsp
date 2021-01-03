<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style> 
table {
  column-count: 3;
  column-gap: 40px;
  column-rule: 4px double #ff00ff;
}
</style>
</head>
<body>
<jsp:include page="components/header.jsp"/>

    <h1>${msg} ${success}</h1>
    
    <table class="table table-bordered">
    <tbody>
    <tr>
    <th>First name</th>
    <td>${user.fname}</td>
    <!-- /tr>-->
    
    <th>Last name</th>
    <td>${user.lname}</td>
    
    <th>E-Mail</th>
    <td>${user.email}</td>
    
    </tr>
    </tbody>
    </table>
   
</body>
</html>


