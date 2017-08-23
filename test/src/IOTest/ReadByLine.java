package IOTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReadByLine {
	
	@Before
	public  void getFilePath(){
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		
		
	}
	
//	@After
//	public void afterclass(){
//		
//	}

	@Test
	public void outmytext() throws ParseException{
		File myfile = new File("D:/data/testfile.txt");
		
		BufferedReader reader = null;
		
		 try {
	            System.out.println("以行为单位读取文件内容，一次读一整行：");
	            reader = new BufferedReader(new FileReader(myfile));
	            String tempString = null;
	            int line = 1;
	            // 一次读入一行，直到读入null为文件结束
	            while ((tempString = reader.readLine()) != null) {
	                // 显示行号
	            	//++++++++++++++++++++++++++++++++
	            	String firstChar = tempString.substring(0, 1);
	            	//判断，如果当前时间
	            	if(firstChar.equals("1")){
	            		int msgLength = tempString.length();
	            		int msgLastIndex = tempString.lastIndexOf(tempString);
	            		//获取到最后一个字符选择的内容并将其转换成int类型
	            		//将获取到的数字预先运算，以便与后面日期相加
	            		int chooseNum = Integer.valueOf(tempString.substring(msgLastIndex));
	            		int chooseDate = 5-chooseNum;
	            		//取第五个日期的文本记录内容
	            		String msgDateFive = tempString.substring(msgLastIndex-16,msgLastIndex-6);
	            		//设置日期格式，将文本内容转换成日期格式
	            		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
	            		Date date1 = myFormatter.parse(msgDateFive);
	            		Calendar c = Calendar.getInstance();
	            		c.setTime(date1);
	            		c.add(Calendar.DAY_OF_MONTH, chooseDate);
	            		//date2，获取到的当前选择的时间，并存入数据库
	            		Date date2 = c.getTime();
	            		
	            	}
	            	
	                System.out.println("line " + line + ": " + tempString);
	                line++;
	            }
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	
}
