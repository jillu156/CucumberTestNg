package StepDefinition;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginStepDefTestNG {
	WebDriver dr = new ChromeDriver();
	
  @Test

  @Given("USer is on home page")
  public void user_is_on_login_page() {
	  dr.get("https://demo.automationtesting.in/");
	  dr.manage().window().maximize();
      boolean logo = dr.findElement(By.id("logo")).isDisplayed();
      if(logo == true)
      {
    	  System.out.println("Home Page displayed");
    	  
      }
      else
      {
    	  System.out.println("home Page not displayed");
      }
    
  }
  @Test

  @When("User clicks on arrow")
  public void user_clicks_on_arrow() {
      dr.findElement(By.id("enterimg")).click();
	  
  }

  @Then("User should be navigated to Register page")
  public void user_should_be_navigated_to_register_page() {
      Boolean Heading = dr.findElement(By.xpath("//*[text()='Register']")).isDisplayed();
      if(Heading == true)
      {
    	  System.out.println("Register Displayed");
      }
      else
      {
    	  System.out.println("Register not displayed");
      }
	  
  }
  
  
  @Then("Close Browser")
  public void close_browser() {
     dr.close();
    
  }
  
}
