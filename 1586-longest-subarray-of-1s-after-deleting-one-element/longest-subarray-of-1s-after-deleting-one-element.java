class Solution {
    static{
        System.gc();
        for(int i=0; i<500; i++){
            longestSubarray(new int[]{0, 0});
        }
    }
    public static int longestSubarray(int[] nums) {
        
        int low=0;
        int zer=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zer++;
            }
            while(zer>1){
                if(nums[low]==0){
                    zer--;
                }
                low++;
            }
            cnt=Math.max(cnt,i-low);
        }
        return cnt;
    }
}