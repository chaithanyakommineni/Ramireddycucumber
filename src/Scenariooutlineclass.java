import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenariooutlineclass {
	WebDriver driver;


@Given("^open browser \"([^\"]*)\" And url \"([^\"]*)\"$")
public void open_browser_And_url(String browser, String url) throws Throwable {
	  driver=new FirefoxDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}  


@When("^enter usernamekomminenichaithanya@gmail\\.com And password(\\d+)k And click on login$")
public void enter_usernamekomminenichaithanya_gmail_com_And_password_k_And_click_on_login(int arg1) throws Throwable {
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	WebElement el=driver.findElement(By.id("eLogin"));
	el.sendKeys("arg1");
	WebElement ele=driver.findElement(By.id("pLogin"));
	ele.sendKeys("arg1");
driver.findElement(By.xpath("//button[text()='Login']")).click();
}

@Then("^Successfully success in step$")
public void successfully_success_in_step() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}