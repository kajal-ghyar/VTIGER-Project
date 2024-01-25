package Practice;

import java.io.IOException;

import GenricUtilities.ExcelFileUtility;
import GenricUtilities.JavaUtility;
import GenricUtilities.PropertyFIleUtility;

public class GenricUtilitiesMethodPractice {

	public static void main(String[] args) throws IOException 
	{
				PropertyFIleUtility p=new PropertyFIleUtility();
				String value = p.readDataFromPropertyFile("username");
				System.out.println(value);
				
				ExcelFileUtility e=new ExcelFileUtility();
				String val = e.readDataFromExcelFile("sheet2", 1, 2);
				System.out.println(val);
				
				JavaUtility j=new JavaUtility();
				String date=j.getSystemDate();
				System.out.println(date);

				
		
	}
}
		
//caller function//user---
		//int sum=add(12,50);
		//System.out.println(sum);
	
		
		/*public static int add(int a, int b)
		{
			//called function generic method reusable
			int c=a+b;
			return c;
		}*/
	


