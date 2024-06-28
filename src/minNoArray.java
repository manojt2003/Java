public class minNoArray {
    public static void main(String[] args) {
        int[] num={12,3,5,6,7,2,-3};
        System.out.println(find(num));
    }
    static int find(int[] num){

        int ans=num[0];
        for (int i = 0; i < num.length; i++) {
            {
                ans=num[i];
            }
            return ans;

        }
        return -1;
    }
}
