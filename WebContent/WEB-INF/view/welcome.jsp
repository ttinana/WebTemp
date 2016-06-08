<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
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
<title>App</title>
</head>
<body class="homepage">

	<!-- Header  <a href="homeCRHoV">Članovi</a>    -->
	<jsp:include page="/WEB-INF/view/header.jsp" />


	<!-- Banner -->
	<div id="banner">
		<h2>
			<br /> <img
				src="<c:url value="/resources/images/icons/circle5.png"/>"
				height="50" width="50" /> <a href="#">${welcomeMessage}</a>
		</h2>
		<p>Ukoliko ste regostrovani: </p>
		<a href="login" class="button big icon fa-check-circle">Logovanje</a>
	</div>

	
	<%-- <jsp:include page="/WEB-INF/view/welcomeExpanded.jsp" /> --%>
	



	<!-- Footer -->
	<jsp:include page="/WEB-INF/view/footer.jsp" />

</body>
</html>


