package com.build.qa.build.selenium.pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class HomePage extends BasePage {

	private By buildThemeBody;
	private static WebElement element = null;

	public HomePage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		buildThemeBody = By.cssSelector("body.build-theme");
		driver.manage().window().maximize();
	}

	public boolean onBuildTheme() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(buildThemeBody)) != null;
	}

	public static WebElement Close(WebDriver driver) {
		element = driver.findElement(By.xpath(".//button[@class='close js-modal-close  ']"));
		return element;
	}

	public static WebElement Search(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@placeholder='What are you shopping for?'])[1]"));
		return element;
	}

	public static WebElement SearchOption(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@placeholder='What are you shopping for?'])[1]"));
		return element;
	}

	public static WebElement SearchOptionClick(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@aria-label='Submit search'])[1]"));
		return element;
	}

	public static WebElement BathRoomLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@data-automation='bathroom-link']"));
		return element;

	}

	public static WebElement BathRoomSinkLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@data-automation='bathroom-sinks-category-link']"));
		return element;

	}

	public static WebElement BathRoomCart(WebDriver driver) {
		element = driver.findElement(By.xpath("(//div[@data-automation='header-cart-quantity-amount'])[2]"));
		return element;

	}

	public static WebElement BathRoomFaucteLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@data-automation='bathroom-faucets-link']"));
		return element;

	}

	public static WebElement BathSingel(WebDriver driver) {
		element = driver.findElement(By.xpath("(//span[contains(text(),'Single Hole')])[2]"));
		return element;

	}

	public static WebElement Facest(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@data-automation='theme-facet']"));
		return element;

	}

}
