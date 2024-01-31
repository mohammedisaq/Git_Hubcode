package Objectreposideter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiginPage {
	
	@FindBy(xpath="//input[@name='login[username]']")private WebElement username;
	@FindBy(xpath="//input[@name='login[password]']")private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement Login;
	
	
	public SiginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

  //Getters
	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return Login;
	}
	
	//Business Library
	
	public void sigintoCoxs_cox(String UNAME,String PWORD) {
		username.sendKeys(UNAME);
		password.sendKeys(PWORD);
		Login.click();
	}
	
		

}
