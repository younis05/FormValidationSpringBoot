<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Register</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
<div class="container" style="padding=5%">
	<h3>Account Register</h3>
	<s:form method="post" modelAttribute="account"
		action="${pageContext.request.contextPath }/account/save">
		<table >

			<tr valign="top">
				<td>Username</td>
				<td><s:input path="username" placeHolder="enter your UserName"/></td>
				<td><s:errors path="username" cssClass="error"></s:errors></td>
			</tr>

			<tr valign="top">
				<td>Password</td>
				<td><s:password path="password"
						title="One Upper case, one special char, one number, total length 6 to 20 chars. Example: aA1!bcf" 
						placeHolder="enter your password"/></td>
				<td><s:errors path="password" cssClass="error"></s:errors></td>
			</tr>

			<tr valign="top">
				<td>Age</td>
				<td><s:input path="age" /></td>
				<td><s:errors path="age" cssClass="error"></s:errors></td>
			</tr>

			<tr valign="top">
				<td>Birthday</td>
				<td><s:input path="birthDay" placeHolder="01/11/1954"/></td>
				<td><s:errors path="birthDay" cssClass="error"></s:errors></td>
			</tr>

			<tr valign="top">
				<td>Email</td>
				<td><s:input path="email" placeHolder="enter your email"/></td>
				<td><s:errors path="email" cssClass="error"></s:errors></td>
			</tr>
			
            <tr valign="top">
				<td>Phone</td>
				<td><s:input path="phone" placeHolder="0660123456"/></td>
				<td><s:errors path="phone" cssClass="error"></s:errors></td>
			</tr>
			
			<tr valign="top">
				<td>Website</td>
				<td><s:input path="website" placeHolder="http://www.google.com"/></td>
				<td><s:errors path="website" cssClass="error"></s:errors></td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</s:form>
</div>
</body>
</html>