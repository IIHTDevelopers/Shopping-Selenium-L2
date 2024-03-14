package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartAutomationPages extends StartupPage
{
	By shopOption = By.xpath(""); 
	By cartMenuButton = By.xpath(""); 
	By automationPracticeSiteLogo = By.xpath(""); 
	By newArrivalButton = By.xpath(""); 
	By seleniumRubyProduct = By.xpath(""); 
	By thinkingInHtmlProduct = By.xpath(""); 
	By masteringJavaScriptProduct = By.xpath(""); 
	By addToBasketButton = By.xpath(""); 
	By productAddedMessage = By.xpath(""); 
	By viewBasketButton = By.xpath("");  
	By seleniumRubyInsideTheBasketPage = By.xpath(""); 
	By couponcodeField = By.xpath(""); 
	By applyCouponcodeButton = By.xpath("");  
	By priceReadOnyField = By.xpath(""); 
	By quantityField= By.xpath(""); 
	By totalField= By.xpath(""); 
	By removeIcon= By.xpath(""); 
	By removeMessage= By.xpath(""); 
	By proceedToCheckoutButton= By.xpath(""); 



	public ShoppingCartAutomationPages(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	/**@Test1
	 * about this method verifyNavigateTotTheShoppingCartpage() 
	 * @param : null
	 * @description : go to this shopping cart page URL and validate the home page
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String verifyNavigateTotTheShoppingCartpage() throws Exception {
		return null;
	}
	/**@Test2
	 * about this method verifyShopOptionIsPresent() 
	 * @param : null
	 * @description : Check shop menu option is present or not
	 * @return : return true if shopOption is present, else false
	 * @author : Yaksha
	 */
	public boolean verifyShopOptionIsPresent() throws Exception {
		return false;
	}
	/**@Test3
	 * about this method clickOnShopMenuandValidateTheTitle() 
	 * @param : null
	 * @description : click on the shop menu and validate the title of this shop page
	 * @return : return String if page shop page title is matching
	 * @author : Yaksha
	 */
	public String clickOnShopMenuandValidateTheTitle() throws Exception {
		return null;

	}

	/**@Test4
	 * about this method clickOnLogoandVerifyItIsNavigateToTheHomePage() 
	 * @param : null
	 * @description : validate the logo is present and click on the Automation practice site logo which is present at the left top corner
	 * 				  and verify the page title.
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String clickOnLogoandVerifyItIsNavigateToTheHomePage() throws Exception {
		return null;

	}

	/**@Test5
	 * about this method checkIfHomePageHasSectionOfNewArrivals() 
	 * @param : null
	 * @description : check home page has a section of new arrival.
	 * @return : return true if newArrival Button is present, else false
	 * @author : Yaksha
	 */
	public boolean checkIfHomePageHasSectionOfNewArrivals() throws Exception {
		return false;
	}
	
	/**@Test6
	 * about this method checkOfArrivalsSectionhasExactly3ProductsEnlisted() 
	 * @param : null
	 * @description : Check of â€œArrivalsâ€ section has exactly 3 products enlisted
	 * @return : return true if all three products are  present, else false
	 * @author : Yaksha
	 */
	public boolean checkOfArrivalsSectionhasExactly3ProductsEnlisted() throws Exception {
		return false;
	}
	
	/**@Test7
	 * about this method clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() 
	 * @param : null
	 * @description : Check of â€œArrivalsâ€ section has exactly 3 products enlisted
	 * @return : return String if seleniumRuby PageTitle is matching
	 * @author : Yaksha
	 */
	public String clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() throws Exception {
		return null;

	}
	
	/**@Test8
	 * about this method verifyAddBasketButtonIsPresentAndClickOnAddBasket() 
	 * @param : null
	 * @description : verify add basket button is present then click on the Add to basket button
	 * @return : return true if viewBasketButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean verifyAddBasketButtonIsPresentAndClickOnAddBasket() throws Exception {
		return false;
	}
	/**@Test9
	 * about this method viewBasketButtonIsPresentAndClickOnIt() 
	 * @param : null
	 * @description : verify view basket button is present then click on the view basket button
	 * @return : return true if seleniumRuby product is present InsideTheBasketPage, else false
	 * @author : Yaksha
	 */
	public boolean viewBasketButtonIsPresentAndClickOnIt() throws Exception {
		return false;
	}
	
	/**@Test10
	 * about this method userIsNavigateToTheBasketPage() 
	 * @param : null
	 * @description : verify the title of the Basket Page
	 * @return : return String if  PageTitle is matching
	 * @author : Yaksha
	 */
	public String userIsNavigateToTheBasketPage() throws Exception {
		return null;

	}

	
	/**@Test12
	 * about this method seleniumRubyProductIsPresent() 
	 * @param : null
	 * @description : verify Selenium ruby product is present or not
	 * @return : return true if seleniumRuby product is present InsideTheBasketPage, else false
	 * @author : Yaksha
	 */
	public boolean seleniumRubyProductIsPresent() throws Exception {
		return false;
	}
	
	/**@Test13
	 * about this method verifyCouponcodeFieldAndApplyCouponButtonIsPresent() 
	 * @param : null
	 * @description : verify coupon code field and apply coupon code button is present
	 * @return : return true if applyCouponcodeButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean verifyCouponcodeFieldAndApplyCouponButtonIsPresent() throws Exception {
		return false;
	}
	
	/**@Test14
	 * about this method priceDefinedAfterProductName() 
	 * @param : null
	 * @description : verify price ReadOnlyField is present or not
	 * @return : return true if priceReadOnlyField is  present, else false
	 * @author : Yaksha
	 */
	public boolean priceDefinedAfterProductName() throws Exception {
		return false;
	}
	
	/**@Test15
	 * about this method quantityDefinedAfterProductPrice() 
	 * @param : null
	 * @description : verify quantity Field is present or not
	 * @return : return true if quantityField is  present, else false
	 * @author : Yaksha
	 */
	public boolean quantityDefinedAfterProductPrice() throws Exception {
		return false;
	}
	
	/**@Test16
	 * about this method totalDefinedIsPresentAfterQuantity() 
	 * @param : null
	 * @description : verify total field is present or not
	 * @return : return true if totalField is  present, else false
	 * @author : Yaksha
	 */
	public boolean totalDefinedIsPresentAfterQuantity() throws Exception {
		return false;
	}
	
	/**@Test17
	 * about this method removeIconIsPresentandRemoveTheProduct() 
	 * @param : null
	 * @description : verify removeIcon is present or not then click on remove icon to remove the product
	 * @return : return true if removeMessage is  present, else false
	 * @author : Yaksha
	 */
	public boolean removeIconIsPresentandRemoveTheProduct() throws Exception {
		return false;
	}
	
	/**@Test18
	 * about this method validatetheMessageAfterRemovingAProduct() 
	 * @param : null
	 * @description : check remove message is present and validate the Message After Removing A Product
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String validatetheMessageAfterRemovingAProduct() throws Exception {
		return null;

	}
	

	/**@Test19 same as @Test11
	 * about this method goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() 
	 * @param : null
	 * @description : go To The Home Icon then click on Seleniumruby Then Click On Add To Basket Then Click On View Basket
	 * @return : return true if proceedToCheckoutButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
		return false;
	}
	
	/**@Test20
	 * about this method validateIfWeHaveAProceedToCheckoutButtonORNot() 
	 * @param : null
	 * @description : verify proceedToCheckoutButton is present 
	 * @return : return true if proceedToCheckoutButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean validateIfWeHaveAProceedToCheckoutButtonORNot() throws Exception {
		return false;
	}
	
	
}
