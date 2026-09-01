class Solution {
    public int[] sumZero(int n) {
        int [] arr=new int[n];
        int i=0;
        int j=n-1;
        int element=1;
        while(i<j){
            arr[i]=element;
            arr[j]=-element;
            i++;
            j--;
            element ++;
        }
        return arr;
    }
}