class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int minval=nums[0];
        for(int i=1;i<nums.length;i++){
            int val=nums[i];
            if(minval<val){
                max=Math.max(max,val-minval);
            }
            else{
                minval=Math.min(minval,val);
            }
           
        }
        return max;
    }
}