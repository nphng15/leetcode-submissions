class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int rs = 0;

        for (int i : nums){
            hs.add(i);
        }

        for (int i=0; i< nums.length; i++){
            int count=1;
            if (!hs.contains(nums[i]-1)){
                int tmp = nums[i];
                while (hs.contains(tmp+1)){
                    count++;
                    tmp++;
                }
            }
            rs = Math.max(rs,count);
        }

        return rs;
    }
}
