package com.ecf.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecf.pojo.Project;
import com.ecf.service.ProjectService;

@Controller
public class UploadController {

	// @RequestMapping("/newproject/imgupload")
	// public String imgUpload(HttpServletRequest request,@RequestParam("file")
	// MultipartFile file)throws IllegalStateException,IOException{
	// //@RequestParam("file") MultipartFile file,
	// CommonsMultipartResolver multipartResolver = new
	// CommonsMultipartResolver(request.getSession().getServletContext());
	// if(multipartResolver.isMultipart(request)){
	// //转换成多部分request
	// MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)
	// request;
	// //取得request中所有文件名
	// Iterator<String> iter = multiRequest.getFileNames();
	// while(iter.hasNext()){
	// //取得上传文件
	// MultipartFile f = multiRequest.getFile(iter.next());
	// if(f != null){
	// //取得上传文件名称
	// String myFileName = f.getOriginalFilename();
	// //如果文件名不为“”说明文件存在，否则说明文件不存在
	// if(myFileName.trim()!=""){
	// //定义上传路径
	// String path =
	// "D://Users/Administrator/GraduationProject/ecf-web/src/main/webapp/WEB-INF/img"+myFileName;
	// File localFile = new File(path);
	// f.transferTo(localFile);
	// }
	//
	// }
	// }
	// }
	// return null;
	// }

	/*
	 * 通过流的方式上传文件
	 * 
	 * @RequestParam("file") 将name=file控件得到的文件封装成CommonsMultipartFile 对象
	 */
	/*
	 * @RequestMapping("/fileUpload") public String
	 * fileUpload(@RequestParam("file") CommonsMultipartFile
	 * file,HttpServletResponse response) throws IOException {
	 * 
	 * 
	 * //用来检测程序运行时间 long startTime=System.currentTimeMillis();
	 * System.out.println("fileName："+file.getOriginalFilename());
	 * 
	 * try { //获取输出流 OutputStream os=new FileOutputStream("E:/"+new
	 * Date().getTime()+file.getOriginalFilename()); //获取输入流
	 * CommonsMultipartFile 中可以直接得到文件的流 InputStream is=file.getInputStream();
	 * int temp; //一个一个字节的读取并写入 while((temp=is.read())!=(-1)) { os.write(temp);
	 * } os.flush(); os.close(); is.close();
	 * 
	 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } long endTime=System.currentTimeMillis();
	 * System.out.println("方法一的运行时间："+String.valueOf(endTime-startTime)+"ms");
	 * response.setContentType("text/html; charset=UTF-8"); //转码 PrintWriter out
	 * = response.getWriter();
	 * 
	 * out.flush(); out.println("<script>"); out.println("alert('请登录');");
	 * out.println("history.back();"); out.println("</script>"); return null; }
	 */

	/*
	 * 采用file.Transto 来保存上传的文件
	 */
	@Autowired
	private ProjectService projectService;

	@RequestMapping("/newproject/imgupload")
	public String fileUpload2(@RequestParam("file") CommonsMultipartFile file, HttpServletResponse response,
			HttpServletRequest request, Project project, RedirectAttributes attr) throws IOException {

		long startTime = System.currentTimeMillis();
		System.out.println("fileName：" + file.getOriginalFilename());
		String path = "D:/Users/Administrator/GraduationProject/ecf-web/src/main/webapp/WEB-INF/img/"
				+ file.getOriginalFilename();
		// 将项图片加入到相关项目中去

		System.out.println("系统路径" + request.getContextPath());

		File newFile = new File(path);
		// 通过CommonsMultipartFile的方法直接写文件（注意这个时候）
		file.transferTo(newFile);
		long endTime = System.currentTimeMillis();
		System.out.println("方法二的运行时间：" + String.valueOf(endTime - startTime) + "ms");

		project.setPcontent("/img/" + file.getOriginalFilename());
		if (project.getUser() == null) {
			response.setContentType("text/html; charset=UTF-8"); // 转码
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('请登录');");
			out.println("history.back();");
			out.println("</script>");
		} else {
			int result = projectService.newproject(project);
			// String returnpage = "/project?projectid="+String.valueOf(result);
			// 请求转发，添加参数
			// attr.addAttribute("projectid",result);
			// return "redirect:/project";
			if (result != 0) {
				response.setContentType("text/html; charset=UTF-8"); // 转码
				PrintWriter out = response.getWriter();
				out.flush();
				out.println("<script>");
				out.println("alert('项目发起成功');");
				out.println("history.back();");
				out.println("</script>");
			}
		}

		return "/";
	}

}
