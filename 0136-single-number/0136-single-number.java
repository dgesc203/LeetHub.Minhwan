class Solution {
    public int singleNumber(int[] nums) {
       
        int qed=0;
        
        //비트연산자 ^는 두 비트가 서로 다를 때 1, 같을때는 0이다.
        //ex) [2, 2, 1] 0 = 0^2(1)
        for(int i =0 ; i<nums.length; i++){
            qed = qed^nums[i];
        }
        return qed;
        
    }
}