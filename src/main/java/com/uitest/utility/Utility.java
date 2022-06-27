package com.uitest.utility;

import com.uitest.drivermanager.ManageDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Utility extends ManageDriver {

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }



    public void clickOnElement(WebElement element) {
        element.click();
    }


   public void mouseHoverToElement(WebElement element) {
       Actions actions = new Actions(driver);
       actions.moveToElement(element).perform();
   }
    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }

    public void selectByValueFromDropDown(WebElement element, String value) {
        new Select(element).selectByValue(value);
    }


    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String destination = System.getProperty("user.dir") + "/src/main/java/com/uitest/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

}
