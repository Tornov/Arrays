import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        arr[0]=arr[0]^arr[1];
        arr[1]=arr[0]^arr[1];
        arr[0]=arr[0]^arr[1];
        System.out.println(Arrays.toString(arr));
    }
}