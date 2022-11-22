package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FBLogin {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("Chrome Browser should open")
	public void chrome_browser_should_open() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SpringBoot-workspace\\demo\\Driver\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
	}

	@Given("the credentials of user should be populated")
	public void the_credentials_of_user_should_be_populated() {
		driver.findElement(By.id("email")).sendKeys("priyam");
		driver.findElement(By.id("pass")).sendKeys("priyam");
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}

	@Then("User Must login to the FB account")
	public void user_must_login_to_the_fb_account() {
	//	assertEquals(driver.getTitle(), driver.getTitle());
	
		//assertEquals("login" , driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).getAttribute("name"));
		driver.close();
	}

}
