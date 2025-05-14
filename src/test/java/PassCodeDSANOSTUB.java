import java.util.Scanner;

public class PassCodeDSANOSTUB {
    public static void main(String[]args) {
        String A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextLine();
        B = sc.nextLine();
        String passCode = passCode(A,B);
        System.out.println(passCode);
    }
      static String passCode(String A, String B)  {
        String ans ="";
        int size =0;// Integer.max(A.length(),B.length());
        int node=0;
        while (node<size)  {
            if(node<A.length() && node<B.length())  {
                ans += A.charAt(node);
                ans += B.charAt(node);
                node++;
            }
            else if(A.length()>node)  {
                ans += A.charAt(node);
                node++;
            }
            else  {
                ans += B.charAt(node);
                node++;
            }
        }
        return ans;
      }

}
