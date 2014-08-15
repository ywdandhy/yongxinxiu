$(function() {

	$("#loginButton").kendoButton();
	$("#registButton").kendoButton();
	$("#phone_number").keyup(function() {
		validateMobile();
	});
	$("#phone_number").change(function() {
		validateMobile();
	});
	/**
	 * 手机号码验证
	 */
	var validateMobile = function() {
		var phoneValidate = validate.mobile;
		var phoneNumber = $("#phone_number").val();
		var isPhone = phoneValidate.validator(phoneNumber);
		if (isPhone) {
			$(".phone_number_error_span").hide();
			$("#login_right").show();
			checkMobile(phoneNumber);
		} else {
			$(".phone_number_error_span").show();
			$("#login_right").hide();
			$(".phone_number_error").text(phoneValidate.message);
			$("password2Tr").hide();
			$("nickNameTr").hide();
		}
		return isPhone;
	};

	/**
	 * 注册时绑定密码验证事件
	 */
	var validateRegistPasswordBind = function() {
		$("#password").keyup(function() {
			validateRegistPassword();
		});
		$("#password").change(function() {
			validateRegistPassword();
		});
		$("#password2").keyup(function() {
			validateRegistPassword2();
		});
		$("#password2").change(function() {
			validateRegistPassword2();
		});

	};

	/**
	 * 登陆时解除绑定密码验证事件
	 */
	var validateRegistPasswordUnbind = function() {
		$("#password").unbind();
	};

	/**
	 * 注册时验证MOMA是否符合规范，6-30位的字母或数字
	 */
	var validateRegistPassword = function() {
		var password = $("#password").val();
		var passwordValidate = validate.password;
		var isPassword = passwordValidate.validator(password);
		if (isPassword) {
			$(".password_message_error_span").hide();
			$("#password_right").show();
		} else {
			$("#password_right").hide();
			$(".password_message_error_span").show();
			$(".password_message_error").text(passwordValidate.message);
		}
		return isPassword;
	};

	var validateRegistPassword2 = function() {
		var password = $("#password").val();
		var password2 = $("#password2").val();
		console.info(password);
		console.info(password2);
		if (password != password2) {
			$("#password2_right").hide();
			$(".password2_message_error_span").show();
			$(".password2_message_error").text("两次输入的密码不一致");
			return false;
		} else {
			$(".password2_message_error_span").hide();
			$("#password2_right").show();
			return true;
		}
	};

	var checkMobile = function(mobile) {
		$.ajax({
			url : 'checkMobile.do',
			dataType : 'json',
			type : 'post',
			data : {
				mobile : mobile
			},
			success : function(date) {
				if (!date) {
					$("#password2Tr").show();
					$("#nickNameTr").show();
					$("#login_right").hide();
					$(".phone_number_error_span").show();
					$(".phone_number_error_span").text("手机尚未注册，请注册");
					$("#loginButton").hide();
					$("#registButton").show();
					validateRegistPasswordBind();
				} else {
					$("#password2Tr").hide();
					$("#nickNameTr").hide();
					$("#login_right").show();
					$(".phone_number_error_span").hide();
					$("#loginButton").show();
					$("#registButton").hide();
					validateRegistPasswordUnbind();
				}
			},
			error : function() {
			}
		});
	};

	// 登陆
	$("#loginButton").click(function() {
		var isMobileRigth = validateMobile();
		var isRegistRight = validateRegistPassword();
		if (isMobileRigth && isRegistRight) {

		}
	});

	//登陆开始
	var loginStart = function() {
		
	};
	//注册开始
	var registStart = function() {
		
	};

	// 注册
	$("#registButton").click(function() {

	});

});
