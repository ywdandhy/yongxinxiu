$(document).ready(function() {
	
	
	var loginDia = $("#loginDia");

	$("#login").click(function() {
		if(!loginDia.data("kendoWindow")){
			loginDia.kendoWindow({
				width : "650px",
				height: "400px",
				title : "登陆和注册",
				actions : [ "Close" ],
				content : "/loginOrRegist.do"
			});
			loginDia.data("kendoWindow").center();
		}else{
			loginDia.data("kendoWindow").open();
			loginDia.data("kendoWindow").center();
		}
		
	});

	

});