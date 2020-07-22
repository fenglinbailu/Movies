var u_idInput; 
var u_passwdInput;
var conu_passwdInput;
var u_nameInput;
var p_numberInput;
var p_dInput;
var u_sexInput;
var m_typeInput;
$("document").ready(function () {
	// alert("1111111111111")
  
$("#regsubmit").click(function () {
    // 获得全局变量
	//location.reload(true);
  u_idInput = $('input[name="user_id"]');
  u_passwdInput = $('input[name="passid"]');
  conu_passwdInput = $('input[name="con_passid"]');
  u_nameInput = $('input[name="username"]');
  p_numberInput = $('input[name="phone_number"]');
  p_dInput = $('input[name="Personal_declaration"]');
  u_sexInput = $('input[name="sex"]:checked');
  m_typeInput = $("input[name='subject']:checked");
  //alert(u_nameInput.val());
 
  
 // u_idInputv = u_idInput.val();
 // u_passwdInputv = u_passwdInput.val();
  var regex = /^[^_][A-Za-z]*[a-z0-9_]*$/ ;
  var ret=regex.test(u_idInput.val());
  var ret1=regex.test(u_passwdInput.val());
  //alert(u_idInput.val().length)
  if(ret==true&&u_idInput.val().length>6&&u_idInput.val().length<16&&ret==true&&
		  u_passwdInput.val().length>6&&u_passwdInput.val().length<16){
	 // alert("1")
	  $("#user_id1").text("ok");
	  $("#user_id1").css("color","green");
	  $("#passid1").text("ok");
	  $("#passid1").css("color","green");

 
  $.ajax({
      url: "registers",
      type: "post",
      async : false,
      data: {
        u_id:u_idInput.val(),
        p_id:u_passwdInput.val(),
        con_id:conu_passwdInput.val(),
        u_name:u_nameInput.val(),
        p_number:p_numberInput.val(),
        p_d:p_dInput.val(),
        u_sex:u_sexInput.val(),
        m_type:$("input[name='subject']:checked").val()
      },
      dataType: "text",
     
      error: function (data) {
        alert("请求失败");
      },
      
      success: function (data) {
          //alert("请求成功")
          var a=data.substr(5,1);
  
          if(a=='0'){
        	  
        	  $("#user_id1").text("注册失败,用户名重复");
        	  $("#user_id1").css("color","red");
         	 $("#con_passid1").text("ok");
        	 $("#con_passid1").css("color","green");
        	 //location.href ="index.html";
          }
          else if(a=='1'){
        	  //alert(a)
        	 location.href ="login.html";
          }
          else if(a=='2'){
        	 //alert("两次密码不一致") ;
        	  $("#user_id1").text("ok");
        	  $("#user_id1").css("color","green");
        	 $("#con_passid1").text("密码不一致");
        	 $("#con_passid1").css("color","red");
          }
         
          //$(location).attr("href","login.html");
            } 

}) 
}
  else if(ret==true&&u_idInput.val().length>6&&u_idInput.val().length<16)
  {
	  alert("2")
	  $("#passid1").text("密码格式不正确");
	  $("#passid1").css("color","red");
	  $("#user_id1").text("ok");
	  $("#user_id1").css("color","green");
	  //location.reload(true);
  }  
  else if(ret==true&&u_passwdInput.val().length>6&&u_passwdInput.val().length<16){
	  alert("3")

	  $("#user_id1").text("id格式不正确");
	  $("#user_id1").css("color","red");
	  $("#passid1").text("ok");
	  $("#passid1").css("color","green");
	  //location.reload(true);
	  
  }
  else{
	  alert("4")
	  $("#passid1").text("密码格式不正确");
	  $("#passid1").css("color","red");
	  $("#user_id1").text("id格式不正确");
	  $("#user_id1").css("color","red");
	  //location.reload(true);
  }
  
  
  })

})