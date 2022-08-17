<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Plant Room App</title>
<link rel="stylesheet" href="css/myStyles.css">
	</head>





<body>
<div class= "container-fluid">
<h1 align="center">Welcome to the Plant Room</h1>
</div>
	<h3 align="center">Let's Get Planting!</h3>


<div>
	<table class="table table-striped table-hover">
	<thead class="thead thead-dark">
			<tr>
			<th>Let's Get Planting!</th>
			<th></th>
			</tr>
			<tr>
			</tr>
			</thead>
			<tbody>
			<tr>
				<td>Add a Plant:</td>
				<td>
					<form action="createPlantForm.do" method="GET">
						<input type = "submit" value= "Add plant"/>
						</form>
						</td>
						</tr>
						<tr>
						<tr>
						<tr>
						<td> View All Plants in the PlantRoom:</td>
						<td>
						<form action ="getList.do" method= "GET">
						<input type= "submit" value="View All"/>
						
						</form>
						</td>
						</tr>
						<tr>
						<tr>
						<td>Search:</td>
						<td>
						<form action="getSearch.do" method="GET">
						<input type="text" name="search" />
						<button class= btn btn-outline-primary" type="submit" name="Search">Search</button>
						</form> 
						</td>
						</tr>
						</tbody>
						</table>
						</div>
	
	
	</table>

</body>
</html>