class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int n=s.length();
        int max=0;
        int start=0; //starting of window
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int prevOccurence=map.get(ch);
                //if the character repeated outside curr window we jut update new pos ele start of window
                if(prevOccurence>=start) start=prevOccurence+1;
                map.put(ch,i);
            }
            else{
                map.put(ch,i);
            }

            max=Math.max(max,i-start+1);
        }

        return max;
    }
}
