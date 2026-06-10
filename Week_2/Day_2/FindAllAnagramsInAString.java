class Solution {
    public boolean equal(int []freq1,int freq2[]){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans= new ArrayList<Integer>();
        int n1=s.length();
        int n2=p.length();

        if(n2>n1) return ans;

        int freq1[]=new int[26];
        int freq2[]=new int[26];

        for(int i=0;i<n2;i++){
            char ch1=s.charAt(i);
            char ch2=p.charAt(i);
            freq1[ch1-'a']++;
            freq2[ch2-'a']++;
        }

        if(equal(freq1,freq2)) ans.add(0);

        for(int i=n2;i<n1;i++){
            char ch=s.charAt(i-n2);
            freq1[ch-'a']--;
            ch=s.charAt(i);
            freq1[ch-'a']++;
            if(equal(freq1,freq2)) ans.add(i-n2+1);
        }

        return ans;
        
    }
}
