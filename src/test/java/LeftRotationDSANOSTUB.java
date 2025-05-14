import java.util.Scanner;

public class LeftRotationDSANOSTUB {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        leftRotationArr(n,arr);
        for (int i: arr) {
            System.out.println(i);
        }
    }
    static int[] leftRotationArr(int n, int[] arr)  {
        int size = arr.length-1;
        int temp = arr[0];
        for(int i=0;i<size;i++)  {
           arr[i] = arr[i+1];

        }
        arr[size] = temp;
        return arr;
    }
    }