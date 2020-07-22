<%@page import="com.neu.po.Movie" import ="com.neu.po.review" import ="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	import="com.neu.web.MovieServlet" import="com.neu.web.RIZHI" pageEncoding="utf-8"%>
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
	<%String uid=request.getParameter("uid");

	%>
		<div class="container_wrap">
			<div class="header_top">
				<div class="col-sm-3 logo">
					<a href="index.jsp?uid=<%=uid%>"><img src="images/logo.png" alt="" /></a>
				</div>
				<div class="col-sm-6 nav">
					<ul>
						<li><span class="simptip-position-bottom simptip-movable"
							data-tooltip="comic"><a href="echarts.jsp"> </a></span></li>
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
						
                        <span style="display:none" id="userid"><%=uid%></span>
         
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
                        	//String mid="2365260";
                        	%>
                        	<span style="display:none" id="movieid"><%=request.getParameter("mid") %></span>
								<span class="movie_rating"><%=new MovieServlet().getMovie(mid).getRate()%></span>
								<img src=<%="movie_img/"+mid+".jpg"%> onerror="javascript:this.src='images/single.jpg';this.οnerrοr=null" class="img-responsive"
									alt="" />
							</div>
							<div class="movie_rate">
								<div class="rating_desc">
									<% if (MovieServlet.findreview(mid,uid)!=null){ %>
									<p>Your Vote :<%=MovieServlet.findreview(mid,uid).getrate() %></p>
									<% } else { %> <p>Your Vote :please rank this movie</p><% } %>
								</div>
								<div class="rating_desc">
								<form action="" class="sky-form">
									<fieldset>
										<section>
											<div class="rating">
												<input type="radio" name="stars-rating" value="5" id="stars-rating-5">
												<label for="stars-rating-5"><i class="icon-star"></i></label>
												<input type="radio" name="stars-rating" value="4" id="stars-rating-4">
												<label for="stars-rating-4"><i class="icon-star"></i></label>
												<input type="radio" name="stars-rating" value="3" id="stars-rating-3">
												<label for="stars-rating-3"><i class="icon-star"></i></label>
												<input type="radio" name="stars-rating" value="2"  id="stars-rating-2">
												<label for="stars-rating-2"><i class="icon-star"></i></label>
												<input type="radio" name="stars-rating" value="1" id="stars-rating-1">
												<label for="stars-rating-1"><i class="icon-star"></i></label>
											</div>
										</section>
									</fieldset>
								</form>
								</div>
				<script type="text/javascript">
				$("input[name='stars-rating']").eq(5-<%=MovieServlet.findreview(mid,uid).getrate() %>).attr('checked', 'true');
				</script>
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
								<a class="btn1" href="javascript:void(0)" onclick="getrate();"><span> </span>Download</a>
								<script type="text/javascript">
								function getrate() {
									var a1 = $("input[name='stars-rating']:checked").val();
	
									alert(a1);
								}
								</script>
							</div>
						</div>
						<div class="clearfix"></div>

					</div>
					
					<div class="col-md-3">
						<div class="movie_img">
					<%
					java.util.List <Movie> r=new MovieServlet().getMovieListByrec(mid);
					Movie r0=r.get(0);
					Movie r1=r.get(1);
					Movie r2=r.get(2);
					String mname=r0.getmName();
					String mida =r0.getmId();
					String imgurl="movie_img/"+mida+".jpg";
					%>
							<div class="grid_2">
								<a href="single.jsp?mid=<%=mida%>&&uid=<%=uid%>">
								<img  src=<%=imgurl%>  onerror="javascript:this.src='images/pic9.jpg';this.οnerrοr=null"
									class="img-responsive" alt=""></a>
								<div class="caption1">
                               <p class="m_3"><%=r0.getmName()%></p>
								</div>
							</div>
						</div>
						<div class="grid_2 col_1">
							<a href="single.jsp?mid=<%=r1.getmId()%>&&uid=<%=uid%>">
							<img src=<%="movie_img/"+r1.getmId()+".jpg"%> onerror="javascript:this.src='images/pic2.jpg';this.οnerrοr=null"
								class="img-responsive" alt=""></a>
							<div class="caption1">
								
								<p class="m_3"><%=r1.getmName()%></p>
							</div>
						</div>
						<div class="grid_2 col_1">
							<a href="single.jsp?mid=<%=r2.getmId()%>&&uid=<%=uid%>">
							<img src=<%="movie_img/"+r2.getmId()+".jpg"%> onerror="javascript:this.src='images/pic6.jpg';this.οnerrοr=null"
								class="img-responsive" alt=""></a>
							<div class="caption1">


								<p class="m_3"><%=r2.getmName()%></p>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
					<form onSubmit="return false;">	
							<div class="text">
			                <textarea value="Message:" id="content">Message:</textarea>
			                </div>
			                <div class="form-submit1">
					         <input onclick="dbfunc()" type="submit" value="Submit"><br>
					        
							<script type="text/javascript">
							function dbfunc(){
								
								
							//alert("11111111111111111");
						    content= $("#content").val();
						    //alert(content);
						    mid= $("#movieid").text();
							uid= $("#userid").text();
							rank= $("input[name='stars-rating']:checked").val();
							
							//	 alert("single.jsp"+"?mid="+mid+"&&uid="+uid)
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
								review user_review=new review(mid,uid,content,rank);
								String type = new MovieServlet().getMovie(mid).getType();
			                 	int a = MovieServlet.updatereview(user_review, type);
			                 	System.out.print(a);}
							
			                 	%>
				
					        </div>
							<div class="clearfix"></div>
                 	</form>
					<div class="single">
		                <h1> Comments</h1>
		                <%
		
		               List<review> reviewarr= MovieServlet.find5review(mid);
		               int len = reviewarr.size();
		                
		                %>
		           
		                <ul class="single_list">
		                
					        <li>
					        <div class="preview"><a href="#"><img src="images/2.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">me    
					                /  <a href="#">reply</a></div>
					                <% if (MovieServlet.findreview(mid,uid)!=null) { %><p><%=MovieServlet.findreview(mid,uid).getcontent() %></p><% } else { %> <p>leave your comments</p><% } %>
					            </div>
					            <div class="clearfix"></div>
					          
					        </li>
					       
					         <li>
					            <div class="preview"><a href="#"><img src="images/3.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">
					                <% if (len>0) { %><p><%=reviewarr.get(0).getuId() %></p><% } else { %> <p>nobody</p><% } %> 
					                  /  <a href="#">reply</a></div>
					                <% if (len>0) { %><p><%=reviewarr.get(0).getcontent() %></p><% } else { %> <p>no more comments</p><% } %> 
					            </div>
					            <div class="clearfix"></div>
					        </li>
							   <li>
					            <div class="preview"><a href="#"><img src="images/3.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">
					                <% if (len>1) { %><p><%=reviewarr.get(1).getuId() %></p><% } else { %> <p>nobody</p><% } %> 
					                  /  <a href="#">reply</a></div>
					                <% if (len>1) { %><p><%=reviewarr.get(1).getcontent() %></p><% } else { %> <p>no more comments</p><% } %> 
					            </div>
					            <div class="clearfix"></div>
					        </li>			        
					        
					         <li>
					            <div class="preview"><a href="#"><img src="images/3.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">
					                <% if (len>2) { %><p><%=reviewarr.get(2).getuId() %></p><% } else { %> <p>nobody</p><% } %> 
					                  /  <a href="#">reply</a></div>
					                <% if (len>2) { %><p><%=reviewarr.get(2).getcontent() %></p><% } else { %> <p>no more comments</p><% } %> 
					            </div>
					            <div class="clearfix"></div>
					        </li>
					     	<li>
					            <div class="preview"><a href="#"><img src="images/3.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">
					                <% if (len>3) { %><p><%=reviewarr.get(3).getuId() %></p><% } else { %> <p>nobody</p><% } %> 
					                  /  <a href="#">reply</a></div>
					                <% if (len>3) { %><p><%=reviewarr.get(3).getcontent() %></p><% } else { %> <p>no more comments</p><% } %> 
					            </div>
					            <div class="clearfix"></div>
					        </li>
					        <li>
					            <div class="preview"><a href="#"><img src="images/3.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">
					                <% if (len>4) { %><p><%=reviewarr.get(4).getuId() %></p><% } else { %> <p>nobody</p><% } %> 
					                  /  <a href="#">reply</a></div>
					                <% if (len>4) { %><p><%=reviewarr.get(4).getcontent() %></p><% } else { %> <p>no more comments</p><% } %> 
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
<%
String lo=uid+" "+mid+" 3 ";
new RIZHI().writelog(lo);%>
</html>