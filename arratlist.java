import java.util.ArrayList;
import  java.util.*;
public class arratlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        for (int i = 0; i <12; i++) {
            int integ=sc.nextInt();
            arr.add(integ);
        }
        System.out.println(arr);
    }
}