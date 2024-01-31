package Objectreposideter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninbuttonPage {
	
	@FindBy(xpath="//span[text()='Sign In']")private WebElement signinbutton;
	
	public SigninbuttonPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
  //Getters
	public WebElement getSigninbutton() {
		return signinbutton;
	}
	
   //Business Library
	
	public void clickonsigninbutton() {
		signinbutton.click();
	}

}
