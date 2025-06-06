public class maxwealth {
    public static void main(String[] args) {
         int[][] accounts = {
                 {1, 2, 3},
                 {3, 2, 1}
         };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][]accounts){
        int max_sum = Integer.MIN_VALUE;

        for (int person=0;person<accounts.length;person++){
            int sum = 0;
            for(int account = 0; account<accounts[person].length;account++){
                sum+=accounts[person][account];

            }
            if(sum>max_sum){
                max_sum = sum;
            }

        }
        return max_sum;
    }
}
