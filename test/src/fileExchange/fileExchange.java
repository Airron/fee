package fileExchange;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class fileExchange {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		
		File myfile = new File("D:/data/testfile.txt");
		BufferedReader reader = null;
		try{
			reader = new BufferedReader(new FileReader(myfile));
			String tempString = null;
			int line = 1;
			while((tempString = reader.readLine())!=null){
				String firstChar = tempString.substring(0, 1);
				//Êä³ö²âÊÔÓï¾ä
				System.out.println(firstChar);
				
				if(firstChar.equals("1")){
					
				
				int tempStringLength = tempString.length();
				String tempDate = tempString.substring(tempStringLength-16,tempStringLength-6);
				
				String lastChar = tempString.substring(tempStringLength-1);
				int lastNum = Integer.valueOf(lastChar);
				System.out.println(lastChar+"×ª"+lastNum);
				//Êä³ö²âÊÔ
				System.out.println(tempDate);
				
				SimpleDateFormat myformatter = new SimpleDateFormat("yyyy-MM-dd");
				System.out.println("--"+ myformatter.parse(tempDate));
				Date date1 = myformatter.parse(tempDate);
				
				Calendar c = Calendar.getInstance();
				c.setTime(date1);
				c.add(Calendar.DAY_OF_YEAR, 5-lastNum);
				Date date2 = c.getTime();
				
				String date3 = myformatter.format(date2);
				System.out.println(date1+"\n"+date2+"\n"+date3);
				
				}
				
				line++;
			}
			reader.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
	}
}

