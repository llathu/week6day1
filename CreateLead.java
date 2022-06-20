package week6day1;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLead extends Baseclass{

	private static WebElement webElement;
	

	@Test
	public void cL() throws InterruptedException {
		

				
				// TODO Auto-generated method stub
				//WebDriverManager.chromedriver().setup();
				//ChromeDriver driver=new ChromeDriver();
				//driver.get("http://leaftaps.com/opentaps/control/main");
				//driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//WebElement eleUserName = driver.findElement(By.id("username"));
				//eleUserName.sendKeys("DemoSalesManager");
				//driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Latha");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leo");

				// select conference in source dropdown
				WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select dd = new Select(eleSource);
				dd.selectByVisibleText("Conference");
				
				driver.findElement(By.name("submitButton")).click();				
				Thread.sleep(2000);
				
				String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
				System.out.println(firstName);
				
				// To close the browser
				//driver.close();

	}


}
