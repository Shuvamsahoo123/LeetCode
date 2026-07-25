class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int ele:map.keySet()){
            if(map.get(ele)>max){
                max=map.get(ele);
                ans=ele;
            }
        }
        return ans;
    }
}