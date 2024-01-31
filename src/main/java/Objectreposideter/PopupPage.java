package Objectreposideter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPage {
	
	@FindBy(xpath="(//button[@title='Close'])[2]")private WebElement popupbtn;
	
	
	public PopupPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

    //Getters
	public WebElement getPopupbtn() {
		return popupbtn;
	}
	
	//Business Library
	
	public void clickonpopup() {
		popupbtn.click();
	}
	
	

}
