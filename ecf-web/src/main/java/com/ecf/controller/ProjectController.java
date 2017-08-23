package com.ecf.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecf.pojo.Pcftype;
import com.ecf.pojo.Porder;
import com.ecf.pojo.Project;
import com.ecf.service.PcftypeService;
//import com.ecf.pojo.ProjectWithBLOBs;
import com.ecf.service.ProjectService;

@Controller
public class ProjectController {

//	@RequestMapping("/project/catelist")
//	public String getCatelist(){
//		
//		return 		
//	}
	/*
	 *项目分类的controller 
	 * 	
	 */
	@Autowired
	private ProjectService projectService;
	@Autowired
	private PcftypeService pcftypeService;
	
	//这是显示某个分类下的项目浏览的controller
	@RequestMapping("/project/cate/{pcategoryid}")
	public String showProjectByCate(@PathVariable int pcategoryid,Project project,Map<String,Object> map,HttpServletRequest request,Model model){
		System.out.println("执行查看项目详情");
		
		
		
		//根据分类的id，来查询所有该分类的项目
		List<Project> projectListByCate = projectService.getProjectByCate(pcategoryid);
		
			
		map.put("projectbycate", projectListByCate);
		
		return "projectbycate";
		
		
	}
	
	
	//这是显示单个项目详细内容的controller
	@SuppressWarnings("null")
	@RequestMapping("/project")
	public String showProjectByPid(@RequestParam("projectid")int projectid,Project project,Map<String, Object> map,HttpServletRequest request,Model model){
		List<Project> projectByPid = projectService.getPorjectByPid(projectid);
		if(projectByPid != null){
			
//			request.setAttribute("pjb", projectByPid.get(0));
			double goal =projectByPid.get(0).getPgoal();
			double pledged = projectByPid.get(0).getPpledged();
			double processpercent = Math.ceil((pledged/goal)*100);
//			double projectPercent = Math.ceil(projectByPid.get(0).getPpledged()/projectByPid.get(0).getPgoal()*100);
//			System.out.println(goal);
//			System.out.println(pledged);
//			System.out.println(processpercent);
//			request.setAttribute("pjbp", processpercent);
			
//			List<String> imgList = null;
//			for(String imgs: imgList){
//			System.out.println(imgs);
//		}
//		imagesList.add(projectImage);
		
		
//		for(int i=0;i<image.length;i++)
//		{
//		imagesList.add(image[i]);
//		@SuppressWarnings("unused")
//		String showImages = imagesList.get(i);
//		}
		
		
		//map.put("imagesList", imgMap);
//			imgList.add(t,projectImage[t]);	

			
			//对获取的pimage字段中的字符串进行分割，并存入字符串数组projectImage
			String[] projectImage = projectByPid.get(0).getPimage().split("#");
			
			//将分割后的字符串存入map
			Map<String,String> imgMap = new HashMap<String,String>();
			
			for(int t=0;t<projectImage.length;t++){
				String ts = String.valueOf(t);
				imgMap.put(ts, projectImage[t]);

			}
			//将图片的imagemap存入map，在页面中获取
			request.setAttribute("imglist", imgMap);	

			List<Pcftype> pcfList = pcftypeService.getPcftype(projectid);
			if(pcfList != null){
				request.setAttribute("pcflist", pcfList);
			}
			else{
				
			}

			map.put("pjb", projectByPid.get(0));
			map.put("pjbp",processpercent);
		return "project";
		}
		else return "error";
	}
	
	@RequestMapping("/newproject/start")
	public String startProject(HttpServletResponse response,Project project) throws IOException, ParseException{
		/*
		 *  发起众筹
		 * 
		 * 	*/
		
		
		
		if(project.getUser() == null){
			response.setContentType("text/html; charset=UTF-8"); //转码
		    PrintWriter out = response.getWriter();
		    out.flush();
		    out.println("<script>");
		    out.println("alert('请登录');");
		    out.println("history.back();");
		    out.println("</script>");
		}
		//设置项目开始时间
		Date date = new Date();
		//设置当前时间
		project.setPstartdate(date);
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		
		//Calendar.getInstance()
		Calendar calendar = Calendar.getInstance();
		
		
		
		//设置结束时间
		//project.setPenddate(penddate);
		
		
		String tpj=project.getPname();
		
		System.out.println(tpj);
		System.out.println(project.getPcategoryid());
		System.out.println(project.getUser());
		System.out.println(project.getPblurb());
		System.out.println(project.getPstartdate());
		System.out.println(project.getPenddate());
		/*System.out.println(project.);
		System.out.println(project.);*/
		//projectService.BasicMessage
		
		//projectService.startProject(project);
		
		
		
		
		return null;
	}
	
	
	
}
