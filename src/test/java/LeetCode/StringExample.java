package LeetCode;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Scanner;

public class StringExample {

    @Test
    public  void  stringEx()  {
        String A="cabacc";
        String B="abc";

        if(A.contains(B))  {
            System.out.println("No change needed");
        }else  {

        }
    }

    public void subString()  {

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(cheating(s,t));
        HashMap<String ,String>map=new HashMap<>();

    }

    static int cheating(String s,String t){
        int flag =1;
        int l=0;
        int r = t.length();
        //  System.out.println(r);
        while(r<s.length())  {
            String str = s.substring(l,r);
            if(str.equals(t))  {
                flag = 0;
                break;
            }
            else {
                l++;
                r++;
            }
        }
        return flag;
    }
}
