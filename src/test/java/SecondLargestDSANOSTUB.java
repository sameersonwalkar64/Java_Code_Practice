import java.util.Scanner;

public class SecondLargestDSANOSTUB {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargestNUmber(n, arr));
    }
    static int secondLargestNUmber(int n, int arr[])  {
        int firstlargestNumber = 0;
        int secondLargestNumber = 0;
        for(int i=0; i<n; i++)  {
            if(arr[i]>firstlargestNumber  )  {
                int temp = firstlargestNumber;
                firstlargestNumber = arr[i];
                secondLargestNumber = temp;
            }
            else if(arr[i]>secondLargestNumber && arr[i]<firstlargestNumber)  {
                secondLargestNumber = arr[i];
            }

        }
        if(secondLargestNumber == 0)  {
            return -1;
        }
        return secondLargestNumber;
    }
}
