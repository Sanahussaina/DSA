class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0||x%10==0&&x!=0){
        //     return false;
        // }
        // int hn=0;
        // while(x>hn){
        //     hn=hn*10+x%10;
        //     x=x/10;
        // }
        // return x==hn||x==hn/10;




        /*int r=0;
        int o=x;
        int i;
        while(x>0){
            i=x%10;
            r=r*10+i;
            x=x/10;
        }
        if(o==r){
            return true;
        }
        return false;*/

        String s = String.valueOf(x);
        // int i=0;
        // int j=s.length()-1;
        // while(i<j){
        //     if(s.charAt(i++)!=s.charAt(j--)){
        //         return false;
        //     }
        // }
        // return true;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s2 = sb.toString();
        if(s.equals(s2)){
            return true;
        }
        return false;
    }
}