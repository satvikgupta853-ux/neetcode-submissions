class Solution {
    public int maxArea(int[] heights) {
        int maxa=0;
        int l=0;
        int r=heights.length-1;

        while(l<r){
            int area=Math.min(heights[l],heights[r])*(r-l);
            maxa=Math.max(maxa,area);

            if(heights[r]<heights[l]) r--;
            else l++;
        }
        return maxa;
    }
}
