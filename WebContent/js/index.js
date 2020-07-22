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
										//var uname = $('#userlog').text()
										$.each(jsonObj.data,function(i,item) {
															
															// 循环获取数据
															//    
															var mid = item.mid
															var img = "movie_img/"
																	+ mid
																	+ ".jpg"
                                                            var errimg ="movie_img/1 ("+i+").jpg"
                                                            //alert(errimg)
															var mname = item.mname;
                                                            
															// alert(mname)
															// href="#searchresult.jsp?mname='+mname+'
															var url = "single.jsp?mid="
																	+ mid+"&&uid="+jsonObj.uid;
															
//                                                            if(i%6==0)
//                                                            	{
//                                                            	$('#sresult').append($html1)   
//                                                            	}
															var $html2 = '';
															$html2 += 
																	 '<div class="movie">'
																	+ '<div class="movie-image">'
																	+ '<a href="'+url+'"><span class="play"><span class="name">'+mname+'</span></span>'
																	+ '<img src="'+img+'" onerror="javascript:this.src=\''+errimg+'\';this.οnerrοr=null" alt="movie" /></a>'
																	+ '</div>'
																	+ '<div class="rating">'
																	+ '<p>'+mname+'</p>'
														
																	
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

										$.ajax({
									url : "flume",
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
										$.each(jsonObj.data,function(i,item) {

															var mid = item.mid
															var img = "movie_img/"+ mid+ ".jpg"
															var errimg ="movie_img/1 ("+i+").jpg"
															var mname = item.mname;
															var url = "single.jsp?mid="+mid+"&&uid="+$('#userlog').text();
															var $html2 = '';
															$html2 += 
																	 '<div class="movie">'
																	+ '<div class="movie-image">'
																	+ '<a href="'+url+'"><span class="play"><span class="name">'+mname+'</span></span>'
																	+ '<img src="'+img+'" onerror="javascript:this.src=\''+errimg+'\';this.οnerrοr=null" alt="movie" /></a>'
																	+ '</div>'
																	+ '<div class="rating">'
																	+ '<p>'+mname+'</p>'
																	+ '</div>';
															$('#flume').append($html2)     
														});

									}
								})

					$('.add')
							.click(
									function() {
										$('#sresult').empty();
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
																			var errimg ="movie_img/1 ("+i+").jpg"
																			var mname = item.mname;

																			// alert(mname)
																			// href="#searchresult.jsp?mname='+mname+'
																			var url = "single.jsp?mid="
																					+ mid+"&&uid="+$('#userlog').text();
																			
                                                                          //  if(i%6==0)
                                                                          //  	{
                                                                           // 	$('#sresult').append($html1)   
                                                                            //	}
																			var $html2 = '';
																			$html2 += 
																					 '<div class="movie">'
																					+ '<div class="movie-image">'
																					+ '<a href="'+url+'"><span class="play"><span class="name">'+mname+'</span></span>'
																					+ '<img src="'+img+'" onerror="javascript:this.src=\''+errimg+'\';this.οnerrοr=null" alt="movie" /></a>'
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
																			$('#sresult').append($html2)     
																		});

														// }
													}
												})

									});

				});