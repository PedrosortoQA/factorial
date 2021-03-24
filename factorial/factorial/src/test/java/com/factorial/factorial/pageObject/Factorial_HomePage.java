package com.factorial.factorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factorial_HomePage {
	
	@FindBy(id = "number")
	WebElement txt_number;
	
	@FindBy(id = "getFactorial")
	WebElement btn_calculate;
	
	@FindBy(id = "resultDiv")
	WebElement txt_result;
	
	WebDriver driver;

	public Factorial_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void enterNumber(String number) {
		txt_number.sendKeys(number);
	}
	
	public void getFactorialNumber() {
		btn_calculate.click();
	}
	
	public String getActualResult() {
		return  txt_result.getText();
		
	}	

} 
