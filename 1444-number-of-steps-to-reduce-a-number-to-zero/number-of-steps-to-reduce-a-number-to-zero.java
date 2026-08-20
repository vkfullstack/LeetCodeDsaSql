class Solution {
    public int numberOfSteps(int num) {
       return helper(num,0);
}
private int helper(int num ,int c){
    if(num==0){
        return c;
    }
    if(num%2==0){
        return helper(num/2,c+1);
    }else{
        return helper(num-1,c+1);
    }
}

}