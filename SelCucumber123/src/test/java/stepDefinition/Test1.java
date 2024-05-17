package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test1 {
	public WebDriver driver;
	
	@Given("^User is in Google login page$")
	public void user_is_in_Google_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("https://www.google.co.in/");
	}

	@Then("^Title is Google$")
	public void title_is_Google() throws Throwable {
	   String aTitle=driver.getTitle();
	   String eTitle="Google";
	   Assert.assertEquals(eTitle, aTitle);
	   driver.quit();
	}

	
	

}
