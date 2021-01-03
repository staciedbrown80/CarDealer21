<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
 	
</head>
<body>
<jsp:include page="components/header.jsp"/>

<div class="container">
<h1>${msg}  ${success} ${list.size()} </h1>
   
    <form class="form-inline" action="customersearch" method="post" class="col-md-5">
	  <input id="searchnow" class="form-control mr-sm-2" type="text" name="name" placeholder="Name">
	  <input class="form-control mr-sm-2" type="email" name="email" placeholder="E-Mail">
	<button class="btn btn-success" type="submit">Search</button>
	</form>
	
   <table class="table table-bordered">
   <thead>
   <tr>
   <th>#</th>
   <th>Name</th>
   <th>Email</th>
   <th>Action</th>
   </tr>
   </thead>
   <tbody>
   <c:set var="k" value="0"/>
   <c:forEach var="item" items="${list}">
   <c:set var="k" value="${k+1}"/>
   <tr>
   <td>${k}.<%-- ${list.indexOf(item)+1} --%> </td>
   <td> ${item.fname} ${item.lname}</td>
   <td> ${item.email} <a href="removeaccount?email=${item.email}" ><i class="fa fa-times"></i></a></td>   
   <td> 
   <a href="deleteaccount?id=${item.id}" class="btn btn-success"><i class="fa fa-trash"></i></a>
   <a href="#" data-toggle="modal" data-target="#edits${item.id}" class="btn btn-secondary"><i class="fa fa-pencil"></i></a> 
   </td>
   </tr>
   </c:forEach>
   </tbody>
   
   </table>
   
     <c:forEach var="item" items="${list}">
       <div class="modal fade" id="edits${item.id}">
		 <div class="modal-dialog modal-md">
			 <div class="modal-content">	
				<div class="modal-header">
			        <h5 class="modal-">Edit User</h5>
			         <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>
			         </div>      
						<!-- Modal body -->
						<div class="modal-body">			    		
			    		  
			    		  <form:form action="updateUsers" modelAttribute="user" method="post">
								<div class="form-group">
									<label for="fn">Name</label>
									<form:input path="fname" value="${item.fname}"
										class="form-control" placeholder="First Name" />
									<form:input type="hidden" path="id" value="${item.id}"/>
									
								</div>
								<div class="form-group">
									<label for="lname">Last Name</label>
									<form:input path="lname" value="${item.lname}"
										class="form-control" placeholder="Last Name" />
								</div>
								
								<div>
									<button type="submit" class="btn btn-primary">
										<i class="fa fa-user"></i> Save
									</button>
									<button type="button" data-dismiss="modal" aria-label="Close"
										class="btn btn-danger">Close</button>
								</div>
							</form:form>
			    		  
			    		</div>
			       </div>
			</div>
		 </div>
	</c:forEach>    
   
   
</div>    
</body>
</html>
