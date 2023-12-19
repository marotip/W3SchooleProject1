package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

public static ChromeDriver driver; 
	
	@Given("Naviagte to URL")
	public void naviagte_to_URL() {
		    driver=new ChromeDriver();
		    driver.get("https://profile.w3schools.com/log-in");
		
	}
	
	@When("Enter userame and password and click on login button")
	public void Enter_userame_and_password_and_click_on_login_button() {
		    driver.findElement(By.xpath("//input[@id='modalusername']")).sendKeys("amolmkothule@gmail.com");
		   driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("Amol@12345");
		    driver.findElement(By.xpath("(//*[text()='Log in'])[2]")).click();
		 // driver.findElement(By.xpath("//*[@id=\"modalusername\"]")).sendKeys("amolmkothule@gmail.com");
		   // driver.findElement(By.xpath("//*[@id=\"current-password\"]")).sendKeys("Amol@12345");
		   // driver.findElement(By.xpath("(//*[text()='Log in'])[2]")).click();
		
	}
	
	@Then("user should land on homepage")
	public void user_should_land_on_homepage(){
		
		Assert.assertEquals(driver.getTitle(), "Log in - W3Schools");
		
	}

}
