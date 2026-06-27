class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List ans=new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            List<Integer>res=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0) res.add(nums[j]);
                
            }
            ans.add(res);
        }
        return ans;
    }
}