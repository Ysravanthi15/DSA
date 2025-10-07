class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else{
                dup=nums[i];
            }
        } 
        int mis=-1;
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                mis=i;
            }
        }
        int ans[]={dup,mis};
        return ans;
    }
}