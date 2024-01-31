package coxAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Generic_utility.Propertyfile_utility;
import Generic_utility.WebdriverUtilitys;
import Objectreposideter.AddToBasketPage;
import Objectreposideter.Cookiespage;
import Objectreposideter.Coxs_Coxs_HomePage;
import Objectreposideter.FiltersPage;
import Objectreposideter.PopupPage;
import Objectreposideter.ProductPage;
import Objectreposideter.Secure_shopping_Basket;
import Objectreposideter.SiginPage;
import Objectreposideter.SigninbuttonPage;

public class MainCode{
	
	public static void main(String[] args) throws Throwable {
	
		WebDriver driver= new EdgeDriver();
		
       Propertyfile_utility putil= new Propertyfile_utility();

       String URL = putil.Readdata_propertyfile("url");
       System.out.println(URL);
       
       String UNAME = putil.Readdata_propertyfile("uname");
       String PWORD = putil.Readdata_propertyfile("pword");
       
       driver.get(URL);
       driver.manage().window().maximize();
     
       Thread.sleep(3000 );
       
       //click on cookies
       Cookiespage cp= new Cookiespage(driver);
       cp.clickoncookies();
       
       Thread.sleep(5000);
       
       // click on signin button
       SigninbuttonPage sbp=new SigninbuttonPage(driver);
       sbp.clickonsigninbutton();
       
       Thread.sleep(10000);
       //click on Popup
       
       PopupPage pop=new PopupPage(driver);
       pop.clickonpopup();
       
       //Signin to Coxs_Coxs Application
       
       SiginPage sip=new SiginPage(driver);
       sip.sigintoCoxs_cox(UNAME, PWORD);
       
       //main module
       Coxs_Coxs_HomePage cchp=new Coxs_Coxs_HomePage(driver);
       cchp.movetoTables(driver);
       
       
      Thread.sleep(5000);
       // sub module
       Coxs_Coxs_HomePage cchps=new Coxs_Coxs_HomePage(driver);
       cchps.clickoncoffeetable();
       
       Thread.sleep(5000);
       //Filters
       
       FiltersPage fp=new FiltersPage(driver);
       fp.cickonnfilters();
       
       Thread.sleep(5000);
       //View
       FiltersPage fpv=new FiltersPage(driver);
       fpv.clickonview();
       Thread.sleep(5000);
       //click on SortBy
       FiltersPage fps=new FiltersPage(driver);
       fps.clickonsort();

       Thread.sleep(5000);

        ProductPage pp=new ProductPage(driver);
        pp.clickonproduct();
        
        Thread.sleep(5000);
        //quantity page
        AddToBasketPage atbp=new AddToBasketPage(driver);
        atbp.clickonquantity();
        Thread.sleep(5000);
        
       AddToBasketPage atbp2=new AddToBasketPage(driver);
       atbp2.clickonquantity();
       Thread.sleep(5000);
        
	     AddToBasketPage abp= new AddToBasketPage(driver);
	     abp.clickonBasketbtn();
	
	Thread.sleep(5000);
	AddToBasketPage abpc=new AddToBasketPage(driver);
	abpc.clickoncart();
	
	// clickon checkout button
	
Thread.sleep(5000);
AddToBasketPage abpco=new AddToBasketPage(driver);
abpco.clickoncheckout();

// click on update Button
Secure_shopping_Basket ssb=new Secure_shopping_Basket(driver);
ssb.click_updateShopping();

// These is the change from my Git-Hub Account for first Time 
	}

}
