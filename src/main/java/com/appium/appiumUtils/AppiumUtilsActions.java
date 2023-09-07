package com.appium.appiumUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AppiumUtilsActions extends DriverManagerCapabilities {


	public void LongpressAction(WebElement ele) {
        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",ImmutableMap.of("elementId",
        ((RemoteWebElement)ele).getId(),"duration",2000));
      }


    public void swipeaction(WebElement ele,String direction)
    {
     ((JavascriptExecutor)driver).executeScript("mobile: swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
       "direction",direction,
        "precent",0.75 ));
     }


    public void scrolltotext1(AndroidDriver driver,String text) {

        String uiSelector = "new UiSelector().textMatches(\"" + text

                + "\")";

            String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("

                + uiSelector + ");";

            AppiumBy.androidUIAutomator(command);

    }







    /**

     * @author Pavan.Joshi

     * This method used for Scroll till particular text

     * @param text

     */

    public void ScrollTOtextandClick(String text)
    {
    WebElement scrolltext = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
    scrolltext.click();
    }


    public void ScrollTOtexttilltextisvisble(String text)
    {
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
    }

    public void scroll() throws InterruptedException {

    	 WebElement hahj = driver.findElement(AppiumBy.accessibilityId("more screen text logout title"));


    	 ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
    		    "elementID", ((RemoteWebElement)hahj).getId(),
    		    "direction","down",
    		    "percent",0.75
    		));



    	//boolean canScrollMore;



//    	do {
//    	canScrollMore= (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//    		    "left", 100, "top", 100, "width", 200, "height", 200,
//    		    "direction", "up",
//    		    "percent", 3.0
//    		));
//    	}
//    	while(canScrollMore);
//
//    	Thread.sleep(3000);








//    	TouchAction touchAction = new TouchAction(driver);
//        touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(targetElement)).withDuration(Duration.ofMillis(1000))).release().perform();
//
//        // Simulate scrolling (page up and down)
//        int startX = driver.manage().window().getSize().getWidth() / 2;
//        int startY = driver.manage().window().getSize().getHeight() / 2;
//        int scrollAmount = 200; // Adjust this value as needed
//
//        // Scroll down
//       // touchAction.press(ElementOption.point(startX, startY)).moveTo(ElementOption.point(startX, startY - scrollAmount)).release().perform();
//
//        // Wait for a moment (you can add an explicit wait here if needed)
//
//        // Scroll up
//        touchAction.press(ElementOption.point(startX, startY - scrollAmount)).moveTo(ElementOption.point(startX, startY)).release().perform();
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



	}





