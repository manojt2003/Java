public class arr1 {
    public static void main(String[] args) {

        int[][] arr ={{1,23,3,5},{4,4,3,3,4},{5,67}};

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");

            }
            System.out.println(arr);
        }
    }
}
