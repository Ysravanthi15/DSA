class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int rmax=-1;
        for(int i=n-1;i>=0;i--){
            int prev=arr[i];
            arr[i]=rmax;
            rmax=Math.max(rmax,prev);
        }
        return arr;
    }
}