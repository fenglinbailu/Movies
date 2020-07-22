<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>

<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Movie_store A Entertainment Category Flat Bootstarp Resposive Website Template | Login :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Movie_store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- start plugins -->
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!-- echarts.js -->
<script src="https://cdn.staticfile.org/echarts/4.3.0/echarts.min.js"></script>
</head>
<body>
<div class="container">
	<div class="container_wrap">
		<div class="header_top">
		    <div class="col-sm-3 logo"><a href="index.html"><img src="images/logo.png" alt=""/></a></div>
		    <div class="col-sm-6 nav">
			  <ul>
				 <li> <span class="simptip-position-bottom simptip-movable" data-tooltip="comic"><a href="movie.html"> </a></span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="movie"><a href="movie.html"> </a> </span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="video"><a href="movie.html"> </a></span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="game"><a href="movie.html"> </a></span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="tv"><a href="movie.html"> </a></span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="more"><a href="movie.html"> </a></span></li>
			 </ul>
			</div>
			<div class="col-sm-3 header_right">
			   <ul class="header_right_box">
				 <li><img src="images/p1.png" alt=""/></li>
				 <li><p><a href="login.html">Carol Varois</a></p></li>
				 <li class="last"><i class="edit"> </i></li>
				 <div class="clearfix"> </div>
			   </ul>
			</div>
			<div class="clearfix"> </div>
			<div>		
					
			<button onclick="changePieData1()">区域</button>
			
			<button onclick="changePieData2()">时长</button>
			<button onclick="changePieData3()">评分</button>
			</div>

			 
<div id="main" style="width: 600px;height:600px;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    // 指定图表的配置项和数据
    option = {
        title : {
            text: '请选择图表',
            x:'left'
        },
        tooltip : {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: [
            ]
        },
        series : [
            {
                name: '评分',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
    function changePieData1(){

        var option =  myChart.getOption();

        //var list =[{"name":"满意","value":"5"},{"name":"基本满意","value":"5"},{"name":"不满意","value":"5"},{"name":"不满意","value":"5"},{"name":"基本满意","value":"5"}];
        var list=[
        	{value:9,name:'巴西'},{value:10,name:'泰国'},{value:53,name:'台湾'},{value:15,name:'丹麦'},{value:7,name:'西德'},{value:5,name:'新西兰'},{value:1,name:'Austria'},{value:1,name:'卢森堡'},{value:2,name:'UK'},{value:3,name:'挪威'},{value:1,name:'越南'},{value:6,name:'阿根廷'},{value:744,name:'美国'},{value:1,name:'罗马尼亚'},{value:82,name:'香港'},{value:170,name:'韩国'},{value:1,name:'哥伦比亚'},{value:1,name:'巴拿马'},{value:41,name:'德国'},{value:2,name:'以色列'},{value:4,name:'墨西哥'},{value:318,name:'中国大陆'},{value:2,name:'希腊'},{value:1,name:'阿富汗'},{value:1,name:'亚美尼亚'},{value:5,name:'捷克'},{value:1,name:'保加利亚'},{value:174,name:'英国'},{value:27,name:'印度'},{value:3,name:'匈牙利'},{value:14,name:'波兰'},{value:2,name:'瑞士'},{value:7,name:'伊朗'},{value:3,name:'奥地利'},{value:133,name:'法国'},{value:1,name:'博茨瓦纳'},{value:42,name:'意大利'},{value:14,name:'俄罗斯'},{value:5,name:'荷兰'},{value:6,name:'瑞典'},{value:11,name:'芬兰'},{value:5,name:'土耳其'},{value:2,name:'南斯拉夫'},{value:19,name:'西班牙'},{value:1,name:'缅甸'},{value:6,name:'比利时'},{value:1,name:'冰岛'},{value:1,name:'Bhutan'},{value:3,name:'USA'},{value:4,name:'智利'},{value:23,name:'加拿大'},{value:367,name:'日本'},{value:1,name:'爱沙尼亚'},{value:1,name:'南非'},{value:1,name:'Cuba'},{value:1,name:'马来西亚'},{value:15,name:'爱尔兰'},{value:13,name:'苏联'},{value:1,name:'葡萄牙'},{value:4,name:'捷克斯洛伐克'},{value:3,name:'中国'},{value:13,name:'澳大利亚'},{value:1,name:'印度尼西亚'}
       	 
            ];
        var titles='区域';
           option.series[0].data = list;
           option.title.text = titles;

           myChart.setOption(option);

        }
    function changePieData2(){

        var option =  myChart.getOption();

        //var list =[{"name":"满意","value":"5"},{"name":"基本满意","value":"5"},{"name":"不满意","value":"5"},{"name":"不满意","value":"5"},{"name":"基本满意","value":"5"}];
        var list=[
        	{value:76,name:'小于70'},{value:765,name:'大于70小于100'},{value:1431,name:'大100小于150'},{value:117,name:'大150小于200'},{value:26,name:'大于200'}
            ];
        var titles='时长';
           option.series[0].data = list;
           option.title.text = titles;

           myChart.setOption(option);

        }
    function changePieData3(){

        var option =  myChart.getOption();

        //var list =[{"name":"满意","value":"5"},{"name":"基本满意","value":"5"},{"name":"不满意","value":"5"},{"name":"不满意","value":"5"},{"name":"基本满意","value":"5"}];
        var list=[
        	{value:48,name:'小于40'},{value:154,name:'大于40小于50'},{value:892,name:'大50小于75'},{value:1214,name:'大75小于90'},{value:107,name:'大于90'}
            ];
        var titles='评分';
           option.series[0].data = list;
           option.title.text = titles;

           myChart.setOption(option);

        }
</script>
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
					<img src="images/f_logo.png" alt=""/>
				</div> 
	          <br>
	          <p>It is a long established fact that a reader will be distracted by the readable content of a page.</p>
			  <p class="text">There are many variations of passages of Lorem Ipsum available, but the majority have suffered.</p>
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
				      <p>&copy; 2015 Template by <a href="http://w3layouts.com" target="_blank"> w3layouts</a></p>
			        </div>
		     </div>
		    <div class="clearfix"> </div>
	        </div>
	        <div class="clearfix"> </div>
		</div>
	</div>
  </footer>
</div>		
</body>
</html>