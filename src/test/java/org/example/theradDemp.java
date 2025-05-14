package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class theradDemp extends Thread{
    static String ss="";int a=0;
    public void run()  {
        System.out.println("on thread");
    }
    public void run1()  {
        ss=ss+"w";
        System.out.println("Helloo in second");
    }
    public static void test() throws AWTException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        XSSFWorkbook wb=new XSSFWorkbook();
        Sheet sh=wb.getSheet("testData");
        Row row=sh.getRow(0);
        int rowCount=sh.getLastRowNum()-1;
        Cell cell=row.getCell(rowCount);
        JavascriptExecutor ej= (JavascriptExecutor) driver;
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().frame(1);
        for(int i=0;i<rowCount;i++)  {
            cell.getNumericCellValue();
        }
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void main(String args[])  {
        String s="wuh301@bi(Jd7&";int sum=0;
        String llows=s.replaceAll("[^a-z]","");
        String up=s.replaceAll("[^A-Z]","");

        System.out.println(llows+up);
        theradDemp t=new theradDemp();
        t.start();
    }
}
