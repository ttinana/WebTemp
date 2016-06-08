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
<title>ORG</title>
</head>
<body class="no-sidebar">
	<!-- Header Wrapper -->
	<jsp:include page="/WEB-INF/view/header.jsp" />
	<!-- Main Wrapper -->
	<div id="main-wrapper">
		<div class="wrapper style2">
			<div class="inner">
				<div class="container">
					<div id="content">						
						<h1>${title}</h1>
						<h2>${subtitle}</h2>
						<div id="msg"></div>
						<form:errors path="zaposleni.*" cssClass="error" element="div" />


						<form action="submitLOGINForm" method="post">
							<p>
								Unesite ime: <input type="text"
									name="ime" />
							</p>
							<p>
								Unesite prezime: <input type="text"
									name="prezime" /><br>
							</p>							
							<input type="submit" value="Uloguj me" />
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Footer Wrapper -->
	<jsp:include page="/WEB-INF/view/footer.jsp" />
</body>
</html>