package com.automation.EbayAutomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 try{
    		 System.setProperty("webdriver.chrome.driver" , "/Users/abhinav/Downloads/chromedriver");
    	 WebDriver driver=new ChromeDriver();
         driver.get("http://www.ebay.com");
     
    	 }catch (Exception e) {
    		// TODO: handle exception
    		 e.printStackTrace();
    	}
    }
    
    public static String readSearchTextFromFile() throws IOException{
		String searchText="";
		BufferedReader br = null;
		URL url = App.class.getResource("file.txt");

		System.out.println("URL: " + url);

		File file;
		try {
			file = new File(url.toURI());
		
		System.out.println("FILE: " + file);
		FileInputStream is = new FileInputStream(file);
		 br = new BufferedReader(new InputStreamReader(is));
		String[] lines;
	
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    boolean first = true;
		    while(line != null)
		    {
		        if (first) {
		          first = false;
		        } else {
		          line = br.readLine();  
		          if(line!=null){
		          System.out.println(line);
		          searchText= line.replaceAll("\\|", "");
		          System.out.println(searchText);}
		        }
		    }
		    
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
		    br.close();
		}
		
		
		return searchText;
		
	}
}
