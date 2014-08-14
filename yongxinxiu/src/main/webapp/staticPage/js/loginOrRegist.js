$(function(){
	$("#phone_number").keyup(function() {
		var phoneValidate = validate.mobile;
		var phoneNumber = $("#phone_number").val();
		console.info(phoneNumber);
		if(!phoneValidate.validator(phoneNumber)){
			$(".phone_number_error").show();
			$(".login_message_right").hide();
			$(".phone_number_error").text(phoneValidate.message);
			$("password2Tr").hide();
			$("nickNameTr").hide();
		}else{
			$(".phone_number_error").hide();
			$(".login_message_right").show();
			checkMobile(phoneNumber);
		}
		
	});
	
var checkMobile = function(mobile){
	$.ajax({
		url:'checkMobile.do',
		dataType : 'json',
		type : 'post',
		data:{
			 mobile:mobile
		},
		success : function(date) {
			if(!date){
				$("#password2Tr").show();
				$("#nickNameTr").show();
				$(".login_message_right").hide();
				$(".phone_number_error").show();
				$(".phone_number_error").text(phoneValidate.message);
			}
		},
		error : function() {
		}
	});
}	
	
});

