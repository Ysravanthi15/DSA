class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int res=nums.length/3;
        List<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > res) {
                ans.add(entry.getKey());
            }
        }
        return ans;
        

        
    }
}