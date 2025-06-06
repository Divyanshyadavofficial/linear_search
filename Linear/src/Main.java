public class Main {
    public static void main(String[] args) {
        int [] nums = {1,23,4,5,3,12,2};
        int target = 4;
        boolean ans = linear_search3(nums,target);
        System.out.println(ans);
    }
//    static int linear_search(int []arr,int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for(int index=0; index < arr.length;index++){
//            int element = arr[index];
//            if(element==target){
//                return index;
//
//            }
//        }
//        return -1;
//    }
//    static int linear_search2(int []arr,int target){
//    if(arr.length == 0){
//        return Integer.MaxValue;
//    }
//    for (int element : arr) {
//        if (element == target) {
//            return element;
//
//        }
//    }
//    return Integer.MaxValue;
//}
static Boolean linear_search3(int []arr,int target){
    if(arr.length == 0){
        return false;
    }
    for (int element : arr) {
        if (element == target) {
            return true;

        }
    }
    return false;
}

}