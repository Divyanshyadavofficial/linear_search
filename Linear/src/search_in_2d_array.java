import java.util.Arrays;

public class search_in_2d_array {
    public static void main(String[] args) {
        int[][]arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56}
        };
        int target = 12;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        int maximum = max(arr);
        System.out.println(maximum);


    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){

                if(arr[row][col]==target){
                    return new int[]{row,col};

                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0;row< arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){

                if(arr[row][col]>max){
                    max= arr[row][col];

                }
            }
        }
        return max;
    }
}
