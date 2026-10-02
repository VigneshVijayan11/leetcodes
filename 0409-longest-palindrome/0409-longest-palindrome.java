class Solution {
    public int longestPalindrome(String s) {
     HashMap<Character,Integer>map=new HashMap<>();
     for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
     }
     int res=0;
     boolean hasodd=false;
     
     for(int count:map.values()){
        if(count%2==0){
            res+=count;
        }
        else{
            res+=count-1;
            hasodd=true;
        }
     }
     if(hasodd){
        res+=1;
     }
    return res;
    }
}