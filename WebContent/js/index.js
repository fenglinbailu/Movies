/**
 * 
 */
var search;

$(document)
		.ready(
				function() {
					
						$.ajax({
									url : "RecommendServlet",
									type : "post",
									async : false,
									data : {
									},
									//dataType : "text",

									error : function(obj) {
										alert("请求失败");
									},

									success : function(json) {
										
									
										var jsonObj = JSON
												.parse(json);
										//var i = 0;
//										var $html1 = '';
//										$html1 += '<div id ="serrr" class="box">'
//												//+ '<div class="head">'
//											//	+ '<h2>TOP RATED</h2>'
//												//+ '<p class="text-right">'
//												//+ '<a href="#">See all</a>'
//												//+ '</p>'
//												//+ '</div>'
//												+ '</div>';
//										//$('#sresult').append($html1)     
//										//$($html1).insertBefore($('#sresult'));
										//alert(jsonObj.data)
										$('#userlog').text(jsonObj.uid)
										$.each(jsonObj.data,function(i,item) {
															
															// 循环获取数据
															//    
															var mid = item.mid
															var img = "movie_img/"
																	+ mid
																	+ ".jpg"

															var mname = item.mname;

															// alert(mname)
															// href="#searchresult.jsp?mname='+mname+'
															var url = "single.jsp?mid="
																	+ mid;
															
//                                                            if(i%6==0)
//                                                            	{
//                                                            	$('#sresult').append($html1)   
//                                                            	}
															var $html2 = '';
															$html2 += 
																	 '<div class="movie">'
																	+ '<div class="movie-image">'
																	+ '<a href="'+url+'"><span class="play"><span class="name">'+mname+'</span></span>'
																	+ '<img src="'+img+'" alt="movie" /></a>'
																	+ '</div>'
																	+ '<div class="rating">'
																	+ '<p>'+mname+'</p>'
																	+ '<div class="stars">'
																	+ '<div class="stars-in"></div>'
																	+ '</div>'
																	+ '<span class="comments">12</span>'
																	+ '</div>'
																	
																	+ '</div>';
															// $($htmls).insertBefore($('#sresult'));
//															$(
//																	$html2)
//																	.insertBefore(
//																			$('#serrr'));
															$('#recommend').append($html2)     
														});

										// }
									}
								})

				

					// alert("imgdd")
					 //$('#tupian1')[0].attr('src', "css/images/movie1.jpg");
					// alert($('#tupian1')[0].src)
					// $('#tupian1').prop('src', "css/images/movie1.jpg")
					$('.add')
							.click(
									function() {
										search = $('input[name="btsearch"]');
										$.ajax({
													url : "search",
													type : "post",
													async : false,
													data : {
														input : search.val(),
													},
													dataType : "text",

													error : function(obj) {
														alert("请求失败");
													},

													success : function(json) {
														
													
														var jsonObj = JSON
																.parse(json);
														//var i = 0;
														var $html1 = '';
														$html1 += '<div id ="serrr" class="box">'
																//+ '<div class="head">'
															//	+ '<h2>TOP RATED</h2>'
																//+ '<p class="text-right">'
																//+ '<a href="#">See all</a>'
																//+ '</p>'
																//+ '</div>'
																+ '</div>';
														//$('#sresult').append($html1)     
														//$($html1).insertBefore($('#sresult'));

														$.each(jsonObj.data,function(i,item) {
																			
																			// 循环获取数据
																			//    
																			var mid = item.mid
																			var img = "movie_img/"
																					+ mid
																					+ ".jpg"

																			var mname = item.mname;

																			// alert(mname)
																			// href="#searchresult.jsp?mname='+mname+'
																			var url = "single.jsp?mid="
																					+ mid;
																			var $htmls = '';
																			$htmls += '<div class="movie">'
																					+ '<dl>'
																					+ '	<dt ><a href='
																					+ url
																					+ '> <img src="'
																					+ img
																					+ '" /></a> </dt>'
																					+ '	<dd>'
																					+ mname
																					+ '</dd>'
																					+ '	<dd><a class="del">删除</a></dd>'
																					+ '	</dl>'
																					+ '</div>';
                                                                            if(i%6==0)
                                                                            	{
                                                                            	$('#sresult').append($html1)   
                                                                            	}
																			var $html2 = '';
																			$html2 += 
																					 '<div class="movie">'
																					+ '<div class="movie-image">'
																					+ '<a href="'+url+'"><span class="play"><span class="name">'+mname+'</span></span>'
																					+ '<img src="'+img+'" alt="movie" /></a>'
																					+ '</div>'
																					+ '<div class="rating">'
																					+ '<p>'+mname+'</p>'
																					//+ '<div class="stars">'
																					//+ '<div class="stars-in"></div>'
																					//+ '</div>'
																					//+ '<span class="comments">12</span>'
																					+ '</div>'
																					
																					+ '</div>';
																			// $($htmls).insertBefore($('#sresult'));
//																			$(
//																					$html2)
//																					.insertBefore(
//																							$('#serrr'));
																			$('#serrr').append($html2)     
																		});

														// }
													}
												})

									});

				});