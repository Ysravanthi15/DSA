class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int cnt=0;
        int prefsum=0;
        for(int i=0;i<nums.length;i++){
            prefsum+=nums[i];
            int remove=prefsum-k;
            cnt+=hm.getOrDefault(remove,0);
            hm.put(prefsum,hm.getOrDefault(prefsum,0)+1);

        }
        return cnt;
        
    }
}