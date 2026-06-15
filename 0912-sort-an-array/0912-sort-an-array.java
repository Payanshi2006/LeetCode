class Solution {
    public void merge(int[] nums,int left,int right){
        int[] temp=new int[right-left+1];
        int k=0;
        int mid=left+(right-left)/2;
        int i=left,j=mid+1;
        while(i<=mid && j<=right){
            
        if(nums[i]>nums[j]){
            temp[k++]=nums[j++];
        }else{
            temp[k++]=nums[i++];
        }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=right){
            temp[k++]=nums[j++];
        }
        for(int p=0;p<temp.length;p++){
            nums[left+p]=temp[p];
        }
    }
    public void mergeSort(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,right);

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;

    }
}