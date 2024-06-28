public class searchInString {
    public static void main(String[] args) {
        int[] arr={11,3,4,45,5,6,54,5,463,4};
        int target=56;
        int ans=find(arr ,target);
        System.out.println(ans);

    }
    static int find(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }


        //enhance 2method
        for (int ele:arr){
            if (ele==target){
                return ele;

            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            int ele=arr[i];
//            if (ele == target){
//                return ele;
//
//            }
//
//        }
        return -1;
    }

}



