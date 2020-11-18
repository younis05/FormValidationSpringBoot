<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Info</title>
</head>
<body>
<div class="container" style="padding=5%">
	<h3>Account Info</h3>
	<table >

		<tr valign="top">
			<td>Username:</td>
			<td>${account.username }</td>
		</tr>

		<tr valign="top">
			<td>Password:</td>
			<td>${account.password }</td>
		</tr>

		<tr valign="top">
			<td>Age:</td>
			<td>${account.age }</td>
		</tr>

		<tr valign="top">
			<td>Birthday:</td>
			<td><fmt:formatDate var="birthday" value="${account.birthDay }"
					pattern="dd/MM/yyyy" /> ${birthday }</td>
		</tr>

		<tr valign="top">
			<td>Email:</td>
			<td>${account.email }</td>
		</tr>
        <tr valign="top">
			<td>Phone:</td>
			<td>${account.phone }</td>
		</tr>
		<tr valign="top">
			<td>Website:</td>
			<td>${account.website }</td>
		</tr>

	</table>
</div>
</body>