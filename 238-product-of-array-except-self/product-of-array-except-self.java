class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] ans = new int [n];
        int productL=1;
        int productR=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=productR;
            productR=productR*nums[i];
            

        }
        for(int i=0;i<n;i++){
            ans[i]=ans[i]*productL;
            productL=productL*nums[i];
        }
        return ans;
    }
}