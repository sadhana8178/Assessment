package com.build.qa.build.selenium.tests;

import org.junit.Test;

import com.build.qa.build.selenium.framework.BaseFramework;
import com.build.qa.build.selenium.pageobjects.homepage.HomePage;

public class BuildTest extends BaseFramework {

	/**
	 * Extremely basic test that outlines some basic
	 * functionality and page objects as well as assertJ
	 */
	@Test
	public void navigateToHomePage() {
		driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);

		softly.assertThat(homePage.onBuildTheme())
			.as("The website should load up with the Build.com desktop theme.")
			.isTrue();
	}

	/**
	 * Search for the Quoizel MY1613 from the search bar
	 * @assert: That the product page we land on is what is expected by checking the product title
	 * @difficulty Easy
	 */
	@Test
	public void searchForProductLandsOnCorrectProduct() {
		HomePage.Close(driver).click();
		HomePage.SearchOption(driver).sendKeys("Quoizel MY1613");
		HomePage.SearchOptionClick(driver).click();
	}

	/**
	 * Go to the Bathroom Sinks category directly (https://www.build.com/bathroom-sinks/c108504)
	 * and add the second product on the search results (Category Drop) page to the cart.
	 * @throws InterruptedException 
	 * @assert: the product that is added to the cart is what is expected
	 * @difficulty Easy-Medium
	 */
	@Test
	public void addProductToCartFromCategoryDrop() throws InterruptedException {
		HomePage.BathRoomLink(driver).click();
		Thread.sleep(1000);
		HomePage.BathRoomSinkLink(driver).click();

	}

	/**
	 * Add a product to the cart and email the cart to yourself, also to my email address: test.automation+SeleniumTest@build.com
	 * Include this message in the "message field" of the email form: "This is {yourName}, sending you a cart from my automation!"
	 * @assert that the "Cart Sent" success message is displayed after emailing the cart
	 * @difficulty Medium-Hard
	 */
	@Test
	public void addProductToCartAndEmailIt() {
		HomePage.BathRoomCart(driver).click();
	}

	/**
	 * Go to a category drop page (such as Bathroom Faucets) and narrow by
	 * at least two filters (facets), e.g: Finish=Chromes and Theme=Modern
	 * @throws InterruptedException 
	 * @assert that the correct filters are being narrowed, and the result count
	 * is correct, such that each facet selection is narrowing the product count.
	 * @difficulty Hard
	 */
	@Test
	public void facetNarrowBysResultInCorrectProductCounts() throws InterruptedException {
		HomePage.BathRoomFaucteLink(driver).click();
		Thread.sleep(1000);
		HomePage.BathSingel(driver).click();
		HomePage.Facest(driver).click();
		
	}
}
