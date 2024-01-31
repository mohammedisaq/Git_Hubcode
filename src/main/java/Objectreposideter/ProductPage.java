package Objectreposideter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy(xpath = "//img[@src='https://www.coxandcox.co.uk/media/catalog/product/a/w/aw20-1220715-alt2.png?quality=80&fit=bounds&height=550&width=410']")private WebElement product;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getProduct() {
		return product;
	}
	
	public void clickonproduct() {
		product.click();
	}

}
