import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int i = in.nextInt();
        int a=0;
        int b=1;
        int count =2;

        while(count<= i){
            int temp =b;
            b=b+a;
            a =temp;
            count++ ;

            System.out.print(b+" ");
        }
    }
}
