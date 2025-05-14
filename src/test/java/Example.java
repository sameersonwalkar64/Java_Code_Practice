import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        int a=0,b=0,c=1,n=10;
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }

    }



}
