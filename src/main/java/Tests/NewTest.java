package Tests;
	 
//import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
//import org.testng.asserts.*;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
	 
	public class NewTest {
		
		public WebDriver driver;
		
		
	  @Test
	  public void openGoogle() {
		  
		  System.setProperty("webdriver.chrome.driverSystem", "E:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Big Boss");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//WebElement title;
		//title=wait.until(ExpectedConditions.presenceOfAllElementsLocated(By.t("Big boss - Google Search"));
		//assertTrue(driver.getTitle().contains("big boss - Google Search"));
		//assertTrue(driver.getPageSource().contains("big boss - Google Search"));
		//AssertJUnit.assertEquals("Big boss - Google Search", driver.getTitle());
		String actualTitle = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle );
		String expectedTitle = "Big boss - Google Search";
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("passed");
		}
		else 
		{
			System.out.println("failed");
		}
		driver.close();
		//assertEquals(expectedTitle,actualTitle);
		//driver.findElement(big boss - Google Search)
		//WebElement URL = driver.findElement(By.linkText("/url?sa=t&rct=j&q=&esrc=s&source=web&cd=4&cad=rja&uact=8&ved=0ahUKEwiAwpzUk-rWAhVE4iYKHdswDlkQFgg4MAM&url=http%3A%2F%2Fmetalgear.wikia.com%2Fwiki%2FBig_Boss&usg=AOvVaw0RRynPPg-BzCwgyFVV9Nx8"));
		//Assert.assertEquals(URL, "/url?sa=t&rct=j&q=&esrc=s&source=web&cd=4&cad=rja&uact=8&ved=0ahUKEwiAwpzUk-rWAhVE4iYKHdswDlkQFgg4MAM&url=http%3A%2F%2Fmetalgear.wikia.com%2Fwiki%2FBig_Boss&usg=AOvVaw0RRynPPg-BzCwgyFVV9Nx8");
		//System.out.println("passed");
	  }


	  
	  //@BeforeClass
	  //public void beforeClass() {
		  
		  //System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		  //WebDriver driver = new ChromeDriver();
		  
	  //}
	 
	  //@AfterClass
	  //public void afterClass() {
		//  driver.quit();
	  //}
	 
	}


