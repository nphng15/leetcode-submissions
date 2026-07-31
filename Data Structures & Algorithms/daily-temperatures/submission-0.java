class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int rs[] = new int[temperatures.length]; 
        Stack<Integer> st = new Stack<>();

        for (int i=0; i<temperatures.length; i++){
            if (st.isEmpty()){
                st.push(i);
                continue;
            }
            int top = st.peek();

            while (temperatures[top] < temperatures[i] && !st.isEmpty()){
                System.out.println(i);
                int tmp = st.pop();
                rs[tmp] = i - tmp;

                if (!st.isEmpty()) top = st.peek(); 
            }

            st.push(i);
        }
        return rs;
    }
}
