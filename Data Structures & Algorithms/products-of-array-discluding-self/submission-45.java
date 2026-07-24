class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rs = new int[nums.length]; 
        int tmp=1;
        int tmpzero=1;
        int count=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==0){
                tmpzero=0;
                count++;
                continue;
            }
            tmp*=nums[i];
        }

        for (int i=0; i<nums.length; i++){
            if (count>=2) rs[i]=0;
            else if (nums[i]==0) rs[i]=tmp;
            else if (tmpzero==0 && nums[i]!=0) rs[i]=0;
            else rs[i]=tmp/nums[i];
        }
        return rs;
    }
}  
