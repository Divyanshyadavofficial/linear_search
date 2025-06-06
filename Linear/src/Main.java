public class Main {
    public static void main(String[] args) {
        int [] nums = {1,23,4,5,3,12,2};
        int target = 4;
        int ans = linear_search(nums,target);
        System.out.println(ans);
    }
    static int linear_search(int []arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index < arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;

            }
        }
        return -1;
    }

}