class Solution {
    public boolean digitCount(String num) {
        List<Integer> list = new ArrayList<>();
        for(char c: num.toCharArray()){
            list.add(c-'0');
        }
        int count=0;
        for(int i=0;i<num.length();i++){
            if(Collections.frequency(list,i)==list.get(i)){

            }
            else{
                count++;
            }

        }
        return count==0;
        
    }
}