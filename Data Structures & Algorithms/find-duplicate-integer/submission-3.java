class Solution {
    public int findDuplicate(int[] nums) {
        HashSet hs = new HashSet<>();

        for (int n : nums){
            if (hs.contains(n)) return n;
            hs.add(n);
        }

        return -1;
    }
}
