<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
		<h1>PlantRoom</h1>
		<h3>All Plants</h3>

		<form action="getPlant.do" method="GET">
			Plant ID: <input type="text" name="id" /> <input type="submit"
				value="Find Plant" />
		</form>

		<table class="table table-striped table-hover">
			<thead class="thead thead-dark">
				<tr>
					<th>PLant Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${plants}" var="dino">
					<tr>
						<td><a href="getPlant.do?fid=${plant.id}">${plant.name}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>