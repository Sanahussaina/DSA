class Solution {
    public boolean isPalindrome(String s) {
         
        s = s.trim().toLowerCase();
        
        StringBuilder sb = new StringBuilder("");
        for(char i : s.toCharArray()){
             if(i>='a'&&i<='z'|| i>='0'&&i<='9'){
                sb.append(String.valueOf(i));
             }
        }
        s = sb.toString();
        String rev = sb.reverse().toString();
        
        return s.equals(rev);
        
    }
}