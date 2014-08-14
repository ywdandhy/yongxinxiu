<html>
<head>
<script src="/staticPage/js/loginOrRegist.js"></script>
</head>
<body>
<div class = "loginContent">
	<div class = "registContent">
		<table>
			<tr height="60px">
				<td></td>
                <td> </td>
                <td> </td>
                <td></td>
			</tr>
			<tr height="60px">
				<td><label for="phone_number">手机号:</label></td>
                <td><input id="phone_number" type="text" value="" /></td>
                <td><span style="display:none" class="login_message_error phone_number_error" ></span><span style="display:none" class="login_message_right" >对了</span></td>
                <td></td>
			</tr>
			<tr height="60px">
				<td><label for="password">输入密码:</label></td>
                <td><input id="password" type="password" value="" /></td>
                <td><span class="login_message_error"></span></td>
                <td><span class="login_message_right" ></span></td>
			</tr>
			<tr height="60px" id='password2Tr' style="display:none">
				<td><label for="password2">重复密码:</label></td>
                <td><input id="password2" type="password" value="" /></td>
                <td><span class="login_message_error"></span></td>
                <td><span class="login_message_right" ></span></td>
			</tr>
			<tr height="60px" id='nickNameTr' style="display:none">
				<td><label for="nickName">昵称:</label></td>
                <td><input id="nickName" type="text" value="" /></td>
                <td><span class="login_message_error"></span></td>
                <td><span class="login_message_right" ></span></td>
			</tr>
		</table>
	</div>
</div>
</body>
</html>