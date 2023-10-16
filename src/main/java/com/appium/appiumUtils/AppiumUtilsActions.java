package com.appium.appiumUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumUtilsActions extends DriverManagerCapabilities {

	public Connection connection;

	public void LongpressAction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public void swipeaction(WebElement ele, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) ele).getId(), "direction", direction, "precent", 0.75));
	}

	public void scrolltotext1(AndroidDriver driver, String text) {

		String uiSelector = "new UiSelector().textMatches(\"" + text

				+ "\")";

		String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("

				+ uiSelector + ");";

		AppiumBy.androidUIAutomator(command);

	}

	public void ScrollTOtextandClick(String text) {
		WebElement scrolltext = driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));"));
		scrolltext.click();
	}

	public void ScrollTOtexttilltextisvisble(String text) {
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));"));
	}

	public void scroll() throws InterruptedException {

		WebElement scroll = driver.findElement(AppiumBy.accessibilityId("more screen text logout title"));

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementID",
				((RemoteWebElement) scroll).getId(), "direction", "down", "percent", 0.75));
	}

	public void mousescroll(WebElement elementToScroll) {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_LEFT).perform();
		actions.moveToElement(elementToScroll).clickAndHold().moveByOffset(0, -500).release().perform();
	}

	public void handlealertpopup() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public String getrandommobilenumber() {

		Random random = new Random();
		int firstDigit = 8 + random.nextInt(2);
		StringBuilder mobileNumber = new StringBuilder(String.valueOf(firstDigit));
		for (int i = 0; i < 9; i++) {
			mobileNumber.append(random.nextInt(10));
		}
		return mobileNumber.toString();

	}

	public String executequery(String query1, String columnName) throws SQLException, IOException {

		connection = DriverManager.getConnection(readprop("DatabaseInstance"), readprop("DatbaseUsername"),
				readprop("DatabasePassword"));

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query1);
		if (resultSet.next()) {
			String columnValue = resultSet.getString(columnName);
			return columnValue;
		} else {

			return null;
		}
	}
	/**
	 * This method is used to perform swipe action from stratx and endx
	 */
	@SuppressWarnings("deprecation")
	public void swipe(int startX,int endX,int startY) {
		//TouchAction<?> touchaction = new TouchAction<>(driver);
		TouchAction touchAction = new TouchAction(driver);

        // Perform the swipe action from startX to endX with a constant startY
        touchAction.press(PointOption.point(startX, startY))
                   .moveTo(PointOption.point(endX, startY))
                   .release()
                   .perform();
	}
	
	

}
