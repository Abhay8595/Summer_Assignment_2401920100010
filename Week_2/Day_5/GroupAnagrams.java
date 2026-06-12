class Solution {
    public String sort(String s){
        StringBuilder sb = new StringBuilder();
        int freq[]=new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                char ch=(char)(i+'a');
                while(freq[i]!=0){
                    sb.append(ch);
                    freq[i]--;
                }
            }
        }

        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<List<String>>();
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String curr=strs[i];
            String sorted=sort(curr);

            if(map.containsKey(sorted)){
                ArrayList<String> temp=map.get(sorted);
                temp.add(curr);
                map.put(sorted,temp);
            }
            else{
                ArrayList<String> temp= new ArrayList<>();
                temp.add(curr);
                map.put(sorted,temp);
            }
        }

        for(String s:map.keySet()){
            ans.add(map.get(s));
        }

        return ans;
    }
}
