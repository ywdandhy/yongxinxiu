package com.ywd.util.other;
/**
 * 
 * @author ywd
 * 返回的类
 */
public class ReturnObj {
	/**
	 * 是否成功
	 */
	boolean isSuccess;
	
	/**
	 * 提示消息
	 */
	String message;
	
	/**
	 * 返回对象
	 */
	Object object;
	
	public ReturnObj(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	public ReturnObj(boolean isSuccess,String message) {
		this.isSuccess = isSuccess;
		this.message = message;	
	}
	
	public ReturnObj(boolean isSuccess,String message,Object object) {
		this.isSuccess = isSuccess;
		this.message = message;
		this.object = object;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	
	
	
}
