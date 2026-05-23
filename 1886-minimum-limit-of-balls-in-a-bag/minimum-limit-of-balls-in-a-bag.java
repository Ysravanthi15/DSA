class Solution {
    public boolean ispossible(int[] nums, int maxOperations,int k){
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val>k){
                int temp=val/k;
                if(val%k!=0){
                    temp++;
                }
                temp--;
                maxOperations-=temp;
            }
            if(maxOperations<0){
                return false;
            }
        }
        return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int m=l+(r-l)/2;
            if(ispossible(nums,maxOperations,m)){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}