package StepDefinationFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

WebDriver driver;
	
@Given("^user is open login page$")
public void user_is_open_login_page ()
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://uat-languagecloud.sdl.com/lc/login");
}

@When("^user enter  username and password$")
public void user_enter_username_and_password()
{
   driver.findElement(By.id("1-email")).sendKeys("admin.test.uat@sdl.testinator.com");
   driver.findElement(By.name("password")).sendKeys("Weaver123");
   driver.findElement(By.xpath("//span[@class='auth0-label-submit']")).submit();
   
}

@Then("^user open projects page$")
public void user_open_projects_page()
{
	driver.findElement(By.xpath("//a[contains(@class, 'x-btn') and count(*//text()[.='Projects']) > 0]")).click();
}

@Then("^user click on the new project button$")
public void  user_click_on_the_new_project_button()
{
	driver.findElement(By.xpath("//a[contains(@class, 'x-btn') and count(*//text()[.='New Project']) > 0]")).click();
}

@Then("^user select general details$")
public void Then_user_select_genera_details()
{
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SDL Test project");
	
	WebElement element=driver.findElement(By.xpath("//input[@name='location'] [@placeholder='Select a location']/../following-sibling::div"));
	element.click();
	driver.findElement(By.xpath("//li[text()='HP']")).click();
	
	
	driver.findElement(By.xpath("//input[@name='projectSourceLanguage']/../following-sibling::div")).click();
	driver.findElement(By.xpath("//i[@data-qtip='en-us']/..")).click();
	
	
	driver.findElement(By.xpath("//span[text()='Target Languages']/../../following-sibling::div[1]/div/div[2]")).click();
	driver.findElement(By.xpath("//i[@data-qtip='ur-IN']/..")).click();
	
	
	driver.findElement(By.xpath("//input[@name='configurationId']/../following-sibling::div")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Default File Type Configuration from HP folder')]")).click();
	
	
	WebElement file=driver.findElement(By.xpath("//span[@class='x-btn-wrap x-btn-wrap-link-medium ']/following-sibling::input"));
	file.sendKeys("C:\\Users\\admin\\eclipse-workspace\\supriyaRws\\Project.txt");
	
	driver.findElement(By.xpath("//span[text()='Next']/../../..")).click();
	
	}

@Then("^user select translate engine$")
public void Then_user_select_translate_engine()
{
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath(("//input[@name='translationProfileId' and @placeholder='Select a translation engine']/../following-sibling::div"))).click();
	
	driver.findElement(By.xpath("//div[contains(text(),'HP_TranslationEngine')]")).click();
	
	driver.findElement(By.xpath("//span[text()='Next']/../../..")).click();
	
}


@Then("^user select the pricing model$")
public void Then_user_select_the_pricing_model()
{
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath(("//input[@name='pricingModelId']/../following-sibling::div"))).click();
	driver.findElement(By.xpath("//div[contains(text(),' root pricing model')]")).click();
	
	driver.findElement(By.xpath("//span[text()='Next']/../../..")).click();
	
	
}

@Then("^user select the workflow$")
public void user_select_the_workflow()
{
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath(("//input[@name='workflowId']/../following-sibling::div"))).click();
	driver.findElement(By.xpath("//div[contains(text(),'WF-4_CP_2Languages')]")).click();
	
	driver.findElement(By.xpath("//span[text()='Create & Start']/../../..")).click();
	
}

@And("^user stop the test$")
public void user_stop_the_test()
{
	driver.quit();
}


}
