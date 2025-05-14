//package org.example;
//
//
//
//import com.beust.jcommander.Parameter;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
//import org.apache.commons.io.FileUtils;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.BaseXSSFEvaluationWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//import org.testng.annotations.DataProvider;
//
//
//import java.io.*;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//public class LoginTest {
//    String url;
//    WebDriver driver;
//    @BeforeTest
//    public void startDriver() throws InterruptedException {
//
//         driver=new ChromeDriver();
//
//
//    }
//
//  @Test
//    public void faceBookloginTest() throws InterruptedException, IOException {
//      url="https://www.facebook.com";
//      driver.get(url);
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(url, driver.getCurrentUrl(), "Url is same");
//        FacebookHomePage fb = new FacebookHomePage(driver);
//        //  driver.findElement(By.id("email")).sendKeys("P");
//        fb.typeEmail("prachimore811@gmail.com");
//
//        FileUtils.copyFile(fb.emailBody.getScreenshotAs(OutputType.FILE), new File(""));
//        fb.typePass("KripaOvi@1511");
//        fb.clickOnLogin();
//        Thread.sleep(9000);
//        driver.switchTo().newWindow(WindowType.TAB);
//        System.out.println(driver.getWindowHandles());
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//
//
//
//    }
//
//
//    @Test
//    public void webTableTest() throws IOException {
//        driver.get("https://www.w3schools.com/html/html_tables.asp");
//        //*[@id="customers"]/tbody/tr[2]/td[1]
//        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//        System.out.println("Total row count is - "+rows.size());
//        List<WebElement> col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
//        System.out.println("Total col count is - "+col.size());
//
//        for(int i=2;i<=rows.size();i++)  {
//            for(int j=1;j<=col.size();j++)  {
//                String rowContent=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
//                System.out.println("row content is - "+rowContent);
//            }
//
//
//        }
//        TakesScreenshot tsc= (TakesScreenshot) rows;
//       File f= tsc.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(f,new File("//resooyces/1.png"));
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//
//    }
//
//
//
//    String pdfurl = "file:///C:/Users/lenovo/Downloads/google_infrastructure_whitepaper_fa.pdf";
//
////    @Test
////
////    public void verifyTextFromPDF() {
////
////        try {
////
////            String pdfContent = getPdfContent(pdfurl);
////
////            Assert.assertTrue(pdfContent.contains("Secure low-level infrastructure"));
////
////
////            Alert alert=new Alert() {
////                @Override
////                public void dismiss() {
////
////                }
////
////                @Override
////                public void accept() {
////
////                }
////
////                @Override
////                public String getText() {
////                    return null;
////                }
////
////                @Override
////                public void sendKeys(String keysToSend) {
////
////                }
////            }
////        } catch (IOException e) {
////
////            // TODO Auto-generated catch block
////
////            e.printStackTrace();
////
////        }
////
////    }
//
//    public static String getPdfContent(String pdfUrl) throws IOException {
//
//        URL pdfURL = new URL(pdfUrl);
//
//        InputStream is = pdfURL.openStream();
//
//        BufferedInputStream bis = new BufferedInputStream(is);
//
////        PDDocument doc = PDDocument.load(bis);
////
////        PDFTextStripper strip = new PDFTextStripper();
////
////        String stripText = strip.getText(doc);
////
////        System.out.println(stripText);
////
////        doc.close();
//
//        return "a";
//
//    }
//
//    @Test(dataProvider = "testData")
//    public void readExcelData(int a,int b,int c) throws IOException {
////        int d;
////        System.out.println(d=a+b+c);
////        File f=new File("D:\\Selenium\\Practice.xlsx");
////        FileInputStream fi=new FileInputStream(f);
////        Workbook wb=new XSSFWorkbook(fi);
////
////        Sheet sh =wb.getSheet("TestData");
////        Row r=sh.getRow(0);
////        int rowCount=sh.getLastRowNum()+1;
////        Cell cq;
////        System.out.println(rowCount);
////        System.out.println(r.getLastCellNum());
////        for(int i=1;i<rowCount;i++)  {
////            for(int j=0;j<r.getLastCellNum();j++)  {
////
////                 System.out.print(sh.getRow(i).getCell(j).getNumericCellValue());
////                 this.getClass();;
////            }
////        }
//
//        int num=10;int flag=0;int s1=1;int s2=10;
//        for(int i = s1; i <= s2; i++)
//        {
//            for(int j = 2; j < i; j++)
//            {
//                if(i % j == 0)
//                {
//                    flag = 0;
//                    break;
//                }
//                else
//                {
//                    flag = 1;
//                }
//            }
//            if(flag == 1)
//            {
//                System.out.println(i);
//            }
//        }
//    }
//    }
//    public enum name  {
//        MONDAY("monday",1),
//        TUESDAY("monday",1),
//        WEDNESDAY("monday",1);
//        String day;
//        int number;
//        name(String day,int number)  {
//            this.day=day;
//            this.number=number;
//        }
//        String getFullNAme()  {
//            return day;
//        }
//        int getDay()  {
//            return number;
//        }
//
//    @Test
//    public  void demo()  {
//        name.MONDAY.getFullNAme();
//
//      //  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
//
//
//
////        int arr[]={0,10,9,7,1};
////        int first=arr[0],send=0;
////        for(int i=0;i<arr.length;i++)  {
////            if(arr[i]>first)  {
////                send=first;
////                first=arr[i];
////            }
////            else if (arr[i]>send)  {
////                send=arr[i];
////            }
////        }
//
////        System.out.println("sec"+send);
//
//        HashMap<String,Integer>map=new HashMap<>();
//        map.put("id",6);
//        map.put("id1",1);
//        map.put("id2",9);
//        map.put("id3",7);
//        int i=0;
//      int ar[] =new int[map.size()];
//      for(Map.Entry<String ,Integer>e:map.entrySet()) {
//
//        ar[i]=e.getValue();
//        i++;
//
//      }
//        for(int j=0;j<ar.length;j++)  {
//            System.out.println(ar[j]);
//        }
//        for(int k = 0; k<ar.length; k++)  {
//
//            for (int j=k+1; j<ar.length; j++)  {
//                int temp = ar[0];
//                if(ar[j] < ar[k])  {
//                    ar[k]=ar[j];
//                    ar[j]=temp;
//                }
//            }
//
//
//        }
//        for(int j=0;j<ar.length;j++)  {
//            System.out.println("sorte"+ar[j]);
//        }
//    }
//
//
//
//    @DataProvider(name="testData")
//    public Object[][] dataSet()  {
//        return new Object[][] { {1,2,3},{2,3,4}};
//    }
//
//
//    @AfterMethod
//    public void close()  {
//       // driver.close();
//    }
//
//
//
////    @Test
////    public int add(int n, int a[]) {
////        /*HashMap <Character , Integer> M = new HashMap<Character , Integer>();
////
////
////        Set<Character> st = new HashSet<>();
////        int n = s.length();
////
////        for (int i = 0; i < n-1; ++i) {
////            st.add(s.charAt(i));
////        }
////
////        if (st.size() == 1) {
////            return 1;
////        } else {
////            return 0;
////        }*/
////
////        HashMap <Integer, Integer> map = new HashMap<>();
////        for (int i = 0; i<a.length; i++)  {
////            if(map.containsKey(a[i]))  {
////                map.put(a[i],map.get(a[i]+1));
////            }
////            else  {
////                map.put(a[i],1);
////            }
////        }
//
////return 1;
////    }
//}
//
//
//
//
//
//
