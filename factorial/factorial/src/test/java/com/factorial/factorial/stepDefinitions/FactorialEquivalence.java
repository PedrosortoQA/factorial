package com.factorial.factorial.stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.factorial.factorial.pageObject.Factorial_HomePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FactorialEquivalence {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\com\\factorial\\factorial\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}
	
	@Given("^User navigates to the factorial app site$")
	public void user_navigates_to_the_factorial_app_site() throws Throwable {
	    driver.get("http://qainterview.pythonanywhere.com/");
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
	}

	@And("^User Enter the (\\d+) in the number textbox$")
	public void user_Enter_the_in_the_number_textbox(String number) throws Throwable {
		Factorial_HomePage Factorial_HomePage = new Factorial_HomePage(driver);
		Factorial_HomePage.enterNumber(number);
	}

	@When("^User click on the Calculate!$")
	public void user_click_on_the_Calculate() throws Throwable {
		Factorial_HomePage Factorial_HomePage = new Factorial_HomePage(driver);
		Factorial_HomePage.getFactorialNumber();
	}

	@Then("^User compare the \"([^\"]*)\"$")
	public void user_compare_the(String expectedResult) throws Throwable{
		Factorial_HomePage Factorial_HomePage = new Factorial_HomePage(driver);
		 Thread.sleep(2000);
		String Actualresult = Factorial_HomePage.getActualResult();
		System.out.println(expectedResult);
		System.out.println(Actualresult);
		Assert.assertEquals(expectedResult, Actualresult);
	}
	

}
