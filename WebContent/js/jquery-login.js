var u_idInput; 
var u_passwdInput;

$("document").ready(function () {
  
$("#loginpage").click(function () {
	$("#u_passwd1").text("")
    // 获得全局变量

  u_idInput = $('input[name="u_id"]');
  u_passwdInput = $('input[name="u_passwd"]');
 // u_idInputv = u_idInput.val();
 // u_passwdInputv = u_passwdInput.val();
 // alert(u_idInputv)
 // alert(u_passwdInputv)
  
  $.ajax({
      url: "logins",
      type: "post",
      async :false,
      data: {
        u_id:u_idInput.val(),
        p_id:u_passwdInput.val()
      },
      dataType: "text",
     
      error: function (data) {
        alert("请求失败");
      },
      
      success: function (data) {
          //alert("请求成功")
          var a=data.substr(5,1)
  
          if(a=='0'){
        	  $("#u_passwd1").text("密码错误")
        	  $("#u_passwd1").css("color","red")
          }
          else if(a=='1'){
        	  //alert(a)
        	  
        	  location.href ="index.jsp?uid="+u_idInput.val();
          }
          else if(a=='2'){
        	  $("#u_passwd1").text("此id并未注册")
        	  $("#u_passwd1").css("color","red")
        	  
          }
         
          
            }

})

      
  })
  return false;
 
  })

