package com.reduxmedia;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.*;

public class SearchGoogleSite {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("The good, the bad, and the ugly");
		searchBox.submit();

		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println("Number of buttons on this page is "
				+ buttons.size());
		for (int i = 0; i < buttons.size(); i++) {
			System.out
					.println("----------------------------------------------");
			System.out.println("Location of " + i + "th button is "
					+ buttons.get(i).getLocation());
			System.out.println("Name of " + i + "th button is "
					+ buttons.get(i).getAttribute("name"));
			System.out.println("Size of " + i + "th button is "
					+ buttons.get(i).getSize());
		}

//		// select many items at the same time
//
//		// Add all the actions into the Actions builder.
//		Actions builder = new Actions(driver);
//		WebElement one1 = driver.findElement(By.name("one"));
//		WebElement eleven1 = driver.findElement(By.name("eleven"));
//		WebElement five1 = driver.findElement(By.name("five"));
//		builder.keyDown(Keys.CONTROL).click(one1)
//				.click(eleven1)
//				.click(five1).keyUp(Keys.CONTROL);
//		// Generate the composite action.
//		Action compositeAction = builder.build();
//		// Perform the composite action.
//		compositeAction.perform();
//
//		// click on the current mouse location
//
//		Actions builder2 = new Actions(driver);
//		builder2.moveByOffset(buttons.get(2).getLocation().getX() + 1,
//				buttons.get(2).getLocation().getY() + 1).click();
//		builder2.perform();
//
//		// dblclick
//
//		WebElement dblClick = driver.findElement(By.name("dblClick"));
//		Actions builder3 = new Actions(driver);
//		builder3.doubleClick(dblClick).perform();
//
//		// click
//
//		WebDriver driver2 = new FirefoxDriver();
//		driver2.get("file://C:/Selectable.html");
//		WebElement one = driver2.findElement(By.name("one"));
//		WebElement eleven = driver2.findElement(By.name("eleven"));
//		WebElement five = driver2.findElement(By.name("five"));
//		Actions builder5 = new Actions(driver);
//		// Click on One
//		builder5.click(one);
//		builder5.build().perform();
//		// Click on Eleven
//		builder5.click(eleven);
//		builder5.build().perform();
//		// Click on Five
//		builder5.click(five);
//		builder5.build().perform();
//
//		// navigation
//
//		driver.navigate().to("http://www.google.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//
//		// implicit wait for loading the page
//
//		WebDriver driver6 = new FirefoxDriver();
//		driver6.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver6.get("www.google.com");
//
//      // read attributes of some elements
//		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.google.com");
//		WebElement searchButton = driver.findElement(By.name("btnK"));
//		System.out.println("Name of the button is: "
//				+ searchButton.getAttribute("name"));
//		System.out.println("Id of the button is: "
//				+ searchButton.getAttribute("id"));
//		System.out.println("Class of the button is: "
//				+ searchButton.getAttribute("class"));
//		System.out.println("Label of the button is: "
//				+ searchButton.getAttribute("aria-  label"));

	}
}
