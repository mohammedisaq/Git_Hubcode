package Objectreposideter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToBasketPage {
	
	@FindBy(xpath="//button[@title='Add to Basket']")private WebElement basketbtn;
	@FindBy(xpath="//a[@href='https://www.coxandcox.co.uk/checkout/cart/']")private WebElement cartbtn;
	@FindBy(xpath="//button[@class='quantity-selector__plus js-qty-plus']")private WebElement quantitybtn;
	@FindBy(xpath="//a[@class='action viewcart']")private WebElement checkoutbtn;
	
  public AddToBasketPage(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }

public WebElement getBasketbtn() {
	return basketbtn;
}
public WebElement getcartbtn() {
	return cartbtn;
}
public WebElement getquantitybtn() {
	return quantitybtn;
}
public WebElement getcheckoutbtn() {
	return checkoutbtn;
}


//Business Library
  public void clickonBasketbtn() {
	  basketbtn.click();
  }
  public void clickoncart() {
	  cartbtn.click();
  }
  public void clickonquantity() {
	  quantitybtn.click();
  }
  public void clickoncheckout() {
	  checkoutbtn.click();
  }

}
