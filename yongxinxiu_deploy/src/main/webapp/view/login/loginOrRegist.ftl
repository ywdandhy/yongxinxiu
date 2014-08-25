<html>
<head>
<script src="/staticPage/js/loginOrRegist.js"></script>
</head>
<body>
<div class = "loginContent">
	<div class = "registContent">
		<table>
			<tr height="60px">
				<td>
					<button id="loginButton" class="btn btn-success" >登陆</button>
					<button id="registButton" class="btn btn-primary" style="display:none">注册</button>
				</td>
                <td></td>
                <td></td>
                <td></td>
			</tr>
			<tr height="60px">
				<td><label for="phone_number">手机号:</label></td>
                <td><input id="phone_number" name="mobile" placeholder="请输入手机号码"style="height:38px" type="text" value="" /></td>
                <td><span style="display:none" class="login_message_error phone_number_error_span" >
	                	<div></div>
	                	<span class="phone_number_error"></span>
                	</span>
                	<span style="display:none" id ="login_right" class="login_message_right "></span>
                </td>
                <td></td>
			</tr>
			<tr height="60px">
				<td><label for="password">输入密码:</label></td>
                <td><input id="password" style="height:38px" placeholder="请输入密码" name="password" type="password" value="" /></td>
                <td><span style="display:none" class="login_message_error password_message_error_span">
	                	<div></div>
	                	<span class="password_message_error"></span>
                	</span>
               		<span style="display:none" id="password_right" class="login_message_right" >
               	</td>
                <td></span></td>
			</tr>
			<tr height="60px" id='password2Tr' style="display:none">
				<td><label for="password2">重复密码:</label></td>
                <td><input id="password2" placeholder="请再次输入密码" style="height:38px" type="password" value="" /></td>
                <td><span style="display:none" class="login_message_error password2_message_error_span">
                		<div></div>
	                	<span class="password2_message_error"></span>
					</span>
                	<span style="display:none" id="password2_right"  class="login_message_right" ></td>
                <td></span></td>
			</tr>
			<tr height="60px" id='nickNameTr' style="display:none">
				<td><label for="nickName">昵称:</label></td>
                <td><input class="loginInput" id="nickName" style="height:38px" name="name" type="text" value="" /></td>
                <td><span style="display:none" class="login_message_error"></span></td>
                <td><span style="display:none" class="login_message_right" ></span></td>
			</tr>
		</table>
	</div>
</div>
</body>
</html>