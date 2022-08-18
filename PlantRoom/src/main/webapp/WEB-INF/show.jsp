<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Plant</title>
</head>
<link rel="stylesheet" href="css/myStyles.css">
<body>
<div class="container fluid">
		<div>

			<h2>${plant.name}</h2>
			<h4>"${plant.scientificName}"</h4>
			<h4>
				<em>${plant.lightRequirement}</em>
			</h4>
			Delete Plant
			<form action="deletePlant.do" method="GET">
				<input type="number" name="plants" placeholder="${plant.id}"
					value="Delete Plant" required="required" />
				<button class="btn btn-outline-primary" type="submit" name="id"
					value="${plant.id}">Delete Plant</button>

			</form>

			Edit Plant
			<form action="editPlant.do" method="GET">
				<button class="btn btn-outline-primary" type="submit" name="id"
					value="${plant.id}">Edit Plant</button>
			</form>
			<table class="table table-striped">
				<thead class="thead thead-dark">
					<tr>
						<th>Water</th>
						<th>Soil</th>
						<th>Humidity</th>
						<th>Size</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${plant.waterRequirement}</td>
						<td>${plant.soilRequirement}</td>
						<td>${plant.humidityRequirement}</td>
						<td>${plant.maximumSize}</td>
					</tr>
				</tbody>
			</table>
			
		</div>
	</div>
</body>
</html>