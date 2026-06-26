class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int i=0;
        int n=nums.length;
        while(i<n){
        int count=1;
        while(i+count<n && nums[i]==nums[i+count]){
            count++;
        }
        if(count==1){
            sum +=nums[i];
        }
        i +=count;
        }
        return sum;
    }
}