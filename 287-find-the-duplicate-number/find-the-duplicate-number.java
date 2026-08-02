class Solution {
    public int findDuplicate(int[] arr) {
         int i=0;
         while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                     int temp=arr[i];
                     arr[i]=arr[correct];
                     arr[correct]=temp;     
                  }else{
                   return arr[i];
                   }
               }else
               {
                 i++;
               }
       
    }
    return -1;
}
}