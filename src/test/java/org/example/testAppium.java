//package org.example;
//
//import com.google.common.collect.ImmutableMap;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//
//
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.DeviceRotation;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebElement;
//import org.testng.annotations.Test;
//
//import javax.lang.model.element.Element;
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.URL;
//import java.time.Duration;
//
//public class testAppium {
//
//    @Test
//    public void testAppium1() throws MalformedURLException, URISyntaxException {
////        AppiumDriverLocalService s=new AppiumServiceBuilder()
////                .withAppiumJS(new File("C://Users//prachi//AppData//Roaming//npm//node_modules//appium//lib//main.js"))
////                .withIPAddress("127.0.0.1").usingPort(4723).build();
////
////        s.start();
//
//        DesiredCapabilities cap=new DesiredCapabilities();
//
//        cap.setCapability("deviceName","PrachiPhone");
//        cap.setCapability("app","D:\\Appium_Tools\\APKFiles\\resources\\ApiDemos-debug.apk");;
//        AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723"),cap);
//        driver.findElement(AppiumBy.iOSClassChain(""));
//        AndroidDriver androidDriver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),cap);
//        DeviceRotation dr=new DeviceRotation(0,0,90);
//        //androidDriver.rotate(dr);
//        //WebElement ele=androidDriver.findElement(By.id("s"));
//       // TouchAction action=new TouchAction(androidDriver);
//       // action.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele))).waitAction().perform().release();
//
//        //action.tap(PointOption.point(1,2)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2000))).perform();
////
////
////        JavascriptExecutor js=androidDriver;
////        js.executeScript("mobile: longClickGesture",
////                ImmutableMap.of("elementId",
////                        ((RemoteWebElement)ele).getId(),
////                        "duration",2000));
////        androidDriver.executeScript("mobile: longClickGesture",ImmutableMap.of("elementId",
////                ((RemoteWebElement) ele).getId(),"duration",2000));
////
////        // Java
////        boolean canScrollMore = (Boolean) ((JavascriptExecutor) androidDriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
////                "left", 100, "top", 100, "width", 200, "height", 200,
////                "direction", "down",
////                "percent", 1.0
////        ));
//
//    }
//}
