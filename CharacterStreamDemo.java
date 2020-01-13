package com.cts.activity.main;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamDemo 
	{ 
		public static void main(String[] args) throws IOException 
		{ 
			FileReader fr = null; 
			try
			{ 
				String Path="C:\\Users\\Lenovo\\Desktop\\abhi\\abhigna\\data.txt";
				fr = new FileReader(Path); 
				
 
				int temp; 
				while ((temp = fr.read()) != -1) 
					System.out.println((char)temp); 
			} 
			finally
			{			 
				if (fr != null)			 
					fr.close();		 
			} 
		} 
	} 

