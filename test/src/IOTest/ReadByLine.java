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
	            System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
	            reader = new BufferedReader(new FileReader(myfile));
	            String tempString = null;
	            int line = 1;
	            // һ�ζ���һ�У�ֱ������nullΪ�ļ�����
	            while ((tempString = reader.readLine()) != null) {
	                // ��ʾ�к�
	            	//++++++++++++++++++++++++++++++++
	            	String firstChar = tempString.substring(0, 1);
	            	//�жϣ������ǰʱ��
	            	if(firstChar.equals("1")){
	            		int msgLength = tempString.length();
	            		int msgLastIndex = tempString.lastIndexOf(tempString);
	            		//��ȡ�����һ���ַ�ѡ������ݲ�����ת����int����
	            		//����ȡ��������Ԥ�����㣬�Ա�������������
	            		int chooseNum = Integer.valueOf(tempString.substring(msgLastIndex));
	            		int chooseDate = 5-chooseNum;
	            		//ȡ��������ڵ��ı���¼����
	            		String msgDateFive = tempString.substring(msgLastIndex-16,msgLastIndex-6);
	            		//�������ڸ�ʽ�����ı�����ת�������ڸ�ʽ
	            		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
	            		Date date1 = myFormatter.parse(msgDateFive);
	            		Calendar c = Calendar.getInstance();
	            		c.setTime(date1);
	            		c.add(Calendar.DAY_OF_MONTH, chooseDate);
	            		//date2����ȡ���ĵ�ǰѡ���ʱ�䣬���������ݿ�
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
