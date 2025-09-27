class Solution {
    public String rev(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;

    }
    public int maximumNumberOfStringPairs(String[] words) {
        int res=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                String a=words[i];
                String b=words[j];
                String ans=rev(b);
                if(a.equals("0")){
                    break;
                }
                if(ans.equals(a)){
                    res+=1;
                    words[j]="0";
                    break;
                }
                

            }
        }
        return res;
    }
}