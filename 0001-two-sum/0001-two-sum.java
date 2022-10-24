class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i<nums.length;i++){
                //containsKey - 맵에 키가 있는지 확인, 있다면 true, 없으면 false
            if(map.containsKey(nums[i])){
                //맵에 삽입
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }
}
