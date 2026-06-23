class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0, max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
            }else{
                max=Math.max(sum,max);
                sum=0;
            }
        }
        max=Math.max(sum,max);
        return max;
    }
}