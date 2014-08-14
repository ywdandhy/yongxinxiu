
// ip地址验证
var validate = {
ipValid : {
	validator : function(value, param) {
		var result = false;
		var dataArray = value.split(".");
		if (dataArray.length == 4) {
			var num = 0;
			var index = 0;
			for (var i = 0; i < 4; i++) {
				if (dataArray[i] != "") {
					num = Number(dataArray[i]);
					if (num <= 255 && num >= 0) {
						index++;
					}
				}
			}

			if (index == 4) {
				result = true;
			}
		}

		return result;
	},
	message : "格式不正确，例：192.168.1.1,数字大小不超过255"
},
idcard : {// 验证身份证
	validator : function(value) {
		return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value);
	},
	message : '身份证号码格式不正确'
},

// 文件夹不能有"/"和"."的验证
isFolder : {
	validator : function(value, param) {
		var regExp = new RegExp('.?\\/.?|.?\\..?|.?\\-.?|.?\\s.?|.?\\+.?|.?\\=.?');
		return !regExp.test(value);
	},
	message : "名称不能包含斜杠,减号,加号,等于号,点和空格"
},
isFile : {
	validator : function(value, param) {
		var regExp = new RegExp('.?\\/.?|.?\\-.?|.?\\s.?|.?\\+.?|.?\\=.?');
		return !regExp.test(value);
	},
	message : "名称不能包含斜杠,减号,加号,等于号和空格"
},
floatOrInt : {// 验证是否为小数或整数
	validator : function(value) {
		return /^(\d{1,3}(,\d\d\d)*(\.\d{1,3}(,\d\d\d)*)?|\d+(\.\d+))?$/i.test(value);
	},
	message : '请输入数字，并保证格式正确'
},
currency : {// 验证货币
	validator : function(value) {
		return /^d{0,}(\.\d+)?$/i.test(value);
	},
	message : '货币格式不正确'
},
qq : {// 验证QQ,从10000开始
	validator : function(value) {
		return /^[1-9]\d{4,9}$/i.test(value);
	},
	message : 'QQ号码格式不正确(正确如：453384319)'
},
chinese : {// 验证中文
	validator : function(value) {
		return /^[\u0391-\uFFE5]+$/i.test(value);
	},
	message : '请输入中文'
},
english : {// 验证英语
	validator : function(value) {
		return /^[A-Za-z]+$/i.test(value);
	},
	message : '请输入英文'
},
unnormal : {// 验证是否包含空格和非法字符
	validator : function(value) {
		return /.+/i.test(value);
	},
	message : '输入值不能为空和包含其他非法字符'
},

reName : {
	validator : function(value, param) {
		var regExp = new RegExp('.?\\/.?');
		return !regExp.test(value);
	},
	message : "文件夹名不能包含斜杠"
},
//不能全是数字
noNumberStr : {
	validator : function(value, param) {
		return isNaN(value);
	},
	message : "不能全是数字"
},
// 正则表达式验证
custRegExp : {
	validator : function(value, param) {
		var regExp = new RegExp('.\\/.');

		return regExp.test(value);
	},
	message : "请输入正确的形式"
},
zeroToOneDouble : {
	validator : function(value, param) {
		var regExp = new RegExp('(0.(\d)+)|[0-1]');
		return regExp.test(value);
	},
	message : "请输入介于0-1之中的值"
},

// 整数判断
// 事例：
// intValid[9],intValid[,9] 表示最小值为9
// intValid[0,9] 表示取值范围为0-9
// intValid[,9] 表示最大值为9
intValid : {
	validator : function(value, param) {
		// 先验证是否为整数
		var regExp = new RegExp(/^-?\d+$/);
		if (!regExp.test(value)) {
			$.fn.validatebox.defaults.rules.intValid.message = "只能输入整数";
			return false;
		}

		var isValueCorrect = true; // 判断指定值是否在某一范围内
		if (param != null) {
			switch (param.length) {
				case 1 : // intValid[9] 表示最小值为9
					isValueCorrect = (value >= param[0]);
					$.fn.validatebox.defaults.rules.intValid.message = "最小值为{0}";
					break;

				case 2 :
					if (typeof(param[0]) == "undefined") { // intValid[,9]
						// 表示最大值为9
						isValueCorrect = (value <= param[1]);
						$.fn.validatebox.defaults.rules.intValid.message = "最大值为{1}";
					} else if (typeof(param[1]) == "undefined") { // intValid[9,]
						// 表示最小值为9
						isValueCorrect = (value >= param[0]);
						$.fn.validatebox.defaults.rules.intValid.message = "最小值为{0}";
					} else { // intValid[0,9] 表示取值范围为0-9
						isValueCorrect = ((value >= param[0]) && (value <= param[1]));
						$.fn.validatebox.defaults.rules.intValid.message = "范围为{0}到{1}";
					}
					break;

				defalut : isValueCorrect = true;
		}
	}

		return isValueCorrect;
	},
	message : ""
},

phone : {
	validator : function(value, param) {
		var test = /(\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$/.test(value);
		return test;
	},
	message : '电话格式不正确'
},
mobile : {
	validator : function(value, param) {
		var test = /^0?(13[0-9]|15[012356789]|18[0236789]|14[57])[0-9]{8}$/.test(value);
		return test;
	},
	message : '手机号格式不正确'
},

postcode : {
	validator : function(value, param) {
		return /^[1-9]\d{5}$/.test(value);
	},
	message : '邮政编码不存在'
},
intOrFloat : {// 验证整数或小数 
    validator : function(value) { 
        return /^\d+(\.\d+)?$/i.test(value); 
    }, 
    message : '请输入数字，并确保格式正确' 
},

password : {// 验证整数或小数 
    validator : function(value) {
    	if(value == ""){
    		return false;
    	}
        return /^\s*[.A-Za-z0-9_-]{6,20}\s*$/.test(value); 
    }, 
    message : '请输入6-20位的数字或字母' 
}


}
