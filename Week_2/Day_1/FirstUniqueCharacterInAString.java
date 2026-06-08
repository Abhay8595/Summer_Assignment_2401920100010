class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Boolean> map= new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,false);
            }
            else map.put(ch,true);
        }

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            boolean poss=map.get(ch);
            if(poss) return i;
        }

        return -1;
    }
}
