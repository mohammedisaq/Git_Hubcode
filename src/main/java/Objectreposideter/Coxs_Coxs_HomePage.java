package Objectreposideter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utility.WebdriverUtilitys;

public class Coxs_Coxs_HomePage extends WebdriverUtilitys{
	
	
	@FindBy(xpath="")private WebElement outdoor;
	@FindBy(xpath="//span[text()='Tables']")private WebElement Tables;
	@FindBy(xpath="")private WebElement mirror;
	@FindBy(xpath="")private WebElement lighting;
	@FindBy(xpath="//a[@href='https://www.coxandcox.co.uk/tables/coffee-tables/']")private WebElement coffeetable;
	@FindBy(xpath="")private WebElement bedsidetable;
	
	//constructure
	public Coxs_Coxs_HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    
	//Getters
	
	public WebElement getOutdoor() {
		return outdoor;
	}

	public WebElement getTables() {
		return Tables;
	}

	public WebElement getMirror() {
		return mirror;
	}

	public WebElement getLighting() {
		return lighting;
	}

	public WebElement getCoffeetable() {
		return coffeetable;
	}

	public WebElement getBedsidetable() {
		return bedsidetable;
	}
	
	//Business Library
	
	public void movetoTables(WebDriver driver) {
		movetoelement(driver, Tables);
	}
	public void clickoncoffeetable() {
		coffeetable.click();
	}
	

}
