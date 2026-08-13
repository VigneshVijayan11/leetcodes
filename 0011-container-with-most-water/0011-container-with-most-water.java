class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int en=height.length-1;
        int max=0;
        while(st<en){
           int width=en-st;
           int h=Math.min(height[st],height[en]);
           int area=width*h;
           max=Math.max(max,area);

           if(height[st]<height[en]){
              st++;
           }
           else{
            en--;
           }
        }
        return max;
    }
}