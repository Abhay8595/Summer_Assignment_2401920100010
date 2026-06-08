class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];

        int n1=ransomNote.length();
        int n2=magazine.length();

        for(int i=0;i<n2;i++){
            char ch=magazine.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<n1;i++){
            char ch=ransomNote.charAt(i);
            if(freq[ch-'a']--==0) return false;
        }
        return true;
    }
}
