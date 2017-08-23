package com.feecreate.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

//import javax.activation.MimetypesFileTypeMap;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.feecreate.common.UploadUtils;



@Controller
public class UploadController {
	@Autowired 
	private UploadUtils uploadUtils;

	@RequestMapping("/upload")
	public String fileUpload(@RequestParam("file") CommonsMultipartFile file, RedirectAttributes attr,
			HttpServletRequest request) throws IOException {
		
		
		
		
		String path = "D:/Users/Administrator/GraduationProject/feecreate-manager/feecreate-manager-web/src/main/webapp/WEB-INF/file/"
				+ file.getOriginalFilename();
		
		// 
		
		File newFile = new File(path);
		//获取文件呢类型
		//String filetype = new MimetypesFileTypeMap().getContentType(newFile);
		file.transferTo(newFile);
		//重新设置文件名
		//newFile.renameTo(new File(""));
		
		try {
			String result = uploadUtils.uploadUtils(newFile);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		return "ExFormat";
	}
}
