class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for (int i : piles){
            if (i>max){
                max = i;
            }
        }

        int rs=-1;
        int left = 1;
        int right = max;

        while (left<=right){
            int mid = (left+right)/2;
            System.out.println("MID:" + mid);

            int sum=0;
            for (int i : piles){
                sum+= (i + mid - 1) / mid;
            }
            System.out.println("SUM:" + sum);

            if (sum<=h){ 
                rs = mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }    
        }

        return rs;
    }
}
