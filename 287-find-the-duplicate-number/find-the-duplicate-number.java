class Solution {
    public int findDuplicate(int[] nums) {
      int i=0;
      while(i<nums.length){
        int c=nums[i]-1;
        if(nums[i]!=nums[c]){
            swap(nums,i,c);
        }else{
            i++;
        }
      }  
      for(int index=0;index<nums.length;index++){
        if(nums[index]!=index+1){
            return nums[index];
        }
      }
      return -1;
    }
    void swap(int [] arr ,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}