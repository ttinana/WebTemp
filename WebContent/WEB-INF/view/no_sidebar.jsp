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
<title>CRHoV</title>
</head>
<body class="no-sidebar">

	<!-- Header Wrapper -->
	<jsp:include page="/WEB-INF/header.jsp" />

	<!-- Main Wrapper -->
	<div id="main-wrapper">
		<div class="wrapper style2">
			<div class="inner">
				<div class="container">
					<div id="content">

						<!-- Content -->

						<article> <header class="major">
						<h2>${title}</h2>
						<p>${subtitle}</p>
						</header> <span class="image featured"><img src="images/pic08.jpg"
							alt="" /></span>

						<p>Phasellus quam turpis, feugiat sit amet ornare in,
							hendrerit in lectus. Praesent semper mod quis eget mi. Etiam eu
							ante risus. Aliquam erat volutpat. Aliquam luctus et mattis
							lectus sit amet pulvinar. Nam turpis nisi consequat etiam lorem
							ipsum dolor sit amet nullam. Phasellus quam turpis, feugiat sit
							amet ornare in, hendrerit in lectus. Praesent semper mod quis
							eget mi. Etiam eu ante risus. Aliquam erat volutpat. Aliquam
							luctus et mattis lectus sit amet pulvinar. Nam turpis nisi
							consequat etiam.</p>

						<h3>More intriguing information</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Maecenas ac quam risus, at tempus justo. Sed dictum rutrum massa
							eu volutpat. Quisque vitae hendrerit sem. Pellentesque lorem
							felis, ultricies a bibendum id, bibendum sit amet nisl. Mauris et
							lorem quam. Maecenas rutrum imperdiet vulputate. Nulla quis nibh
							ipsum, sed egestas justo. Morbi ut ante mattis orci convallis
							tempor. Etiam a lacus a lacus pharetra porttitor quis accumsan
							odio. Sed vel euismod nisi. Etiam convallis rhoncus dui quis
							euismod. Maecenas lorem tellus, congue et condimentum ac,
							ullamcorper non sapien. Donec sagittis massa et leo semper a
							scelerisque metus faucibus. Morbi congue mattis mi. ultricies a
							bibendum id, bibendum sit amet nisl. Mauris et lorem quam.
							Maecenas rutrum imperdiet vulputate. Nulla quis nibh ipsum, sed
							egestas justo. Morbi ut ante mattis orci convallis tempor. Etiam
							a lacus a lacus pharetra porttitor quis accumsan odio. Sed vel
							euismod nisi. Etiam convallis rhoncus dui quis euismod. Maecenas
							lorem tellus, congue et condimentum ac, ullamcorper non sapien.
							Donec sagittis massa et leo semper a scelerisque metus faucibus.
							Morbi congue mattis mi. Phasellus sed nisl vitae risus tristique
							volutpat. Cras rutrum commodo luctus lorem ipsum dolor sit amet
							phasellus consequat.</p>

						<p>Phasellus odio risus, faucibus et viverra vitae, eleifend
							ac purus. Praesent mattis, enim quis hendrerit porttitor, sapien
							tortor viverra magna, sit amet rhoncus nisl lacus nec arcu.
							Suspendisse laoreet metus ut metus imperdiet interdum aliquam
							justo tincidunt. Mauris dolor urna, fringilla vel malesuada ac,
							dignissim eu mi. Praesent mollis massa ac nulla pretium pretium.
							Suspendisse laoreet metus ut metus imperdiet interdum aliquam
							justo tincidunt. Mauris dolor urna, ultricies a bibendum id,
							bibendum sit amet nisl. Mauris et lorem quam. Maecenas rutrum
							imperdiet vulputate. Nulla quis nibh ipsum, sed egestas justo.
							Morbi ut ante mattis orci convallis tempor. fringilla vel
							malesuada ac, dignissim eu mi. Praesent mollis massa ac nulla
							pretium pretium. Maecenas tortor mauris, consectetur pellentesque
							dapibus eget, tincidunt vitae arcu. Vestibulum purus augue,
							tincidunt sit amet iaculis id, porta eu purus sed feugiat lorem
							ipsum dolor nullam blandit tempus.</p>
						</article>

					</div>
				</div>
			</div>
		</div>
		<div class="wrapper style3">
			<div class="inner">
				<div class="container">
					<div class="row">
						<div class="8u">

							<!-- Article list -->
							<section class="box article-list">
							<h2 class="icon fa-file-text-o">Recent Posts</h2>

							<!-- Excerpt --> <article class="box excerpt"> <a
								href="#" class="image left"><img src="images/pic04.jpg"
								alt="" /></a>
							<div>
								<header> <span class="date">July 24</span>
								<h3>
									<a href="#">Repairing a hyperspace window</a>
								</h3>
								</header>
								<p>Phasellus quam turpis, feugiat sit amet ornare in,
									hendrerit in lectus semper mod quisturpis nisi consequat etiam
									lorem. Phasellus quam turpis, feugiat et sit amet ornare in,
									hendrerit in lectus semper mod quis eget mi dolore.</p>
							</div>
							</article> <!-- Excerpt --> <article class="box excerpt"> <a
								href="#" class="image left"><img src="images/pic05.jpg"
								alt="" /></a>
							<div>
								<header> <span class="date">July 18</span>
								<h3>
									<a href="#">Adventuring with a knee injury</a>
								</h3>
								</header>
								<p>Phasellus quam turpis, feugiat sit amet ornare in,
									hendrerit in lectus semper mod quisturpis nisi consequat etiam
									lorem. Phasellus quam turpis, feugiat et sit amet ornare in,
									hendrerit in lectus semper mod quis eget mi dolore.</p>
							</div>
							</article> <!-- Excerpt --> <article class="box excerpt"> <a
								href="#" class="image left"><img src="images/pic06.jpg"
								alt="" /></a>
							<div>
								<header> <span class="date">July 14</span>
								<h3>
									<a href="#">Preparing for Y2K38</a>
								</h3>
								</header>
								<p>Phasellus quam turpis, feugiat sit amet ornare in,
									hendrerit in lectus semper mod quisturpis nisi consequat etiam
									lorem. Phasellus quam turpis, feugiat et sit amet ornare in,
									hendrerit in lectus semper mod quis eget mi dolore.</p>
							</div>
							</article> </section>
						</div>
						<div class="4u">

							<!-- Spotlight -->
							<section class="box spotlight">
							<h2 class="icon fa-file-text-o">Spotlight</h2>
							<article> <a href="#" class="image featured"><img
								src="images/pic07.jpg" alt=""></a> <header>
							<h3>
								<a href="#">Neural Implants</a>
							</h3>
							<p>The pros and cons. Mostly cons.</p>
							</header>
							<p>Phasellus quam turpis, feugiat sit amet ornare in,
								hendrerit in lectus semper mod quisturpis nisi consequat ornare
								in, hendrerit in lectus semper mod quis eget mi quat etiam
								lorem. Phasellus quam turpis, feugiat sed et lorem ipsum dolor
								consequat dolor feugiat sed et tempus consequat etiam.</p>
							<p>Lorem ipsum dolor quam turpis, feugiat sit amet ornare in,
								hendrerit in lectus semper mod quisturpis nisi consequat etiam
								lorem sed amet quam turpis.</p>
							<footer> <a href="#" class="button alt icon fa-file-o">Continue
								Reading</a> </footer> </article> </section>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Footer Wrapper -->
	<jsp:include page="/WEB-INF/footer.jsp" />
</body>
</html>