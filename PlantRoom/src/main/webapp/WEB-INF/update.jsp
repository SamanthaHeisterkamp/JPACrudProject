<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>New Plant</h5>

	<form action="updatePlant.do" method="Post">
		<input type="hidden" name="id" value="${plant.id}" /> Name: <input
			type="text" name="name" value="${plant.name}" /> Scientific Name: <input
			type="text" name="type" value=" ${plant.scientificName}" /> Light Requirement: <input
			type="text" name="diet" value="${plant.lightRequirement} " /> Water Requirement:
		<input type="text" name="Water Requirement"
			value="${plant.waterRequirement}" /> 
			 Soil Requirement: <input
			type="text" name="soilRequirement" value="${plant.soilRequirement}" />
		Humidity Requirement: <input type="text" name="humidityRequirement"
			value=" ${plant.humidityRequirement}" /> Maximum Size: <input type="text"
			name="nameMeaning" value="${plant.maximumSize} "/> 
		<button class="btn btn-outline-primary" type="submit" name="id"
			value="${plant.id}">Update plant</button>

	</form>

</body>
</html>