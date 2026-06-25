class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxlen=0;
        int maxfreq=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char rchar=s.charAt(r);
            map.put(rchar,map.getOrDefault(rchar,0)+1);
            maxfreq=Math.max(maxfreq,map.get(rchar));
            while((r-l+1)-maxfreq>k){
                char lchar=s.charAt(l);
                map.put(lchar,map.get(lchar)-1);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;



    }
}