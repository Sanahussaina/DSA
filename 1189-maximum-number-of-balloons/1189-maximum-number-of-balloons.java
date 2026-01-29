class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text==null||text.length()<7)
            return 0;
        text = text.toUpperCase();
        int cb=0,ca=0,cl=0,co=0,cn=0;
        int c=0;
        
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='B')
                cb++;
                if(text.charAt(i)=='A')
                ca++;
                if(text.charAt(i)=='L')
                cl++;
                if(text.charAt(i)=='O')
                co++;
                if(text.charAt(i)=='N')
                cn++;
                            
        }
        while(true){
            if(cb>=1&&ca>=1&&cl>=2&&co>=2&&cn>=1){
            cb-=1;
            ca-=1;
            cl-=2;
            co-=2;
            cn-=1;
            c++;
            }
            else{
                break;
            }
        }
        
        return c;
        
    }
}