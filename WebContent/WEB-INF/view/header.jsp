<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="header-wrapper">
	<div class="container">

		<!-- Header -->
		<header id="header">
			<div class="inner">

				<!-- Logo -->
				<h1>
					<a href="welcome" id="logo"> <img
						src="<c:url value="/resources/images/icons/circle5.png"/>"
						height="27" width="27" />
					</a>
				</h1>

				<!-- Nav -->
				<nav id="nav">
					<ul>
						<li><a href="registracija">Registracija</a>
							<ul>
								<li><a href="#"> Administrator </a></li>
								<li><a href=""> Trener </a></li>
							</ul></li>
						<li><a href="#">Clanovi</a>
							<ul>
								<li><a href="">Svi članovi</a></li>
								<li><a href="">Moji članovi</a></li>
							</ul></li>
						<li><a href="#">Programi</a>
							<ul>
								<li><a href=""> tip 1</a></li>
								<li><a href="">tip 2</a></li>
								<li><a href="">tip 3</a></li>
								<li><a href="">tip 4</a></li>

							</ul></li>
						<li><a href="">Izveštaji</a>
							<ul>
								<li><a href="">A</a>
									<ul>
										<li><a href="#">AA</a></li>
										<li><a href="#">AB</a></li>
										<li><a href="#">AC</a></li>
									</ul></li>
								<!-- <li>&nbsp;</li>-->
								<li><a href="#">B</a></li>
								<li><a href="">C</a>
									<ul>
										<li><a href="#">CA</a></li>
										<li><a href="#">CB</a></li>
										<li><a href="#">CD</a></li>

									</ul></li>
							</ul></li>

						<li><a href="">Kontakt</a>
							<ul>
								<li><a href="">Kalendar</a></li>
							</ul></li>
					</ul>

				</nav>

			</div>
		</header>
	</div>
</div>

