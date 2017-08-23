package test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class junittest {
//	@Test
//	public void Test(){
//		double a = 500000;
//		double b = 100000;
//		
//		double c = Math.ceil(b/a);
//		System.out.println(c);
//	}
	
//	@Test
//	public void Test2(){
//		int pid ;
//		String test2 = "image/pj3.jpg#img/pj2#";
//		String [] a = test2.split("#");
//		for(String arr:a){
//			System.out.println(arr);
//		}
//		
//	}
	@SuppressWarnings("null")
	@Test
	public void Test3(){
		String str = "img/pj3_1.jpg#img/pj3_2.jpg#img/pj3_3.jpg#img/pj3_4.jpg#img/pj3_5.jpg#img/pj3_6.jpg#img/pj3_7.jpg#img/pj3_8.jpg#img/pj3_9.jpg#img/pj3_10.jpg#";
		String[] projectImage = str.split("#");
		
		
		
		
		
		
		//List<String> imgList = new ArrayList<String>();
		Map<String,Object> map = new HashMap<String,Object>();
		
//		map.put("imgsrc", projectImage);

		
		
//		String[] projectImage = projectByPid.get(0).getPimage().split("#");
		for(int t=0;t<projectImage.length;t++){
			//String ts = String.valueOf(t);
			map.put("imgsrc", projectImage[t]);
			//imgList.add(t, projectImage[t]);	
		//System.out.println(map.get(ts));
		}
//		for(String imgsrc:map.keySet()){
//			System.out.println(map.get(imgsrc));
//		}
		
		
		//List<String[]> pjlist = new ArrayList<String[]>();
		//Iterator<map> iterator = new Iterator<ts>();
//		Map<String, Object> map2 = new HashMap<String,Object>();
//		map2.put("key2", map);
//		System.out.println(map2.get("key2"));
//		for(String imgs: map){
//			System.out.println(imgs);
//		}
		//将数组插入map
		
		
	}


}
