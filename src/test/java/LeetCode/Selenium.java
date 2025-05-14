package LeetCode;

import net.bytebuddy.build.Plugin;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;

public class Selenium {
    WebDriver driver;
    String parentWindow;
    Set<String>s=new LinkedHashSet<>();
    @BeforeSuite
    public void beforesuit()  {
        System.out.println("before suite");
    }
    @AfterSuite
    public void afterSuite()  {
        System.out.println("after siue");
    }
    @BeforeClass
    public void befoClas()  {
        System.out.println("in before class");
    }

    public void methodName() {

    }
//    @Parameters({"browser"})
//    public void inti(String browser)  {
//        if(browser.equalsIgnoreCase("chrome"))  {
//            driver=new ChromeDriver();
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            driver=new FirefoxDriver();
//        }
//        System.out.println("efore class");
//
//    }
    @BeforeMethod
    public void beforeMethodTest()  {
        System.out.println("in before method");
    }
    @BeforeTest
    public void beforeTestTest() {
        System.out.println("before test method");
    }
    @Test(priority = 1)

    public void select() throws IOException {
        driver=new ChromeDriver();
        driver.get("https://www.google.com");
         parentWindow=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(30L))
//                .pollingEvery(Duration.ofSeconds(5L))
//                .ignoring(NoSuchElementException.class);
//        WebElement element1 = fluentWait.until(new Function<WebDriver, WebElement>() {
//
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.className("ew"));
//            }
//        });
//
//        RemoteWebDriver driver1 = new ChromeDriver();
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("browserName", "chrome");
//
//        TakesScreenshot tsc = (TakesScreenshot) driver;
//        File f = tsc.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(f, new File(""));
//        File screenshot = ele.getScreenshotAs(OutputType.FILE);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("argument[0].click(),ele");
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//        Select s=new Select(ele);
//        Wait<WebDriver>fluentWait1=new FluentWait<WebDriver>(driver1)
//                .withTimeout(Duration.ofSeconds(2))
//                .pollingEvery(Duration.ofSeconds(3));
//      WebElement el=  wait.until(new Function<WebDriver, WebElement>() {
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.id("id"));
//            }
//        });
        TakesScreenshot t=(TakesScreenshot) driver;
        File screenshot=t.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("image.png"));

      driver.switchTo().window(parentWindow);
      driver.manage().window().setPosition(new Point(10,10));
    }
    @Test(priority = 1)
    public void a() throws IOException, InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobile");


        Thread.sleep(3000);
        List<WebElement>list=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc']/li"));

        for(WebElement el:list)  {
            System.out.println(el.getText());
        }

    }
    @AfterTest
    public void afterTest()  {
        System.out.println("after test");
    }
    @AfterMethod
    public void afterMethid()  {
        System.out.println("after metgid");
    }
        @AfterClass
    public void tearDown()  {
            System.out.println("after class");
       // driver.quit();
    }

    @Test
    public void palindromeSubstring()  {
        String str="abasb";
        int start=0,end=str.length()-1,ref=str.length()-1,ref2=0;

        while(start<str.length()-2)  {
            if(str.charAt(start)==str.charAt(end)&&start<end)  {
                if(end==start+1)  {
                    break;
                }else {
                    start++;
                    end--;
                }

            }else if (start==end||end==start+1)  {
                ref2++;
                start=ref2;
                end=str.length()-1;
            } else if (str.charAt(start)!=str.charAt(end)) {
                start=0;
                ref--;
                end=ref;

            }
        }
        if(ref==ref2+1)  {
            System.out.println("none");
        }else  {
            str.substring(ref,ref2);
        }

    }
}
