package com.ywd.util.other;

public class StringUtil {
	/**
	 * 判断string是否为null或者为""
	 * @param string
	 * @return
	 */
	public static boolean  isRealNull(String string) {
		if (null == string) {
			return true;
		}else if(string.equals("")){
			return true;
		}
		return false;

	}
}
