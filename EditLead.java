package week6day1;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead extends Baseclass {

	private static WebElement webElement;

	@Test
	public void eL() throws InterruptedException {

		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");		
		//driver.findElement(By.id("password")).sendKeys("crmsfa");		
		//driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.id("ext-gen248")).sendKeys("Arputha Latha");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10305']")).click();
		
		//String title2 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		//System.out.println(title2);
		System.out.println("The title is : "+ driver.getTitle());
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TEST LEAF");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		
		
	}

}
