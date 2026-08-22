class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();

        int l=0;
        int r=0;
        int max=0;

        while (r < s.length()){
            while (hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            r++;

            max = Math.max(max,r-l);
        }

        return max;
    }
}
