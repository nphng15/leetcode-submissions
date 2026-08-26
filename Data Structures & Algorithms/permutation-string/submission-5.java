class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
if (n1 > n2) return false;
        for (int i=0; i<n1; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            h1.put(c1, h1.getOrDefault(c1, 0) + 1);  
            h2.put(c2, h2.getOrDefault(c2, 0) + 1);    
  
        }
        if (h1.equals(h2)) return true;

        int l=0;
        int r=n1;

        while(r<n2){

            char c2 = s2.charAt(l);
            int count = h2.get(c2);
            if (count==1){
                h2.remove(c2);
            }
            else {
                h2.put(c2, count-1);
            }
            l++;
            
            c2 = s2.charAt(r);
            h2.put(c2, h2.getOrDefault(c2, 0) + 1);
            r++;       
                 if (h1.equals(h2)) return true;

        }

        return false;
    }
}
