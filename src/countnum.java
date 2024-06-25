public class countnum {

    public static void main(String[] args) {
        int n=554136584;

        int count=0;
        while (n>0){
            int r =n%10;
            if (r==4){
                count++;
            }
            n=n/10;
        }

        System.out.println(count);
    }
}

