import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NakuriClass {
	WebDriver driver;
	//@Before
	@Given("^open browser as \"([^\"]*)\" And enter url as \"([^\"]*)\"$")
	public void open_browser_as_And_enter_url_as(String browser, String url) throws Throwable {
	   driver=new FirefoxDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^enter username And password And click on login$")
	public void enter_username_And_password_And_click_on_login(DataTable username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	    List<List<String>> data=username.raw();
	    WebElement el=driver.findElement(By.id("eLogin"));
	    el.clear();
	    el.sendKeys(data.get(0).get(0));
	    WebElement ele=driver.findElement(By.id("pLogin"));
	    ele.clear();
	    ele.sendKeys(data.get(0).get(1));
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    List<List<String>> data1=username.raw();
	    WebElement e=driver.findElement(By.id("eLogin"));
	    e.clear();
	    e.sendKeys(data.get(1).get(0));
	    WebElement ele2=driver.findElement(By.id("pLogin"));
	    ele2.clear();
	    ele2.sendKeys(data.get(1).get(1));
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Then("^Successfully login to nakuri$")
	public void successfully_login_to_nakuri() throws Throwable {
	   System.out.println("successfully login nakuri");
	}
/*@After
public void quit()
{
	driver.quit();
}
*/

}
