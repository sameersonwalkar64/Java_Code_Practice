import java.util.*;

public class UniqueWordsDSANOSTUB {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(uniqueWord(n, arr));
    }
    static int uniqueWord(int n, String[] arr)  {

        Map<String, Integer> map = new HashMap<>();
        for (String str:arr) {
            str = str.toLowerCase();
            //map.put(str,map.getOrDefault(str,0)+1);
        }

       return map.size();
    }
}
