package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WebDriverTestNG {

	private WebDriver driver;
	@BeforeClass
	public void Startup() {
		driver=new FirefoxDriver();
	}
	@Test(description="OrangeHRM Login")
	public void Login() throws Exception{
		Reporter.log("Test case steps");
		driver.get("http://183.82.125.5/nareshit/login.php");
		Reporter.log("1.Applicaiton opened");
		driver.findElement(By.name("txtUserName")).sendKeys("suresh");
		Reporter.log("2.typing user name");
		driver.findElement(By.name("txtPassword")).sendKeys("suresh123");
		Reporter.log("3.Typing password");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Reporter.log("4.login completed");
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
