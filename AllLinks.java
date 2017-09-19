package pro1;


import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllLinks {


			  public static void main(String[] args) throws InterruptedException {
			 
				ChromeDriver driver =new ChromeDriver();
			   driver.get("https://www.krossover.com/basketball");
			   
			   int size = driver.findElements(By.tagName("a")).size();

			   System.out.println(size);

			   List<String> Linkarray = new ArrayList<String>();

			       List<WebElement> Linklist = driver.findElements(By.tagName("a"));

			       for (WebElement link : Linklist) {

			        String links = link.getText();
			        Linkarray.add(links );

			       }
			       
			       for (String linkToTest : Linkarray){
			        driver.findElement(By.linkText(linkToTest)).click();
			        Thread.sleep(15000L);
			     if(driver.getTitle().contains("404 Error")) {
			      System.out.println("Fail");
			     }
			     else
			     {
			      System.out.println("pass");
			     }
			     driver.navigate().back();
			     Thread.sleep(5000);
			    }

			   driver.close();

			}
			
		
		
		
		
		
	}
			       
			       
		    
		          
		      
		           
			       
			       
			       
			       
			       
			       
			  
			       
			       
			       
			       
			       
			       
			       
			       
			       
			       
			       
			       
			

	