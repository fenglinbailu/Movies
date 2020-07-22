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
						<%String uid=request.getParameter("uid");%>
                        	<span style="display:none" id="userid">
                        	<%=request.getParameter("uid") %></span>
         
						<li><img src="images/p1.png" alt="" /></li>
						<li><p>
								<a href="person.html"><%=uid %></a>
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
								//String mid = "10047547";
							
                        	%>
                        	<span style="display:none" id="movieid"><%=request.getParameter("mid") %></span>
								<span class="movie_rating"><%=new MovieServlet().getMovie(mid).getRate()%></span>
								<img src=<%="movie_img/"+mid+".jpg"%> class="img-responsive"
									alt="" />
							</div>
							<div class="movie_rate">
								<div class="rating_desc">
									<p>Your Vote :</p>
									<input name='subject' type="radio" value="1"><label>1 </label>
						 			<input name='subject' type="radio" value="2"/><label>2</label>
								 	<input name='subject' type="radio" value="3"/><label>3</label>
						 			<input name='subject' type="radio" value="4"/><label>4</label>
						 			<input name='subject' type="radio" value="5"/><label>5</label>
								</div>
								
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="desc1 span_3_of_2">


							<p class="movie_option">
								<strong >Name: </strong><%=new MovieServlet().getMovie(mid).getmName()%></p>
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

					<form onSubmit="return false;">	
							<div class="text">
			                <textarea value="Message:" id="content">Message:</textarea>
			                </div>
			                <div class="form-submit1">
					         <input   onclick="dbfunc()" type="submit" value="Submit"><br>
					        
							<script type="text/javascript">
							function dbfunc(){
								
								
								alert("11111111111111111");
								 content= $("#content").val();
								 mid= $("#movieid").text();
								 uid= $("#userid").text();
								 rank= $("input[name='subject']:checked").val();
								 alert(mid)
								 alert(uid)
								 alert("single.jsp"+"?mid="+mid+"&&uid="+uid)
								 window.location.href="single.jsp"+"?mid="+mid+"&&uid="+uid+"&&content="+content+"&&rank="+rank
								 //+"?mid="+mid+"&&uid="+uid;
							
			                 	
								

								//System.out.println(a)
								//MovieServlet.insertreview(mid,uid,rank,a)
								
							}
							
							
							</script>
							<%
							String content=request.getParameter("content");
							String rank=request.getParameter("rank");
							if(content!=null){
			                 	int a = MovieServlet.insertreview(mid, uid,content,rank);
			                 	System.out.print(a);}
							
			                 	%>
							
					        </div>
							<div class="clearfix"></div>
                 	</form>
                 	
                 	
                 	<div class="single">
		                <h1>5 Comments</h1>
		                <ul class="single_list">
					        <li>
					            <div class="preview"><a href="#"><img src="images/2.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">Movie  /  2 hours ago  /  <a href="#">reply</a></div>
					                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>
					            </div>
					            <div class="clearfix"></div>
					        </li>
					         <li>
					            <div class="preview"><a href="#"><img src="images/3.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">Wernay  /  2 hours ago  /  <a href="#">reply</a></div>
					                <p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent </p>
					            </div>
					            <div class="clearfix"></div>
					        </li>
					         <li>
					            <div class="preview"><a href="#"><img src="images/4.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">mr.dev  /  2 hours ago  /  <a href="#">reply</a></div>
					                <p>Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum. qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram,</p>
					            </div>
					           <div class="clearfix"></div>
					        </li>
					     	<li class="middle">
					            <div class="preview"><a href="#"><img src="images/5.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data-middle">
					                <div class="title">Wernay  /  2 hours ago  /  <a href="#">reply</a></div>
					                <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>
					            </div>
					            <div class="clearfix"></div>
					        </li>
					        <li class="last-comment">
					            <div class="preview"><a href="#"><img src="images/6.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data-last">
					                <div class="title">mr.dev  /  2 hours ago  /  <a href="#">reply</a></div>
					                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit </p>
					            </div>
					            <div class="clearfix"></div>
					        </li>
					         <li>
					            <div class="preview"><a href="#"><img src="images/7.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">denpro  /  2 hours ago  /  <a href="#">reply</a></div>
					                <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>
					            </div>
					            <div class="clearfix"></div>
					        </li>
			  			</ul>
                      </div>
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