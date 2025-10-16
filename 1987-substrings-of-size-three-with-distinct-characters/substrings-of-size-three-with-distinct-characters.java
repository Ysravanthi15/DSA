class Solution {
    public int countGoodSubstrings(String s) {
      HashMap<Character,Integer>hs=new HashMap<>(); 
      int n=s.length();
      int sl=3;
      int ans=0;
      int l=0;
      for(int r=0;r<n;r++){
        char ch=s.charAt(r);
        hs.put(ch,hs.getOrDefault(ch,0)+1);
        if(r-l==sl){
            char tch=s.charAt(l);
            hs.put(tch,hs.get(tch)-1);
            if(hs.get(tch)==0){
                hs.remove(tch);
            }
            l++;
        }
        if(hs.size()==sl){
            ans+=1;
        }
      }
      return ans;
    }
}