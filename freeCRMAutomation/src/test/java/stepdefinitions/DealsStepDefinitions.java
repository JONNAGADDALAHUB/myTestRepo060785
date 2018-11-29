package stepdefinitions;


import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;


public class DealsStepDefinitions {
//	WebDriver driver = getDriver();
	
	@Then("^user navigates to new deal page$")
	public void user_navigates_to_new_deal_page(){
		//AbstractStepdefinitions.getDriver();
		AbstractStepdefinitions.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		AbstractStepdefinitions.driver.switchTo().frame("mainpanel");
		Actions action = new Actions(AbstractStepdefinitions.driver);
		action.moveToElement(AbstractStepdefinitions.driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		AbstractStepdefinitions.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement newdeal_link = AbstractStepdefinitions.driver.findElement(By.xpath("//a[@title='New Deal']"));
		JavascriptExecutor js =  (JavascriptExecutor) AbstractStepdefinitions.driver;
		js.executeScript("arguments[0].click()", newdeal_link);
	}
	
	
	@Then("^user provides deal details$")
	public void user_provides_deal_details(DataTable dealInfo)  {
		List<Map<String,String>> dealvals  = dealInfo.asMaps(String.class, String.class);
		String dealSeqNo = AbstractStepdefinitions.driver.findElement(By.name("sequence")).getAttribute("value");
		System.out.println("Deal Sequence Numbr is : "+dealSeqNo);
		AbstractStepdefinitions.driver.findElement(By.name("title")).sendKeys(dealvals.get(0).get("DealTitle"));
		AbstractStepdefinitions.driver.findElement(By.name("amount")).sendKeys(dealvals.get(0).get("DealAmount"));
		AbstractStepdefinitions.driver.findElement(By.name("probability")).sendKeys(dealvals.get(0).get("Probability"));
		AbstractStepdefinitions.driver.findElement(By.name("commission")).sendKeys(dealvals.get(0).get("Commission"));
		
		AbstractStepdefinitions.driver.findElement(By.xpath("//input[@type='submit' and @value = 'Save']")).click();
		AbstractStepdefinitions.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
	}
	
}
