package com.Swaglabs.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_Reader {
	

	
		Properties p1;
		
		public Properties_Reader()
		{
			p1=new Properties();
			
			File f1=new File(System.getProperty("user.dir")+"//Properties//Config.Properties");
			
			try {
				FileInputStream fs=new FileInputStream(f1);
				p1.load(fs);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public String getData(String key)
		{
			return p1.getProperty(key);
		

	}

}
