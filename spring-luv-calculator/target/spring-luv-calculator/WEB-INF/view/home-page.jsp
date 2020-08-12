<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

<script type="text/javascript">
function validateUserName(){
	
	var userName = document.getElementById("yn").value;
	if(userName.length<3){
		alert("your name should have atleast 3 char");
		return false;
	}else{
		return true;
	}
}
</script>


</head>
<body bgcolor="pink">

	<h1 align="center">Love Calculator</h1>
	<hr />

	<form:form action="processhomepage" method="get" modelAttribute="userInfo" onsubmit="return validateUserName()">

		<div align="center">
			<p>
				<label for="yn">Your Name :</label> 
				<form:input id="yn" path="userName"/>
				<form:errors path="userName" cssClass="error"/>
			</p>

			<p>
				<label for="cn">Crush Name :</label> 
				<form:input id="cn" path="crushName"/>
			</p>

			<input type="submit" value="calculator">

		</div>
	</form:form>
</body>
</html>