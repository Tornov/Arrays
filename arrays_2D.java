import java.util.*;
public class arrays_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows:");
        int row=sc.nextInt();
        System.out.printf("enter columns:");
        int col=sc.nextInt();
        // 2D arrays
        //syntax...
        //     datatype[][] variable_name=new datatype[rows][col]
        int[][] arr=new int[row][col];


        //arr={{1,2,3},}
        //    { {1,8}, }
        //    { {56,89}}



        //take input form user
        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
