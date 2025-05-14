import java.util.Scanner;

public class UniqueStringDSANOSTUB {

    public static void main(String[]args) {
    String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();

        String flag = uniqueString(S) ? "Yes" : "No";
        System.out.println(flag);
    }
    static Boolean uniqueString(String S)  {
       Boolean flag =true;
       int start=0 , next = start+1;
       while (start<S.length()-1)  {

           if(S.charAt(start) == S.charAt(next))  {
               flag=false;
               break;
           }
           else if (next<S.length()-1 ) {
               next++;
           }
           else {
               start++;
               next = start+1;
           }
       }
       return flag;
    }
}
