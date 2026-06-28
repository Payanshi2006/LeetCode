class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
        if(entry.getValue()>n/3){
            list.add(entry.getKey());
        }
        }
        return list;
    }
}