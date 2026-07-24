class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for (String i : strs){
            encoded_string+= i;
            encoded_string+= ";";
        }
        // System.out.println(encoded_string);
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> lstr = new ArrayList<>();
        if (str.isEmpty()) return Collections.emptyList();
        if (str == null) return lstr;
        if (str.endsWith(";")) {
            str = str.substring(0, str.length() - 1);
        }
        String[] strs = str.split(";",-1);
        if (!str.isEmpty() && str.equals("")) {            
            lstr.add("");
            return lstr;
        }
        for (String strr : strs){
            lstr.add(strr);
        }
        // System.out.println(lstr);
        return lstr;
    }
}
