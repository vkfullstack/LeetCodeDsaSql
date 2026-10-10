class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double maxavg=0;
        double sum=0;
        double avg;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];

        }
        avg=sum/k;
        maxavg=avg;

    for(int i=1;i<=arr.length-k;i++){
        sum=sum-arr[i-1]+arr[i+k-1];
        avg=sum/k;
        if(maxavg<avg){
            maxavg=avg;
        }
    }
return (double) maxavg;
    }
}