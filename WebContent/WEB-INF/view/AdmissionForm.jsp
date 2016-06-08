<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
	pageEncoding="ISO-8859-2"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

<link href="<c:url value="/resources/css/skel.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style-desktop.css" />"
	rel="stylesheet">


<script src="<c:url value="/resources/js/test.js" />"></script>

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery.dropotron.min.js" />"></script>
<script src="<c:url value="/resources/js/skel.min.js" />"></script>
<script src="<c:url value="/resources/js/skel-layers.min.js" />"></script>
<script src="<c:url value="/resources/js/init.js" />"></script>



<title>AdmissionForm</title>
</head>
<body>
	<h1> ${titleMsg}</h1>
	<h2>${headermsg}</h2>

	<div id="msg"></div>


	<form:errors path="student1.*" cssClass="error" element="div" />

	<form action="submitAdmissionForm" method="post">
		<p>
			Student's Name (20 cas NO DOGIT IN IT) : <input type="text"
				name="studentName" />
		</p>
		<p>
			Student's Hobby : (17 cas 2-30 karaktera) <input type="text"
				name="studentHobby" /><br> (Music, Cricket Hokey)

		</p>
		<p>
			Student's mobile: ( max is 9999) ( 123456789 ) : <input type="text"
				name="  " />
		</p>
		<p>
			Student's DOB ( 2010/02/02 ) or ( 2012***06***25 ): <input
				type="text" name="studentDOB" />
		</p>
		<p>
			Student skills: <br> <select name="studentSkills"
				multiple="multiple">
				<option value="Java Core">Java Core</option>
				<option value="Spring Core">Spring Core</option>
				<option value="Spring MVC">Spring MVC</option>
			</select>
		</p>
		<p>
			Student adress: <br> country <input type="text"
				name="studentAddress.country" /><br> city <input type="text"
				name="studentAddress.city" /><br> street <input type="text"
				name="studentAddress.street" /><br> pincode <input type="text"
				name="studentAddress.pincode" /><br>
		</p>
		<input type="submit" value="Submit this form by clicking here" />
	</form>


</body>
</html>