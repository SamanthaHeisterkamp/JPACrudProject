<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Plant to PlantRoom</title>
<link rel="stylesheet" href="css/myStyles.css">
</head>
<body>

	<h3>New Plant</h3>
	<form action="create.do" method="GET">
	Plant Name: <input type="text" name="common name" placeholder="common name"
	required="required"/>
	<br>
	Scientific Name: <input type="text" name="name" placeholder="Scientific Name"
	required="required"/>
	<br>
	Light Requirement: <input type="text" name="light" placeholder="Light"
	required="required"/>
	<br>
	Water Requirement: <input type="text" name="Water" placeholder="Water"
	required="required"/>
	<br>
	Soil Requirement: <input type="text" name="Soil" placeholder="Soil"
	required="required"/>
	<br>
	Humidity Level: <input type="text" name="Humidity" placeholder="Humidity"
	required="required"/>
	<br>
	Maximum Size: <input type="text" name="name" placeholder="Size"
	required="required"/>
	<br>
	
	<input class="btn btn-warning" type="submit" value="Add Plant" />
	
	</form>


</body>
</html>