
import java.util.*;

public class CountVowelsDSANOSTUB {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countVowels(s));
    }
    static int countVowels(String s)  {
        int count = 0;
        int left=0, right = s.length()-1;
        while (left<right)  {
            String s1 = s.toLowerCase();
            char leftChar = s1.charAt(left);
            char rightChar = s1.charAt(right);
            if(leftChar == 'a' || leftChar == 'e' || leftChar == 'i' || leftChar == 'o' || leftChar == 'u'  )  {
               count++;
            }
            if(rightChar == 'a' || rightChar == 'e' || rightChar == 'i' || rightChar == 'o' || rightChar == 'u')  {
                count++;
            }
            left++;
            right--;
        }
        return count;
    }

}
