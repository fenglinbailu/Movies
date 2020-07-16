<%@ page language="java" contentType="text/html; charset=utf-8"
	import="com.neu.web.MovieServlet" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Movie_store A Entertainment Category Flat Bootstarp
	Resposive Website Template | Single :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Movie_store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- start plugins -->
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:100,200,300,400,500,600,700,800,900'
	rel='stylesheet' type='text/css'>
</head>
<body>
	<div class="container">
		<div class="container_wrap">
			<div class="header_top">
				<div class="col-sm-3 logo">
					<a href="index.html"><img src="images/logo.png" alt="" /></a>
				</div>
				<div class="col-sm-6 nav">
					<ul>
						<li><span class="simptip-position-bottom simptip-movable"
							data-tooltip="comic"><a href="movie.html"> </a></span></li>
						<li><span class="simptip-position-bottom simptip-movable"
							data-tooltip="movie"><a href="movie.html"> </a> </span></li>
						<li><span class="simptip-position-bottom simptip-movable"
							data-tooltip="video"><a href="movie.html"> </a></span></li>
						<li><span class="simptip-position-bottom simptip-movable"
							data-tooltip="game"><a href="movie.html"> </a></span></li>
						<li><span class="simptip-position-bottom simptip-movable"
							data-tooltip="tv"><a href="movie.html"> </a></span></li>
						<li><span class="simptip-position-bottom simptip-movable"
							data-tooltip="more"><a href="movie.html"> </a></span></li>
					</ul>
				</div>
				<div class="col-sm-3 header_right">
					<ul class="header_right_box">
						<li><img src="images/p1.png" alt="" /></li>
						<li><p>
								<a href="login.html">Carol Varois</a>
							</p></li>
						<li class="last"><i class="edit"> </i></li>
						<div class="clearfix"></div>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="content">
				<div class="movie_top">
					<div class="col-md-9 movie_box">
						<div class="grid images_3_of_2">
							<div class="movie_image">
								<%
                        	String mid=request.getParameter("mid");
                        	//String mid="2365260";
                        	%>
								<span class="movie_rating"><%=new MovieServlet().getMovie(mid).getRate()%></span>
								<img src=<%="movie_img/"+mid+".jpg"%> class="img-responsive"
									alt="" />
							</div>
							<div class="movie_rate">
								<div class="rating_desc">
									<p>Your Vote :</p>
								</div>
								<form action="" class="sky-form">
									<fieldset>
										<section>
											<div class="rating">
												<input type="radio" name="stars-rating" id="stars-rating-5">
												<label for="stars-rating-5"><i class="icon-star"></i></label>
												<input type="radio" name="stars-rating" id="stars-rating-4">
												<label for="stars-rating-4"><i class="icon-star"></i></label>
												<input type="radio" name="stars-rating" id="stars-rating-3">
												<label for="stars-rating-3"><i class="icon-star"></i></label>
												<input type="radio" name="stars-rating" id="stars-rating-2">
												<label for="stars-rating-2"><i class="icon-star"></i></label>
												<input type="radio" name="stars-rating" id="stars-rating-1">
												<label for="stars-rating-1"><i class="icon-star"></i></label>
											</div>
										</section>
									</fieldset>
								</form>
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="desc1 span_3_of_2">


							<p class="movie_option">
								<strong>Name: </strong><%=new MovieServlet().getMovie(mid).getmName()%></p>
							<p class="movie_option">
								<strong>Director: </strong><%=new MovieServlet().getMovie(mid).getDirector()%></p>
							<p class="movie_option">
								<strong>Screenwriter: </strong><%=new MovieServlet().getMovie(mid).getScreenwriter()%></p>
							<p class="movie_option">
								<strong>Actor: </strong><%=new MovieServlet().getMovie(mid).getActor()%></p>
							<p class="movie_option">
								<strong>Type: </strong><%=new MovieServlet().getMovie(mid).getType()%></p>
							<p class="movie_option">
								<strong>Country: </strong><%=new MovieServlet().getMovie(mid).getArea()%></p>
							<p class="movie_option">
								<strong>Language: </strong><%=new MovieServlet().getMovie(mid).getLanguage()%></p>
							<p class="movie_option">
								<strong>Length: </strong><%=new MovieServlet().getMovie(mid).getLength()%>
								min
							</p>
							<div class="down_btn">
								<a class="btn1" href="#"><span> </span>Download</a>
							</div>
						</div>
						<div class="clearfix"></div>


					</div>
					<div class="col-md-3">
						<div class="movie_img">
							<div class="grid_2">
								<a href="movieindex.jsp"><img src="images/pic6.jpg"
									class="img-responsive" alt=""></a>
								<div class="caption1">
									<ul class="list_5 list_7">
										<li><i class="icon5"> </i>
										<p>3,548</p></li>
									</ul>
									<i class="icon4 icon6 icon7"> </i>
									<p class="m_3">Guardians of the Galaxy</p>
								</div>
							</div>
						</div>
						<div class="grid_2 col_1">
							<a href="movieindex.jsp"><img src="images/pic2.jpg"
								class="img-responsive" alt=""></a>
							<div class="caption1">
								<ul class="list_3 list_7">
									<li><i class="icon5"> </i>
									<p>3,548</p></li>
								</ul>
								<i class="icon4 icon7"> </i>
								<p class="m_3">Guardians of the Galaxy</p>
							</div>
						</div>
						<div class="grid_2 col_1">
							<a href="movieindex.jsp"><img src="images/pic9.jpg"
								class="img-responsive" alt=""></a>
							<div class="caption1">
								<ul class="list_3 list_7">
									<li><i class="icon5"> </i>
									<p>3,548</p></li>
								</ul>
								<i class="icon4 icon7"> </i>
								<p class="m_3">Guardians of the Galaxy</p>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<footer id="footer">
			<div id="footer-3d">
				<div class="gp-container">
					<span class="first-widget-bend"> </span>
				</div>
			</div>
			<div id="footer-widgets" class="gp-footer-larger-first-col">
				<div class="gp-container">
					<div class="footer-widget footer-1">
						<div class="wpb_wrapper">
							<img src="images/f_logo.png" alt="" />
						</div>
						<br>
						<p>It is a long established fact that a reader will be
							distracted by the readable content of a page.</p>
						<p class="text">There are many variations of passages of Lorem
							Ipsum available, but the majority have suffered.</p>
					</div>
					<div class="footer_box">
						<div class="col_1_of_3 span_1_of_3">
							<h3>Categories</h3>
							<ul class="first">
								<li><a href="#">Dance</a></li>
								<li><a href="#">History</a></li>
								<li><a href="#">Specials</a></li>
							</ul>
						</div>
						<div class="col_1_of_3 span_1_of_3">
							<h3>Information</h3>
							<ul class="first">
								<li><a href="#">New products</a></li>
								<li><a href="#">top sellers</a></li>
								<li><a href="#">Specials</a></li>
							</ul>
						</div>
						<div class="col_1_of_3 span_1_of_3">
							<h3>Follow Us</h3>
							<ul class="first">
								<li><a href="#">Facebook</a></li>
								<li><a href="#">Twitter</a></li>
								<li><a href="#">Youtube</a></li>
							</ul>
							<div class="copy">
								<p>&copy; 2020 Template by neu</p>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</footer>
	</div>
</body>
</html>