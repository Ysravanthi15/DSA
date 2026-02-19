class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int n=arr.length;
        int sum=0;
        int count=0;
        for(int r=0;r<n;r++){
            sum+=arr[r];
            if(r-l+1==k){
                long avg=(long)sum/k;
                if(avg>=threshold){
                    count++;
                }
                sum-=arr[l];
                l++;
            }
        }
        return count;
    }
}