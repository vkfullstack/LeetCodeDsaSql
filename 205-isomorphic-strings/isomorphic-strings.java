class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> charmapping= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement=t.charAt(i);
            if(!charmapping.containsKey(original)){
                if(!charmapping.containsValue(replacement)){
                    charmapping.put(original,replacement);
                }else{
                    return false;
                }
            }else{
                char mappedchar = charmapping.get(original);
                if(mappedchar !=replacement)
                return false;
            }
        }
            return true;
    }
 
}