package selenium;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test()  {
        String s="sh3";
        char c=s.charAt(1);
        if(Character.isDigit(c))  {
            System.out.println("Its a number");
        }else{
            System.out.println("nof number");
        }
    }

    //{2,3,5,25,30,6,32,28,2,5}

 //   >=25 <=30

    @Test
    public  void unique()  {
        if(10-2=8){
            System.out.println(""Hurrah!"");
        }
        int arr[]={2,3,5,25,30,6,32,28,2,5};
        Set<Integer> set = new HashSet<>();
        for(int i : arr)  {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        for(int i=0;i<list.size()-1;i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i)+ list.get(j)>=25 && list.get(i)+ list.get(j)<=30) {
                    System.out.println(list.get(i) +" "+list.get(j));

                }
            }
        }
    }

}
