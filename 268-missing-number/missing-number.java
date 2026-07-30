class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int c=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[c]){
                int temp=arr[i];
                arr[i]=arr[c];
                arr[c]=temp;
                }
                else
                {
                    i++;
                }
        }
       
        for(int index=0;index<arr.length;index++){
                    if(arr[index]!=index){
                     return index;
                 }
                 }
                 return arr.length;

    }
}
    
    
