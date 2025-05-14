package LeetCode;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.*;

public class Demo {

//    PRACHI - original string.
//
//    RIACPH RPAECH

    @Test
    public void stringDemo() {
        String s = "PRACHI";
        String s1 = "RPAECH";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char temp;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (char c : arr) {
            System.out.println(c);
        }

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list1.add(s.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
            list2.add(s1.charAt(i));
        }


//        Collections.sort(list1);
//        Collections.sort(list2);

        if (list1.equals(list2)) {
            System.out.println("strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }


    }

    @Test
    public void arr() {
        int a[] = {2, 8, 4, 1, 0, 5};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }

    @Test
    public void nearPalindrom() {
        int number = 117;
        int index1 = 0, index2 = 0;
        int rem=0, rev = 0, tempNumber;
        for (int i = number - 1; i > 0; i--) {
            tempNumber = i;
            rev = 0;
            while (tempNumber > 0) {
                rem = tempNumber % 10;
                rev = rev * 10 + rem;
                tempNumber = tempNumber / 10;
            }

            rev=revNumber(tempNumber,rev,rem,index1);
            if (rev == i) {
                index1 = number - rev;
                System.out.println("found at" + (number - rev));
                break;
            }

        }
        for (int i = number + 1; i > number; i++) {
            tempNumber = i;


            if (rev == i) {
                index2 = rev - number;
                System.out.println("found" + (rev - number));
                break;
            }


        }
        if (index1 < index2) {
            System.out.println("nearest palindrome is " + (number - index1));
        } else {
            System.out.println("nearest palindrome is " + (number + index2));
        }


    }

    public int revNumber(int tempNumber, int rev, int rem, int index) {
        rev = 0;
        while (tempNumber > 0) {
            rem = tempNumber % 10;
            rev = rev * 10 + rem;
            tempNumber = tempNumber / 10;
        }
        return rev;
    }

@Test
    public void palindrom()  {
        Integer a = 12;

        Integer left = a-1;
        Integer right = a+1;
        boolean flag = false;
        while(flag == false)  {
            String s =left.toString();

            int l =0;

//            while(l<r)  {
//                if(s.charAt(l) == s.charAt(r) {
//
//                }
//            }

        }



}
@Test
    public void appiumService() throws MalformedURLException {
    AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\prachi\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
            .withIPAddress("127.0.0.1").usingPort(4723).build();
    service.start();
    DesiredCapabilities cap=new DesiredCapabilities();
    AndroidDriver driver=new AndroidDriver(new URL(""),cap);
    TouchAction action=new TouchAction(driver);
    WebElement ele=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"s\")"));
    action.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele))).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).perform();
    action.tap(TapOptions.tapOptions().withPosition(PointOption.point(10,10))).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).perform();

    action.press(ElementOption.element(ele)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release().perform();

    int startx=ele.getRect().getX();
    int startu=ele.getRect().getY();
    action.tap((TapOptions) ele).perform();

    service.isRunning();

}

@Test
public void tes()  {
    ArrayList<Integer> arrayList=new ArrayList<>();

    arrayList.add(1);
    arrayList.add(2);

    arrayList.add(2);
    arrayList.add(2);


    Set<Integer> set= new HashSet<>(arrayList);

    System.out.println(set);
}


}
