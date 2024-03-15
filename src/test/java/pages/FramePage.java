package pages;

import objects.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=\"text\"]")
    private WebElement singleFrame;

    @FindBy(css = "a[href=\"#Multiple\"]")
    private WebElement iFrameDouble;

    public void dealSingleFrame(FrameObject frameObject){
        frameMethods.switchToFrame("singleframe");

        elementMethods.fillElement(singleFrame, frameObject.getSingleFrame());
        frameMethods.switchToBaseFrame();
    }

    public void dealMultipleFrame(FrameObject frameObject){
        elementMethods.clickElement(iFrameDouble);
        frameMethods.switchToFrame(driver.findElement(By.cssSelector("iframe[src=\"MultipleFrames.html\"]")));
        frameMethods.switchToFrame(driver.findElement(By.cssSelector("iframe[src=\"SingleFrame.html\"]")));
        elementMethods.fillElement(singleFrame, frameObject.getMultipleFrame());
    }

}
