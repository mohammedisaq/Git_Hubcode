package Objectreposideter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utility.WebdriverUtilitys;

public class FiltersPage extends WebdriverUtilitys {
	
	@FindBy(xpath="//select[@title='Filter']")private WebElement filtersbtn;
	@FindBy(xpath="//select[@id='limiter']")private WebElement view;
	@FindBy(xpath="//select[@id='sorter']")private WebElement SortBy;
	
	
	
	
	public FiltersPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

    //Getters
	public WebElement getFiltersbtn() {
		return filtersbtn;
	}
	public WebElement getview() {
		return view;
	}
	public WebElement getsortby() {
		return SortBy;
	}
	
	//Business Library
	
	public void cickonnfilters() {
		clickonFilter(filtersbtn, 2);
	}
	public void clickonview() {
		clickonFilter(view, 1);
	}
	public void clickonsort() {
		clickonFilter(SortBy, 3);
	}
	
	
	
	

}
