package com.ywd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ywd.model.User;
import com.ywd.service.User.IUserService;
import com.ywd.util.other.ReturnObj;
import com.ywd.util.other.StringUtil;

@Controller
public class LoginRegistController {
	@Autowired
	IUserService iUserService;
	/**
	 * 登陆注册聚合页
	 * @return
	 */
	@RequestMapping("/loginOrRegist")
	private Object regist() {
		ModelAndView modelAndView = new ModelAndView("/view/login/loginOrRegist.ftl");
		return modelAndView;
	}
	/**
	 * 检查手机是否格式正确，手机是否已经被注册过
	 * @param mobile
	 * @return
	 */
	@RequestMapping(value = "/checkMobile",method = RequestMethod.POST)
	@ResponseBody
	private Object checkMobileIsExist(String mobile) {
		User user = iUserService.queryByMobile(mobile);
		if (null == user) {
			return false;
		}else {
			return true;
		}
		
	}
	/**
	 * 返回头的page
	 * @param session
	 * @return
	 */
	@RequestMapping("/head")
	private Object head(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("/view/resource/head.ftl");
		loadHeader(modelAndView,session);
		return modelAndView;
	}
	
	private void loadHeader(ModelAndView modelAndView,HttpSession session) {
		String userid = (String) session.getAttribute("userid");
		if (null == userid) {
			modelAndView.addObject("isLogin",false);
		}else {
			User user = iUserService.queryById(userid);
			modelAndView.addObject("isLogin",true);
			if (!StringUtil.isRealNull(user.getName())) {
				modelAndView.addObject("name",user.getName());
			}else {
				modelAndView.addObject("name",user.getUsername());
			}
		}
	}
	
	/**
	 * 登陆
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping(value ="/login",method = RequestMethod.POST)
	@ResponseBody
	private Object login(String username,String password,HttpSession session) {
		 ReturnObj returnObj = iUserService.login(username, password);		 
		 if (returnObj.isSuccess()) {
			 User user = (User) returnObj.getObject();
			 session.setAttribute("userid", user.getId());
		}
		 return returnObj;
	}
	
	/**
	 * 登出
	 * @param userid
	 * @param session
	 */
	@RequestMapping(value ="/loginOut",method = RequestMethod.POST)
	@ResponseBody
	private void loginOut(HttpSession session) {
		 session.removeAttribute("userid");
	}
	/**
	 * 注册
	 * @param user
	 * @param session
	 * @return
	 */
	@RequestMapping(value ="/regist",method = RequestMethod.POST)
	@ResponseBody
	private Object regist(User user,HttpSession session) {
		 user.setUsername(user.getMobile());
		 ReturnObj returnObj =  iUserService.registUser(user);
		 if (returnObj.isSuccess()) {
			 User user2 = (User) returnObj.getObject();
			 session.setAttribute("userid", user2.getId());
		}
		 return returnObj;
	}
}
