package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import setups.Capabilities;

public class DoTransaction extends Capabilities {
    @Before({"@StockbitTesting"})
    public void setup()throws Exception{
        deviceInfo();
    }

    @Given("^Find and Click Item Sauce Lab Back Packs$")
    public void doClickItem() throws Exception{
        androidDriver.findElementByAccessibilityId("Sauce Lab Back Packs").click();
        androidDriver.findElementByAccessibilityId("Blue color").click();
        androidDriver.findElementByAccessibilityId("Tap to add product to cart").click();
    }

    @Given("^Select Color Blue and Increase Item Quantity Up To 2$")
    public void doIncreaseQuantity() throws Exception{
        MobileElement elementToClick = (MobileElement) androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                + "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/plusIV\"));");
        elementToClick.getText();
        int i;
        for(i=0;i<=2;i++) {
            androidDriver.findElement(By.id("com.saucelabs.mydemoapp.android:id/plusIV")).click();
        }
    }

    @Given("^Click Button Cart and Proceed To Checkout$")
    public void doTransactionCheckout() throws Exception{
        androidDriver.findElementByAccessibilityId("Displays number of items in your cart").click();
        androidDriver.findElementByAccessibilityId("Confirms products for checkout").click();
    }

    @After({"@StockbitTesting"})
    public void stop() {
        stopServer();
    }
}
