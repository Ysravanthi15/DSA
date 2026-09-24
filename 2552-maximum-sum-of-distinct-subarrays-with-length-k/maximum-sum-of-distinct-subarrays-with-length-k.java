class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long currentsum=0;
        long maxsum=0;
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
            currentsum+=key;
            if(i>=k-1){
                if(map.size()==k){
                    maxsum=Math.max(maxsum,currentsum);
                }
                int ok=nums[i-k+1];
                currentsum-=ok;
                map.put(ok,map.get(ok)-1);
                if(map.get(ok)==0){
                    map.remove(ok);
                }
            }

        }
        return maxsum;
    }
}