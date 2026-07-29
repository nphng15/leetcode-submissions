class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (int i=0; i<tokens.length; i++){
            int tmp=0;
            switch (tokens[i]){
                case "+":
                    tmp = s.pop() + s.pop();
                    s.push(tmp);
                    break;
                case "-":
                    tmp = -s.pop() + s.pop();
                    s.push(tmp);
                    break;
                case "*":
                    tmp = s.pop() * s.pop();
                    s.push(tmp);
                    break;
                case "/":
                    int a = s.peek();
                    s.pop();
                    int b = s.peek();
                    s.pop();
                    tmp = b/a;
                    s.push(tmp);
                    break;
                default:
                    s.push(Integer.parseInt(tokens[i]));
            }
        }

        return s.peek();
    }
}
