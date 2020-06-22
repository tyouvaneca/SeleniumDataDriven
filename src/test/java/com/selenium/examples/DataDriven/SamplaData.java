package com.selenium.examples.DataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class SamplaData {
 
	public static void main(String args[]) throws IOException
	{
		ExcelDriven ed = new ExcelDriven();
		
		ArrayList<String> data = ed.getData("Register");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	
		
	}
}
