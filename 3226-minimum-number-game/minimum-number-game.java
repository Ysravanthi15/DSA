class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           pq.add(nums[i]);
        }
        int j=0;
        while(!pq.isEmpty()){
            int Alice=pq.poll();
            int Bob=pq.poll();
            arr[j++]=Bob;
            arr[j++]=Alice;
        }

        return arr;
        
    }
}