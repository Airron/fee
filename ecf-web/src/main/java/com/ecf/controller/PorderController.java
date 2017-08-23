package com.ecf.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecf.pojo.Pcftype;
import com.ecf.pojo.Porder;
import com.ecf.pojo.User;
import com.ecf.service.PorderService;

@Controller
public class PorderController {

	@Autowired
	private PorderService porderService;

	@RequestMapping("/project/neworder")
	public String newOrder(Porder porder, Map<String, Object> map, Pcftype pcftype, HttpServletResponse response)
			throws IOException {
		// 创建新的订单
		//检测检测用户是否登录
		if (porder.getUid() == null) {
			response.setContentType("text/html; charset=UTF-8"); // 转码
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('请登录');");
			out.println("history.back();");
			out.println("</script>");
		} else {
			List<Porder> orderList = porderService.newOrder(porder, pcftype);
			//检测剩余的参与次数是否足够
			if (orderList == null) {
				response.setContentType("text/html; charset=UTF-8"); // 转码
				PrintWriter out = response.getWriter();
				out.flush();
				out.println("<script>");
				out.println("alert('剩余参与数量不足，请重新输入或选择其他参与方式');");
				out.println("history.back();");
				out.println("</script>");
			}
			// 
			else {
				map.put("neworderlist", orderList.get(0));
				map.put("pcfintrouce", pcftype.getPcfintrouce());

				return "neworder";
			}
		}
		return "#";
	}

	@RequestMapping("/myorder")
	public String myOrder(@RequestParam("uid") int uid, Porder porder, HttpSession session, Map<String, Object> map) {
		// int uids = (int) session.getAttribute("user.uid");
		porder.setUid(uid);
		List<Porder> myOrderList = porderService.getMyOrder(uid);

		map.put("myorderlist", myOrderList);

		return "myorder";
	}
	@RequestMapping("/project/neworder/pay")
	public String projectPay(){
		return "paysuccess";
	}
}
