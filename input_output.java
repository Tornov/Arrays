import java.util.*;
public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        //syntax of a 1D arrays
        // datatype[] variable_name=new dattype[size]
        int[] arr=new int[size];
        //we can also write a array like ...
        //  int[] arr={12,2566,458};
        //but this way programmer declear the size and variable in the array


        //taking input form user
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        //there is 3 type of taking output of array
        //output

        //1st method
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //2nd method
        System.out.println(Arrays.toString(arr));

        //3rd method
        for(int nums :arr){
            System.out.println(nums+" ");
        }

    }
}
