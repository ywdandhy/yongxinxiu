var loadHead = function() {
	$("#indexHeader").load("head.do", function() {
//		var loginDia = $("#loginDia");
		$(".login").click(function() {
			console.info(23);
			$("#loginDia").modal({
				keyboard: false,
				remote : "/loginOrRegist.do"
			}).modal('show');
		});
		// 登出
		$("#loginOut").click(function() {
			loginOutStart();
		});

	});
};

// 登出开始
var loginOutStart = function() {
	$.ajax({
		url : 'loginOut.do',
		type : 'post',
		success : function() {
			console.info(23344);
			loadHead();
		}
	});
};
$(document).ready(function() {
	loadHead();
});
