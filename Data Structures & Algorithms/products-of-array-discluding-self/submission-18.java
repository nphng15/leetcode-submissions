class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rs = new int[nums.length]; 

        for (int i=0; i<nums.length; i++){
            int tmp=1;
            for (int j=0; j<nums.length; j++){
                if (j==i) continue;
                if (nums[j]==0){
                    tmp=0;
                    continue;
                }
                tmp*=nums[j];
            }
            rs[i]=tmp;
        }

        return rs;
    }
}  
