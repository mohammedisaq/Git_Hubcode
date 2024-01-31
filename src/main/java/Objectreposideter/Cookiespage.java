package Objectreposideter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cookiespage {
	@FindBy (xpath="//button[@id='btn-cookie-allow']")private WebElement cookiesbtn;
	
	
	public Cookiespage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

  //Getters
	public WebElement getCookiesbtn() {
		return cookiesbtn;
	}
	
	//Bussiness Library
	
	public void clickoncookies() {
		cookiesbtn.click();
	}
	
	

}
