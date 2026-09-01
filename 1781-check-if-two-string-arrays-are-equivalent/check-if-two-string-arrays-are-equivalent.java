class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s=" ";
        String s1=" ";
        for( String i : word1){
            s+=i;
        }
        for(String j : word2){
            s1+=j;
        }
        return s.equals(s1);
    }
}