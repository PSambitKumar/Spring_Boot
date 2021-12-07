<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../css/jquery.dataTables.min.css">
    
    <script src="../../js/jquery-3.3.1.js"></script>
<script src="../../js/controller.js"></script>
<script src="../../js/jquery.dataTables.min.js"></script>
    
</head>
<body>

	<table id="example" align="center" border="2">
		<thead>
			<tr><td>Employee Id</td><td>Employee Name</td></tr>
		</thead>
		<tbody>
			<c:forEach items="${empList}" var="emp" >
				<tr>
				<td>${emp.empId}</td>
				<td>${emp.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>