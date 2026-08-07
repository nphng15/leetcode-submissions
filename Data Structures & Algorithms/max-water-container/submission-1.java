class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int rs = 0;

        while (i!=j){
            int height = heights[i] < heights[j] ? heights[i] : heights[j];
            int tmp = height * (j-i);

            rs = Math.max(tmp,rs);

            if (heights[i]<heights[j]) i++;
            else j--;
        }        

        return rs;
    }
}
