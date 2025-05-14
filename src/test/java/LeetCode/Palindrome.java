package LeetCode;

import java.util.*;
import org.testng.annotations.Test;

public class Palindrome {
    @Test
    public void palindromeSubstring()  {
        String str="edesddsedgg";
        int start=0,end=str.length()-1,ref=str.length()-1,ref2=0;

        while(start<str.length()-2)  {
            if(str.charAt(start)==str.charAt(end))  {
                if(end==start+1)  {
                    break;
                }else if(start == end)  {
                    break;
                }
                else {
                    start++;
                    end--;
                }

            }else if (start==end||end==start+1)  {
                ref2++;
                start=ref2;
                end=str.length()-1;
            } else if (str.charAt(start)!=str.charAt(end)) {

                ref--;
                end=ref;

            }
        }
        if(ref==ref2+1)  {
            System.out.println("none");
        }else  {
            str.substring(ref2,ref);
            System.out.println(str.substring(ref2,ref+1));
        }

    }


   final public void overloading()  {

    }

    final public void overloading(String name)  {

    }


}
