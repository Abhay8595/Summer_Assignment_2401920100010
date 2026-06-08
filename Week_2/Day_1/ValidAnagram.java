class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2) return false;

        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0;i<n1;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<n2;i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                if(freq==1) map.remove(ch);
                else map.put(ch,freq-1);
            }
            else{
                return false;
            }
        }

        return true;
    }
}
