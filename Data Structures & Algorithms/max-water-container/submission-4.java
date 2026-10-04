class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;

        List<Integer> list = new ArrayList<>();
        while(i<j) {
            
            int min = Math.min(heights[i], heights[j]);
            int distance = j-i;
            int product = min * distance;
            list.add(product);
            if(heights[i] < heights[j]){
            i++;
            } else {
               j--;
            }
        }
        int maxUnits = Collections.max(list);
        return maxUnits;
    }
}
