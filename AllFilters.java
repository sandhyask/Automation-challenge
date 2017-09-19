package pro1;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AllFilters{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
  driver.get("https://v2-pre-prod-app.krossover.com/intelligence/games/9603/breakdown");
  //to check page is visible 
  Thread.sleep(15000);
  WebElement sIcon = driver.findElementByXPath("/html/body/header/nav/div/a[1]/div");
  if(sIcon.isDisplayed()==true);
  {
  String[] exp = {"Free Throws","Defense","Rebounds","Time Period","Top Searches","Shooting","Fouls","Turnovers"};
  WebElement dropdown = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/plays-filters/div/div"));
  dropdown.click();
  checkElementIsVisible(driver,"Shooting","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[2]/div[4]/a");
  checkElementIsVisible(driver,"Free Throws","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[2]/div[9]/a");
  checkElementIsVisible(driver,"Defense","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[2]/div[8]/a");
  checkElementIsVisible(driver,"Rebounds","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[2]/div[6]/a");
  checkElementIsVisible(driver,"Time Period","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[2]/div[11]/a");
  checkElementIsVisible(driver,"Top searches","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[2]/div[2]/a");
  checkElementIsVisible(driver,"Fouls","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[2]/div[5]/a");
  checkElementIsVisible(driver,"Turnovers","/html/body/main/div/div/div/div[1]/plays-filters/div/div/ul/li[2]/div[7]/a");

  
  
 }
}
protected static void checkElementIsVisible(ChromeDriver driver,String sValue, String sXpath)
{
	WebElement elements=driver.findElementByXPath(sXpath);
	if (elements.isDisplayed()==true)
	{
	elements.getText().equals(sValue);	
	//System.out.println(elements.getText());
	System.out.println(sValue);
	}
}
}
