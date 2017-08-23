package com.ecf.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecf.pojo.Pcategory;
import com.ecf.pojo.Project;
import com.ecf.service.PcategoryService;
import com.ecf.service.ProjectService;

@Controller
public class PageController {

	@Autowired
	private PcategoryService pcategoryService;
	@Autowired
	private ProjectService projectService;
	@RequestMapping("/")
	public String showIndex(Map<String,Object> map,HttpServletRequest request){
		//获取分类的内容
		List<Pcategory> pcategorylist = pcategoryService.getPcategory();
		request.getSession().setAttribute("pcategorylist", pcategorylist);
		//获取首页的项目
		List<Project> projectRecommend = projectService.getprojectRecommend();
		map.put("recommendlist", projectRecommend);
		return "index";
		
	}
	
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page,HttpServletRequest request){
//		List<Pcategory> pcategorylist = pcategoryService.getPcategory();
//		request.getSession().setAttribute("pcategorylist", pcategorylist);
		return page;
	}
}
