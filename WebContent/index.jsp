<%@ page language="java" contentType="text/html; charset=utf-8"
	import="com.neu.web.MovieServlet" import="com.neu.util.Flumerec" import="com.neu.po.Movie" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Movie_store A Entertainment Category Flat Bootstarp
	Resposive Website Template | Home :: w3layouts</title>
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
<script type="text/javascript" src="js/index.js"></script>
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:100,200,300,400,500,600,700,800,900'
	rel='stylesheet' type='text/css'>
<script src="js/responsiveslides.min.js"></script>
<script type="text/javascript" src="js/jquery-func.js"></script>
<script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
</script>
</head>
<body>
	<div class="container">
	<%String uid=request.getParameter("uid");%>
		<div class="container_wrap">
			<div class="header_top">
				<div class="col-sm-3 logo">
					<a href="index.jsp?uid=<%=uid%>"><img src="images/logo.png" alt="" /></a>
				</div>
				<div class="col-sm-6 nav">
					<ul>
						<li><span class="simptip-position-bottom simptip-movable"
							data-tooltip="数据统计"><a href="echarts.jsp?uid=<%=uid%>"> </a></span></li>
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
								<a id="userlog" href="person.html">Carol Varois</a>
							</p></li>
						<li class="last"><i class="edit"> </i></li>

					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="slider">
				<div class="callbacks_container">
					<ul class="rslides" id="slider">
						<li><img src="images/banner.jpg" class="img-responsive"
							alt="" />
							<div class="button">
								<a href="#" class="hvr-shutter-out-horizontal">Watch Now</a>
							</div></li>
						<li><img src="images/banner1.jpg" class="img-responsive"
							alt="" />
							<div class="button">
								<a href="#" class="hvr-shutter-out-horizontal">Watch Now</a>
							</div></li>
						<li><img src="images/banner2.jpg" class="img-responsive"
							alt="" />
							<div class="button">
								<a href="#" class="hvr-shutter-out-horizontal">Watch Now</a>
							</div></li>
					</ul>
				</div>
				<div class="banner_desc">
					<div class="col-md-9">
						<ul class="list_1">
							<li>Published <span class="m_1">Feb 20, 2015</span></li>
							<li>Updated <span class="m_1">Feb 20 2015</span></li>
							<li>Rating <span class="m_1"><img
									src="images/rating.png" alt="" /></span></li>
						</ul>
					</div>
					<div class="col-md-3 grid_1">
						<ul class="list_1 list_2">
							<li><i class="icon1"> </i>
							<p>2,548</p></li>
							<li><i class="icon2"> </i>
							<p>215</p></li>
							<li><i class="icon3"> </i>
							<p>546</p></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="content">
				<div class="box_1">
					<h1 class="m_2">Featurd Movies</h1>
					<div class="search">
						<form onsubmit="return false;">
							<input type="text" name="btsearch" value="Search..." onfocus="this.value='';">
								 <input type="submit" value="" class="add" >
						</form>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="content">
				<div class="box" id="sresult">
				</div>
			</div>

		</div>
		<div class="content">
	 
	 	<!-- Main -->
		<div id="main">
			<!-- Content -->
			<div id="content">

				<!-- Box -->
				<div class="box">
					<div class="head">
						<h2>TOP HOT</h2>
						<p class="text-right">
							<a href="#">See all</a>
						</p>
					</div>
					<%		
					String mname=new MovieServlet().getMovieListByPopularity(6).get(0).getmName();
					String mid=new MovieServlet().getMovieListByPopularity(6).get(0).getmId();
					String imgurl="movie_img/"+mid+".jpg";
					%>
					<!-- Movie -->
					<div class="movie">

						<div class="movie-image">

							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=mname %></span></span><img src=<%=imgurl%> onerror="javascript:this.src='css/images/movie7.jpg';this.οnerrοr=null" alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->
					<%
					mname=new MovieServlet().getMovieListByPopularity(6).get(1).getmName();
					mid=new MovieServlet().getMovieListByPopularity(6).get(1).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
					<!-- Movie -->
					<div class="movie">
						<div class="movie-image">
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=mname %></span></span><img src=<%=imgurl%> onerror="javascript:this.src='css/images/movie8.jpg';this.οnerrοr=null" alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->
					<%
					mname=new MovieServlet().getMovieListByPopularity(6).get(2).getmName();
					mid=new MovieServlet().getMovieListByPopularity(6).get(2).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
					<!-- Movie -->
					<div class="movie">
						<div class="movie-image">
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=mname %></span></span><img src=<%=imgurl%> onerror="javascript:this.src='css/images/movie9.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->
					<%
					mname=new MovieServlet().getMovieListByPopularity(6).get(3).getmName();
					mid=new MovieServlet().getMovieListByPopularity(6).get(3).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
					<!-- Movie -->
					<div class="movie">
						<div class="movie-image">
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=mname %></span></span><img src=<%=imgurl%> onerror="javascript:this.src='css/images/movie10.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->
					<%
					mname=new MovieServlet().getMovieListByPopularity(6).get(4).getmName();
					mid=new MovieServlet().getMovieListByPopularity(6).get(4).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
					<!-- Movie -->
					<div class="movie">
						<div class="movie-image">
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=mname %></span></span><img src=<%=imgurl%> onerror="javascript:this.src='css/images/movie11.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->
					<%
					mname=new MovieServlet().getMovieListByPopularity(6).get(5).getmName();
					mid=new MovieServlet().getMovieListByPopularity(6).get(5).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
					<!-- Movie -->
					<div class="movie last">
						<div class="movie-image">
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=mname %></span></span><img src=<%=imgurl%> onerror="javascript:this.src='css/images/movie12.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->
					<div class="cl">&nbsp;</div>
				</div>
				<!-- end Box -->

				<!-- Box -->
				<div class="box">
					<div class="head">
						<h2>TOP RATED</h2>
						<p class="text-right">
							<a href="#">See all</a>
						</p>
					</div>

					<!-- Movie -->
					<div class="movie">
						<div class="movie-image">
							<%
					mname=new MovieServlet().getMovieListByScore(5).get(0).getmName();
					mid=new MovieServlet().getMovieListByScore(5).get(0).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=new MovieServlet().getMovieListByScore(5).get(0).getmName()%></span></span><img
								src=<%=imgurl%> onerror="javascript:this.src='css/images/movie13.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->

					<!-- Movie -->
					<div class="movie">
						<div class="movie-image">
							<%
					mname=new MovieServlet().getMovieListByScore(5).get(1).getmName();
					mid=new MovieServlet().getMovieListByScore(5).get(1).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=new MovieServlet().getMovieListByScore(5).get(1).getmName()%></span></span><img
								src=<%=imgurl%> onerror="javascript:this.src='css/images/movie14.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->

					<!-- Movie -->
					<div class="movie">
						<div class="movie-image">
							<%
					mname=new MovieServlet().getMovieListByScore(5).get(2).getmName();
					mid=new MovieServlet().getMovieListByScore(5).get(2).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=new MovieServlet().getMovieListByScore(5).get(2).getmName()%></span></span><img
								src=<%=imgurl%> onerror="javascript:this.src='css/images/movie15.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->

					<!-- Movie -->
					<div class="movie">
						<div class="movie-image">
							<%
					mname=new MovieServlet().getMovieListByScore(5).get(3).getmName();
					mid=new MovieServlet().getMovieListByScore(5).get(3).getmId();
					imgurl="movie_img/"+mid+".jpg";
					
					%>
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=new MovieServlet().getMovieListByScore(5).get(3).getmName()%></span></span><img
								src=<%=imgurl%> onerror="javascript:this.src='css/images/movie16.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->

					<!-- Movie -->
					<div class="movie">
						<div class="movie-image">
							<%
					mname=new MovieServlet().getMovieListByScore(5).get(4).getmName();
					mid=new MovieServlet().getMovieListByScore(5).get(4).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=new MovieServlet().getMovieListByScore(5).get(4).getmName()%></span></span><img
								src=<%=imgurl%> onerror="javascript:this.src='css/images/movie17.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->

					<!-- Movie -->
					<div class="movie last">
						<div class="movie-image">
							<%
					mname=new MovieServlet().getMovieListByScore(6).get(5).getmName();
					mid=new MovieServlet().getMovieListByScore(6).get(5).getmId();
					imgurl="movie_img/"+mid+".jpg";
					%>
							<a href="single.jsp?mid=<%=mid+"&&uid="+uid%>"><span class="play"><span
									class="name"><%=new MovieServlet().getMovieListByScore(6).get(5).getmName()%></span></span><img
								src=<%=imgurl%> onerror="javascript:this.src='css/images/movie18.jpg';this.οnerrοr=null"  alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->
					<div class="cl">&nbsp;</div>
				</div>
				<!-- end Box -->

				<!-- Box -->
				<div class="box" id ="recommend">
					<div class="head">
						<h2>猜你喜欢</h2>
						<p class="text-right">
							<a href="#">See all</a>
						</p>
					</div>

					<div class="cl">&nbsp;</div>
				</div>
				<div class="box" >
				</div>
				<!-- end Box -->

<!-- Box -->
				<div class="box" id ="flume">
					<div class="head">
						<h2>实时推荐</h2>
						<p class="text-right">
							<a href="#">See all</a>
						</p>
					</div>
             

				</div>
				<!-- end Box -->
			</div>
			<!-- end Content -->




			<div class="cl">&nbsp;</div>
		</div>
		<!-- end Main -->
	 
		<div class="clearfix"></div>
	    </div>
		
	</div>
	



	<div class="container">

		<footer id="footer">
			<div id="footer-3d">
				<div class="gp-container">
					<span class="first-widget-bend"></span>
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
								<p>
									&copy; 2015 Template by <a href="http://w3layouts.com"
										target="_blank"> w3layouts</a>
								</p>
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
