<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">
</head>
<body>
<%@include file="header.jsp" %>
<hr>
<c:url var="exchangeUrl" value="/exchange/save"></c:url>
<form:form action="${exchangeUrl }" modelAttribute="exchange">
	<table>
	<tr>
				<c:if test="${!empty exchange.exchangeName}">
					<td><form:label path="id">id</form:label></td>
					<td><form:input readonly="true" disabled="true" path="id"></form:input>
						<form:hidden path="id"></form:hidden></td>
			
			</c:if>
			</tr>
		<tr>
		<div class="form-group">
			<td><form:label path="exchangeName">exchangeName</form:label></td>
			<td><form:input class="form-control" path="exchangeName"></form:input></td>
		</div>	
		</tr>
		<tr>
			<div class="form-group">
			<td><form:label path="contractAddress">contractAddress</form:label></td>
			<td><form:input class="form-control" path="contractAddress"></form:input></td>
			</div>
		</tr>
		<tr>
			<div class="form-group">
			<td><form:label path="brief">brief</form:label></td>
			<td><form:input class="form-control" path="brief"></form:input></td>
			</div>
		</tr>
		<tr>
			<div class="form-group">
			<td><form:label path="remarks">remarks</form:label></td>
			<td><form:input class="form-control" path="remarks"></form:input></td>
			</div>
			
		</tr>
	
		<tr>
			<td><button type="submit">submit</button></td>
			
			
		</tr>
	</table>
</form:form>
<br />
	<hr />
	<table border="1">


		<tr>

			<th>Id</th>
			<th>Name</th>
			<th>address</th>
			<th>brief</th>
			<th>remarks</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="register" items="${list}">
			<tr>
				<td>${register.id }
				</th>
				<td>${register.id }</td>
				<td>${register.name }</td>
				<td>${register.address }</td>
				<td>${register.brief }</td>
				<td>${register.remarks }</td>
				<td><a href="<c:url value='/remove/${exchange.id }'/>">Delete</a>|
					<a href="<c:url value='/update/${exchange.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>