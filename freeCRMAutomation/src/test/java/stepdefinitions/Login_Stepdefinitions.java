package stepdefinitions;



import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class Login_Stepdefinitions {
	//WebDriver driver = getDriver();	
	
	@Given("^user is displayed with login page$")
	public void user_is_displayed_with_login_page(){
		AbstractStepdefinitions.getDriver();
		AbstractStepdefinitions.driver.get("https://www.freecrm.com/index.html");
		AbstractStepdefinitions.driver.manage().window().maximize();		
	}
	@When("^login page title is free CRM$")
	public void login_page_title_is_free_CRM(){
		String title = AbstractStepdefinitions.driver.getTitle();
		System.out.println("The Browser title is : "+ title);
		//Assert.assertEquals("#1 Free CRM software in the cloud powers sales and customer service", title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}
	
	


	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		AbstractStepdefinitions.driver.findElement(By.name("username")).sendKeys(username);
		AbstractStepdefinitions.driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^user clicks on login Button$")
	public void user_clicks_on_login_Button() {
		WebElement login_btn = AbstractStepdefinitions.driver.findElement(By.xpath("//input[@value='Login']"));		
		JavascriptExecutor js =  (JavascriptExecutor) AbstractStepdefinitions.driver;
		js.executeScript("arguments[0].click()", login_btn);
		
	}
	
	@Then("^users lands on home page$")
	public void users_lands_on_home_page()  {
		String hmpg_titl = AbstractStepdefinitions.driver.getTitle();
		System.out.println("The Home page title is : "+ hmpg_titl);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", hmpg_titl);
	}
	
	@Then("^user navigates to new contact page$")
	public void user_navigates_to_new_contact_page()  {
		AbstractStepdefinitions.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		AbstractStepdefinitions.driver.switchTo().frame("mainpanel");
		Actions action = new Actions(AbstractStepdefinitions.driver);
		action.moveToElement(AbstractStepdefinitions.driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		AbstractStepdefinitions.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement newcntc_link = AbstractStepdefinitions.driver.findElement(By.xpath("//a[@title='New Contact']"));
		JavascriptExecutor js =  (JavascriptExecutor) AbstractStepdefinitions.driver;
		js.executeScript("arguments[0].click()", newcntc_link);
	}
	
	
	@Then("^user provides contact details as \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_navigates_to_new_contact_page(String frstname, String lstname, String pstn)  {
		
		AbstractStepdefinitions.driver.findElement(By.name("first_name")).sendKeys(frstname);
		AbstractStepdefinitions.driver.findElement(By.name("surname")).sendKeys(lstname);		
		AbstractStepdefinitions.driver.findElement(By.xpath("//input[@type='submit' and @value = 'Save']")).click();
		AbstractStepdefinitions.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
		
	}
	
	/*@Then("^user navigates to new deal page$")
	public void user_navigates_to_new_deal_page()  {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement newdeal_link = driver.findElement(By.xpath("//a[@title='New Deal']"));
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", newdeal_link);
	}
	
	
	@Then("^user provides deal details$")
	public void user_provides_deal_details(DataTable dealInfo)  {
		List<List<String>> dealvals  = dealInfo.raw();
		String dealSeqNo = driver.findElement(By.name("sequence")).getAttribute("value");
		System.out.println("Deal Sequence Numbr is : "+dealSeqNo);
		driver.findElement(By.name("title")).sendKeys(dealvals.get(0).get(0));
		driver.findElement(By.name("amount")).sendKeys(dealvals.get(0).get(1));
		driver.findElement(By.name("probability")).sendKeys(dealvals.get(0).get(2));
		driver.findElement(By.name("commission")).sendKeys(dealvals.get(0).get(3));
		
		driver.findElement(By.xpath("//input[@type='submit' and @value = 'Save']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
		
	}*/
	
	
	@And("^close the browser$")
	public void close_the_browser()  {
		AbstractStepdefinitions.driver.close();
	}
	
	
	
}
