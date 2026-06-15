class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer>fir=new HashMap<>();
        HashMap<Character,Integer>sec=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char fc=s.charAt(i);
            char sc=t.charAt(i);
            if(!fir.containsKey(fc)){
                fir.put(fc,i);
            }
            if(!sec.containsKey(sc)){
                sec.put(sc,i);
            }
            if(!fir.get(fc).equals(sec.get(sc))){
                return false;
            }
        }
        return true;
    }
}