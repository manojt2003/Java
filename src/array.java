import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        int[] arr = {1,2,35,235,35};
//
//        System.out.println(Arrays.toString(arr));

        int[] arr=new  int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.print(Arrays.toString(arr));


//        Scanner in= new Scanner(System.in);
//        int as= in.nextInt();
//        System.out.println(as);
    }

}
