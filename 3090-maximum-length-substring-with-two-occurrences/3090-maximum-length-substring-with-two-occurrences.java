class Solution {
    public int maximumLengthSubstring(String s) {
        int freq[]=new int[26];
        int end=0;
        int maxlength=0;
        for(int start =0;start<s.length();start++){
            freq[s.charAt(start)-'a']++;
            while(freq[s.charAt(start)-'a']>2){
                freq[s.charAt(end)-'a']--;
                end++;
            }
            maxlength=Math.max(maxlength,start-end+1);
        }
        return maxlength;
    }
}