class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            if(nums[l]!=val){
                l++;
            }
            else if(nums[r]==val){
                r--;
            }
            else{
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            }
        }
        return l;
        
    }
}