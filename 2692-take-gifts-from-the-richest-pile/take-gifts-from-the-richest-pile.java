class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        while(k>0){
            int temp=pq.poll();
            int sq=(int)Math.sqrt(temp);
            pq.add(sq);
            k--;
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;

    }
}