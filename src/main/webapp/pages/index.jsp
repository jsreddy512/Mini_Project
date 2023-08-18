<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags" prefix="form"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Report App</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
</head>
<body>
	<div class="container">
		<h3>Report Application</h3>

	</div>
	<form:form action="" modelAttribute="search" method="POST">

		<table>
			<tr>
				<td>Plan Name:</td>
				<td><form:select path="planName">
						<form:option value="">-Select-</form:option>
					</form:select></td>
				<td>Plan Status:</td>
				<td><form:select path="planStatus">
						<form:option value="">-Select-</form:option>
					</form:select></td>
			</tr>
		</table>
	</form:form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous">
		
	</script>
</body>
</html>