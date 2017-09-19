package pro1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AllPlayers {


public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	  driver.get("https://v2-pre-prod-app.krossover.com/intelligence/games/9603/breakdown");
	  //to check page is visible 
	  Thread.sleep(15000);
	  WebElement sIcon = driver.findElementByXPath("/html/body/header/nav/div/a[1]/div");
	  if(sIcon.isDisplayed()==true);
	  {
	  
	  String[] exp = {"P.Brar","A.Singh","R.Pethani","A.Pari","N.Grewal","J.Smith","V.Kohli"};
	  WebElement dropdown = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/plays-filters/div/div"));
	  dropdown.click();
	  checkElementIsVisible(driver,"P.Brar","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[3]/div[24]/a");
	  checkElementIsVisible(driver,"A.Singh","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[3]/div[22]/a");
	  checkElementIsVisible(driver,"R.Pethani","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[3]/div[27]/a");
	  checkElementIsVisible(driver,"A.Pari","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[3]/div[18]/a");
	  checkElementIsVisible(driver,"N.Grewal","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[3]/div[17]/a");
	  checkElementIsVisible(driver,"J.Smith","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[3]/div[5]/a");
	  checkElementIsVisible(driver,"V.Kohli","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[3]/div[2]/a");
	  

	  
	
	 }
	}
	protected static void checkElementIsVisible(ChromeDriver driver,String sValue, String sXpath)
	{
		WebElement elements=driver.findElementByXPath(sXpath);
		if (elements.isDisplayed()==true)
		{
		elements.getText().equals(sValue);	
		
		System.out.println(sValue);
		//System.out.println(elements.getText());
		}
	}
 
  
  

  

}

