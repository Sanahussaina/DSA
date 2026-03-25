class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxlen=0;
        int flag=0;
        //int j=0;
        int len=0;
        for(int j=0;j<s.length();j++){

        
        for(int i=j+1;i<s.length();i++){
            if(s.charAt(j)==s.charAt(i)){
                flag=1;
                len=i-j-1;
                if(len>maxlen){
                    maxlen=len;
                }
                len=0;
            }
        }
        }
        return flag==0?-1:maxlen;
        
    }
}