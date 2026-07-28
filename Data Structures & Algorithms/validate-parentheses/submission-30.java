class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '[' || c == '{' || c == '('){
                st.push(c);
            }
            else 
            switch (c){
                case ']':
                    if (st.isEmpty() || st.pop() != '[') return false;
                    break;
                case '}':
                    if (st.isEmpty() || st.pop() != '{') return false;
                    break;
                case ')':
                    if (st.isEmpty() || st.pop() != '(') return false;
                    break;
            default: 
                return false;
            }
        }
        if (!st.isEmpty()) return false;

        return true;
    }
}
