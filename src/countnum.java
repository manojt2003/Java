import java.util.Arrays;

public class countnum {

    public static void main(String[] args) {

        int[] arr={1,2,3,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] num) {
        num[0]= 77;

    }
}
