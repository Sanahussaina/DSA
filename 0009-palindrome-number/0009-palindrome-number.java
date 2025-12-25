class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||x%10==0&&x!=0){
            return false;
        }
        int hn=0;
        while(x>hn){
            hn=hn*10+x%10;
            x=x/10;
        }
        return x==hn||x==hn/10;




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
    }
}