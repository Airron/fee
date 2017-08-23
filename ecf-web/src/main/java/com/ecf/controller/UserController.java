package com.ecf.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecf.pojo.User;
import com.ecf.service.UserService;

@Controller
public class UserController {

	/* 注册 */
	@Autowired
	private UserService userService;

	@RequestMapping("/user/regist")
	public String userRegist(User user,HttpServletResponse response) throws IOException {
		String result = userService.regist(user);
		System.out.println(result);
		if (result.equals("registsuccess")){
			response.setContentType("text/html; charset=UTF-8"); //转码
		    PrintWriter out = response.getWriter();
		    out.flush();
		    out.println("<script>");
		    out.println("alert('注册成功');");
		    out.println("history.back();");
		    out.println("</script>");
		}
		else{
			response.setContentType("text/html; charset=UTF-8"); //转码
		    PrintWriter out = response.getWriter();
		    out.flush();
		    out.println("<script>");
		    out.println("alert('注册失败,请输入合法的内容');");
		    out.println("history.back();");
		    out.println("</script>");
		}
		return "/";
	}

	@RequestMapping("/user/login")
	public String userLogin(User user, HttpServletRequest request,HttpServletResponse response) throws IOException {
		if (user != null) {
			System.out.println(user.getUemail());
			List<User> result = userService.login(user);
			if (result == null){
				response.setContentType("text/html; charset=UTF-8"); //转码
			    PrintWriter out = response.getWriter();
			    out.flush();
			    out.println("<script>");
			    out.println("alert('用户名或密码错误');");
			    out.println("history.back();");
			    out.println("</script>");
			}
			else{
				request.getSession().setAttribute("user", result.get(0));
			return "loginsuccess";
			}

		}
		return "/";
			
	    
	}

	@RequestMapping("/user/setting")
	public String userSetting(User user, HttpServletRequest request){

//		String remessage = " 登录成功";
		
		
		System.out.print(user.getUaddress()+user.getUimage());
		
		//调用更新用户信息的service
		List<User> result = userService.setting(user);
		//更新成功后返回的已更新的用户信息的list，  判断返回的list是否为空，如果不空就将结果存入session
		if (result != null) {
			request.getSession().setAttribute("user", result.get(0));
//			remessage = "修改成功";

		} else {
//			remessage = "修改失败";

		}

//		request.getAttribute(remessage);
		
		return "setting";

	}
}
