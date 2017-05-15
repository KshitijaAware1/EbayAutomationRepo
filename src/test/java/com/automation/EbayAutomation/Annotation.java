package com.automation.EbayAutomation;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Annotation {
	WebDriver driver = null; 
	
	   @Given("^I have opened the browser$") 
	   public void openBrowser() { 
		   System.setProperty("webdriver.chrome.driver" , "/Users/abhinav/Downloads/chromedriver");
			 
	      driver = new ChromeDriver(); 
	   } 
		
	   @When("^I open Ebay website$") 
	   public void goToFacebook() throws IOException { 
	      driver.navigate().to("https://www.ebay.com/"); 
	      
	   } 
	   
	   @Then("^Ebay should exist$")
	   public void ebay_should_exist() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
	   }  
		   
		@Given("^Ebay is opened$")
		   public void ebay_is_opened() throws Throwable {
		       // Write code here that turns the phrase above into concrete actions
		   
		   }
		
		
	   @Then("^I search for sony tv$")
	   public void search_For_Sony_TV() throws IOException {
	       // Write code here that turns the phrase above into concrete actions
		   WebElement we=driver.findElement(By.id("gh-ac"));
			we.sendKeys(App.readSearchTextFromFile());			
			WebElement search=driver.findElement(By.id("gh-btn"));
			search.click();
			WebElement cat=driver.findElement(By.className("search-guidance__text-item-link"));
			cat.click();
			
	   }
	   
	   @Then("^Check search result$")
	   public void check_search_result() throws Throwable {
	     
		   List<WebElement> catlist=driver.findElements(By.className("vip"));
			System.out.println(catlist.size());
			
			for (int i = 0; i < catlist.size(); i++) {
				System.out.println(catlist.get(i).getText());
		      
		    }
			
	   }
	   
	   
	   
	   @Then("^Select random product$")
	   public void select_random_product() throws Throwable {
	     
		   List<WebElement> catlist=driver.findElements(By.className("vip"));
			Random r = new java.util.Random();
			 WebElement randomElement = catlist.get(r.nextInt(catlist.size()));
			 randomElement.click();
			 
			 //itemTitle, prcIsum, mbg-nw(seller class name)
			 String name= driver.findElement(By.id("itemTitle")).getText();
			 System.out.println(name);
			 
			 String price= driver.findElement(By.id("prcIsum")).getText();
			 System.out.println(price);
			 
			 String seller= driver.findElement(By.className("mbg-nw")).getText();
			 System.out.println(seller);
			 	

	   }
	   
	   
	   @Then("^Click AddToCart$")
	   public void click_AddToCart() throws Throwable {
	     
			WebElement addToCart=driver.findElement(By.id("isCartBtn_btn"));
			addToCart.click();
			 
			try{
			WebElement noThanks=driver.findElement(By.id("addNoThx"));
			noThanks.click();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	   }
	   
	   
	   @Then("^Click Proceed Checkout$")
	   public void click_Proceed_Checkout() throws Throwable {
	       
			
			WebElement proceedCheckout=driver.findElement(By.id("ptcBtnBottom"));
			proceedCheckout.click();
		
	   }

	   @Then("^Continue As Guest$")
	   public void continue_As_Guest() throws Throwable {
	       
			WebElement guestCheckout=driver.findElement(By.id( "gtChk"));
			guestCheckout.click();
					 
		//	driver.quit();
	   }
	   
	  @After("@")
	  public void killBrowser(Scenario scenario){
	        if (scenario.isFailed()) {
	         scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
	        }
	        driver.close();
	        driver.quit();
	    }
	   
	   
	   
}
