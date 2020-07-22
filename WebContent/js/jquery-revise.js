var u_idInput; 
var u_passwdInput;
var conu_passwdInput;
var u_nameInput;
var p_numberInput;
var p_dInput;
var u_sexInput;
var m_typeInput;
$("document").ready(function () {
	//alert("1111111111111")
  
$("#regsubmit").click(function () {
    // 获得全局变量
	//location.reload(true);
	//alert("1111111111111")
  u_nameInput = $('input[name="username"]');
  p_numberInput = $('input[name="phone_number"]');
  p_dInput = $('input[name="Personal_declaration"]');
  u_sexInput = $('input[name="sex"]:checked');
  m_typeInput = $("input[name='subject']:checked");
  //alert(u_nameInput.val());
 
  
 // u_idInputv = u_idInput.val();
 // u_passwdInputv = u_passwdInput.val();
  
 
  $.ajax({
      url: "revises",
      type: "post",
      async : false,
      data: {
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
          //alert(data)
    	  var arr=data.split('+')
    	  $("#welcome_id").text(arr[1]);
  
          if(arr[0]=='0'){
        	  
        	 //location.href ="index.html";
          }
          else if(arr[0]=='1'){
        	 alert("修改成功");
        	 location.href ="person.html";
          }
          
         
          //$(location).attr("href","login.html");
            } 

}) 

  
  
  
  })

})