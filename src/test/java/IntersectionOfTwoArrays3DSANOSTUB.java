import java.util.*;
public class IntersectionOfTwoArrays3DSANOSTUB {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums1 = new int[N];
        for (int i = 0; i < N; i++) {
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[N];
        for(int j=0; j<M; j++){
            nums2[j] = sc.nextInt();
        }
        Integer [] ans = intersectionOfTwoArray(N,M,nums1,nums2);
        for (int num : ans)  {
            System.out.println(num);
        }

    }
    static Integer[] intersectionOfTwoArray(int N,int M,int[]nums1, int[]nums2)  {
        Set <Integer> set = new HashSet<>();
        for(int j : nums1)  {
            for (int k : nums2)  {
                if(j == k)  {
                    set.add(j);

                }
            }
        }

        Integer [] arr = new Integer[set.size()];
        set.toArray(arr);

        return arr;
    }
}
