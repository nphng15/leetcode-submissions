class Solution {
    public boolean isPalindrome(String s) {
        String fs = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = fs.length() - 1;

        while (i<j){
            System.out.println(fs.charAt(i) + " " +fs.charAt(j));
            if (fs.charAt(i) != fs.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }
}
