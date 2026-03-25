class Solution {
    public String decodeMessage(String key, String message) {

        Map<Character,Character> map = new LinkedHashMap<>();
        Character alp='a';
        for(int i=0;i<key.length();i++){
            if(!map.containsKey(key.charAt(i))&&key.charAt(i)!=' '){
                map.put(key.charAt(i),alp);
                alp++;
            }
        }
        StringBuilder sb = new StringBuilder();
        char c;
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                sb.append(" ");
            }
            else{
                c=map.get(message.charAt(i));
                sb.append(String.valueOf(c));
            }
        }
        return sb.toString();




        // List<String> alplist = new ArrayList<>();
        
        // for(char c = 'a';c<='z';c++){
        //     alplist.add(String.valueOf(c));
        // }
        // alplist.add(" ");
        // List<String> keylist = new ArrayList<>();
        // for(char c: key.toCharArray()){
        //     if(!keylist.contains(c)){
        //         keylist.add(String.valueOf(c));
        //     }
            
        // }
        // List<Character> res = new ArrayList<>();
        // for(char c: message.toCharArray()){
            
        // }



    }
}