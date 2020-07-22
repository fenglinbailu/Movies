$("document").ready(function () {
	//alert("11111111111")
	$.ajax({
	  url: "persons",
      type: "post",
      async : false,     
      error: function (data) {
        alert("请求失败");
      },
      success: function (data){
    	  //alert(data)
    	 // $("#regsubmit").click(function () {})
    	 var arr=data.split('+')
    	 //alert(arr[0])
    	 $("#showname").text(arr[1]);
    	 $("#showid").text(arr[0].split(':')[1]);
    	 $("#shownumber").text(arr[3]);
    	 $("#showsex").text(arr[2]);
    	 $("#showtype").text(arr[4]);
    	 $("#showpd").text(arr[5]);
      }
	})
	
	
	
})