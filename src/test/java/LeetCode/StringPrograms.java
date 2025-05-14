package LeetCode;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.logging.Logger;

public class StringPrograms {
static Logger log=Logger.getLogger(String.valueOf(StringPrograms.class));
    @Test
    public void palindrome()  {
        String s="mom";
        String s1="";

        for(int i=s.length()-1;i>=0;i--)  {
            s1=s1+s.charAt(i);
        }
        StringBuilder s2=new StringBuilder(s);
        s2.reverse();
        System.out.println(s2);
        System.out.println(s);

        if(s2.equals(s) ) {
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }

    @Test
    public void vowel()  {
        String s="KBqcjkdaweIo";
        int vowelCount=0,constantCount=0;
        for(int i=0;i<s.length();i++)  {
            if(s.charAt(i)=='a'||s.charAt(i)=='A'||
                    s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||
                    s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')  {
                vowelCount++;
            }else{
                constantCount++;
            }
        }
        System.out.println("vowel counr is = "+vowelCount);
        System.out.println("constant counr is = "+constantCount);
    }
    @Test
    public void firstNonrepeating()  {
        String s="eeeeqqejnnw";
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<s.length();i++)  {
            if(map.containsKey(s.charAt(i)))  {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else  {
                map.put(s.charAt(i),1);
            }
        }
        TreeSet<Integer> set=new TreeSet<>(map.values());
        LinkedHashMap<Character,Integer> lmap=new LinkedHashMap<>();
        System.out.println(set.last());
        Set<Character> keySetMap=map.keySet();

        for(Map.Entry<Character,Integer>e:map.entrySet())  {
           if(e.getValue()==set.last())  {
               System.out.println("most frequent+"+e.getKey());
               break;
           }
        }

    }


    @Test
    public void checkDigits() {
        String s="988q68";boolean flag=true;
        for(int i=0;i<s.length();i++)  {
            if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)  {
                System.out.println("not all digits");
                flag=false;
                break;
            }
        }
        if(flag==true)  {
            System.out.println("all are digits");
        }
    }

    @Test
    public void duplicateWord() {
        String s="Tomorrow";
        int count=0;
        String newS="";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'o')  {
                count++;
                for(int j=0;j<count;j++)  {
                    newS=newS+'&';
                }
            }else{
                newS=newS+s.charAt(i);
            }
        }
        System.out.println(newS);
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        while(i<s.length()){
            if(map.containsKey(s.charAt(i)))  {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
            i++;
        }

    }

    @Test
    public void stringProgram()  {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        String s="This is my framework";

        String[] sarr=s.split(" ");
        List<String>list=new ArrayList<>();

        for(int i=0;i<sarr.length;i++)  {
            list.add(sarr[i]);
        }
       list.forEach((e)-> System.out.println(e));
        System.out.println(list);
       list.forEach((m->{
           System.out.println(m);
           if(m.equals("is"))  {
               System.out.println(m);
           }
       }) );
        HashMap<String,Integer>map=new HashMap<>();
        map.put("pra",1);
        map.put("sam",2);
        map.put("ss",1);
        map.put("sdcds",1);


    }

    @Test
    public void anagram()  {
        String s1="care";
        String s2="Race";

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        List<Character>list1=new ArrayList<>();
        List<Character>list2=new ArrayList<>();
        for(int i=0;i< s1.length();i++)  {
            list1.add(s1.charAt(i));
        }
       // Collections.sort(list1);
        System.out.println(list1);
        for(int i=0;i< s2.length();i++)  {
            list2.add(s2.charAt(i));
        }
     //   Collections.sort(list2);
        System.out.println(list2);

        if(list1.equals(list2))  {
            System.out.println("strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
    }

    @Test(retryAnalyzer = Retry.class)
    public void recurFact()  {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");

        int num=6;
        int factSum=0;
        factSum= factorial(num);
        System.out.println(factSum);
        if(factSum==720)  {
            log.info("Going in retry");
            Assert.fail();
        }

    }
    public int factorial(int n) {
        if(n>=1)  {
            return n*factorial(n-1);
        }else {
            return 1;
        }
    }
    @Test
    public void test() throws IOException {

       FileReader reader=new FileReader(new File("D:\\Demo\\prachi_text.txt"));
        BufferedReader reader1=new BufferedReader(reader);
    String line;
        List<String>list=new LinkedList<>();

        while(!((line = reader1.readLine()) == null)){
            list.add(line);
        }
       FileWriter w=new FileWriter("D:\\Demo\\new.txt\\");
      BufferedWriter b=new BufferedWriter(w);
      for(int i=0;i<list.size();i++)  {
        // b.write("Good");
          b.newLine();
          b.append(list.get(i));
      }

       b.close();
    }


    @Test
    public void alphabet()  {
        String s="My name is prachi";
        s=s.replaceAll(" ","").toLowerCase();
        char arr[]=s.toCharArray();
        List<Character>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)  {
            list.add(arr[i]);
        }
        Collections.sort(list);
       list.forEach(e-> System.out.println(e));
    }

    @Test
    public void arrayF()  {
        //1. Find a peak element which is not smaller than its neighbors
//Input: arr[] = {10, 20, 15, 2, 23, 90, 90}  //20,90 //90
        int arr[] = {10, 20, 15, 200, 23, 90, 90};
        int larestValue = 0;
        for(int i=1; i<arr.length-1;i++)  {
            if(arr[i-1]>arr[i])  {
                larestValue= Math.max(larestValue,arr[i-1]);
            }
            else if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])  {
                larestValue = Math.max(larestValue,arr[i]);
            }
            else if(arr[i+1]>arr[i])  {
                larestValue = Math.max(larestValue,arr[i+1]);
            }
        }
        System.out.println(larestValue);
    }

    @Test
    public void recusioFact()  {
    int factorial=1;
        System.out.println( fact(6));
    }

    public int fact(int num)  {

        if(num>=1)  {
          return num*fact(num-1);
        }else {
            return 1;
        }
    }

    @Test
    public void missingNumber()  {
        int arr[]={2,7,10};
        List<Integer>list=new ArrayList<>();
        int diff=0;
        for(int i=0;i<arr.length-1;i++)  {
            diff=arr[i+1]-arr[i];
//            list.add(arr[i]);
            for(int j=1;j<diff;j++)  {
                list.add(i+j);
            }
        }
        System.out.println(list);
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName("Chrome");


    }
}
