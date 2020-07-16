<%@ page language="java" contentType="text/html; charset=utf-8"
	import="com.neu.web.MovieServlet" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en-US" xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
<head>
<title>movieIndex</title>
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style1.css" type="text/css" media="all" />
<!--[if IE 6]>
		<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />
	<![endif]-->
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/jquery-func.js"></script>
</head>
<body>
	<!-- Shell -->
	<div id="shell">
		<!-- Header -->
		<div id="header">
			<h1 id="logo">
				<a href="#">Movie Hunter</a>
			</h1>
			<div class="social">
				<span>FOLLOW US ON:</span>
				<ul>
					<li><a class="twitter" href="#">twitter</a></li>
					<li><a class="facebook" href="#">facebook</a></li>
					<li><a class="vimeo" href="#">vimeo</a></li>
					<li><a class="rss" href="#">rss</a></li>
				</ul>
			</div>

			<!-- Navigation -->
			<div id="navigation">
				<ul>
					<li><a class="active" href="#">HOME</a></li>
					<li><a href="#">NEWS</a></li>
					<li><a href="#">IN THEATERS</a></li>
					<li><a href="#">COMING SOON</a></li>
					<li><a href="#">CONTACT</a></li>
					<li><a href="#">ADVERTISE</a></li>
				</ul>
			</div>
			<!-- end Navigation -->

			<!-- Sub-menu -->
			<div id="sub-navigation">
				<ul>
					<li><a href="#">SHOW ALL</a></li>
					<li><a href="#">LATEST TRAILERS</a></li>
					<li><a href="#">TOP RATED</a></li>
					<li><a href="#">MOST COMMENTED</a></li>
				</ul>
				<div id="search">
					<form action="home_submit" method="get" accept-charset="utf-8">
						<label for="search-field">SEARCH</label> <input type="text"
							name="search field" value="Enter search here" id="search-field"
							title="Enter search here" class="blink search-field"> <a
							href="" id="link">GO!</a>
					</form>
				</div>
				<script type="text/javascript">
			$(document).ready(function(){
				//点击链接的时候调用
      			$("#link").click(function(){
          		//得到input的值
          		var mname = $("#search-field").val();
          		
          		//设置linkToCart的href的值
          		$("#link").attr("href","searchresult.jsp?mname="+mname);
      			});
    		});
			</script>

			</div>
			<!-- end Sub-Menu -->

		</div>
		<!-- end Header -->

		<!-- Main -->
		<div id="main">
			<!-- Content -->
			<div id="content">

				<!-- Box -->
				<div class="box">
					<div class="head">
						<h1>搜索结果</h1>
					</div>
					<%
					String mname=request.getParameter("mname");
					String mid=new MovieServlet().getMovieByName(mname).getmId();
					String imgurl="movie_img/"+mid+".jpg";
					
					int movienum=new MovieServlet().getMovieListByName(mname).size();
					%>
					<!-- Movie -->
					<div class="movie">

						<div class="movie-image">
							<a href="single.jsp?mid=<%=mid%>"><span class="play"><span
									class="name"><%=mname %></span></span><img src=<%=imgurl%> alt="movie" /></a>
						</div>

					</div>
					<!-- end Movie -->
					<div class="cl">&nbsp;</div>
				</div>
				<!-- end Box -->





			</div>
			<!-- end Content -->




			<div class="cl">&nbsp;</div>
		</div>
		<!-- end Main -->

		<!-- Footer -->
		<div id="footer">
			<p>
				<a href="#">HOME</a> <span>|</span> <a href="#">NEWS</a> <span>|</span>
				<a href="#">IN THEATERS</a> <span>|</span> <a href="#">COMING
					SOON </a> <span>|</span> <a href="#">LATERS TRAILERS</a> <span>|</span>
				<a href="#">TOP RATED TRAILERS</a> <span>|</span> <a href="#">MOST
					COMMENTED TRAILERS</a> <span>|</span> <a href="#">ADVERTISE</a> <span>|</span>
				<a href="#">CONTACT </a>
			</p>
			<p>
				&copy; 2009 Movie Hunter, LLC. All Rights Reserved. Designed by <a
					href="http://chocotemplates.com" target="_blank"
					title="The Sweetest CSS Templates WorldWide">ChocoTemplates.com</a>
			</p>
		</div>
		<!-- end Footer -->
	</div>
	<!-- end Shell -->



</body>
</html>