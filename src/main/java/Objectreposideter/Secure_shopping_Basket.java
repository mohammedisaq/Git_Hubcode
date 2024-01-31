package Objectreposideter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Secure_shopping_Basket {
	
	@FindBy(xpath="(//button[@name='update_cart_action'])[2]")private WebElement updt_basket;
	@FindBy(xpath="")private WebElement continue_shopping;
	
	
	//constructure 
	public Secure_shopping_Basket(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Business Liberayers
	public void click_updateShopping() {
		updt_basket.click();
	}
	public void click_ContinueShopping() {
		continue_shopping.click();
	}

}
