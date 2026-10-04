class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i + 1]){
                list.add(nums[i]);
            }
        }
       list.add(nums[nums.length - 1]);
        int min = 1;
        int max = 1;

        for(int i =0; i<list.size()-1; i++){
            if(list.get(i) + 1 == list.get(i+1)){
                min++;
                if(max < min){
                    max = min;
                }
            } else {
                min = 1;
            }
        }
        return max;
    }
}
