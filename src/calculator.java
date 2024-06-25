import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int ans=0;

        while (true){
            System.out.print("enter the operator: ");
            char i =num.next().trim().charAt(0);

            if (i == '+'|| i=='-'|| i=='/' || i=='%'|| i=='*');
            {
                System.out.print("enter the 2 num: ");

                int num1=num.nextInt();
                int num2 = num.nextInt();

                if (i=='+'){
                    ans=num1+num2;

                }
                if (i=='-'){
                    ans=num1-num2;

                }
                if (i=='*'){
                    ans=num1*num2;

                }
                if (i=='%'){
                    ans=num1%num2;

                }
                if (i=='/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                else if (i=='x'||i=='X') {
                    break;
                }
                else {
                    System.out.println("invalid operation! ");
                }
                System.out.println(ans);
            }



        }
    }
}
