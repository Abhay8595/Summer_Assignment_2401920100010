class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n1=s1.length();
        int n2=s2.length();

        for(int i=0;i<n1;i++){
            char ch=s1.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            else map.put(ch,1);
        }

        int dischar=map.size();
        HashMap<Character,Integer> map2=new HashMap<>();

        int start=0; //start of checking subsctring contains
        int fullfill=0;
        for(int i=0;i<n2;i++){
            char ch=s2.charAt(i);
            if(!map.containsKey(ch)){ //start of new window(not part of req string) after it
                start=i+1;
                fullfill=0;
                map2=new HashMap<>();
            }
            else{
                if(map2.containsKey(ch)){
                    int freq=map2.get(ch);
                    map2.put(ch,freq+1);
                }
                else map2.put(ch,1);

                int freq1=map.get(ch);
                int freq2=map2.get(ch);
                if(freq1==freq2) fullfill++;
                else if(freq2>freq1){
                    while(freq2>freq1){
                       char ch2=s2.charAt(start);
                       int freq3=map2.get(ch2);
                       if(ch2==ch){
                          freq2--;
                       }
                       if(freq3 == map.get(ch2)) fullfill--;
                       if(freq3==1) {
                         map2.remove(ch2);
                       }
                       else{
                         map2.put(ch2,freq3-1);
                       }
                       start++;
                    }
                }

                if(fullfill==dischar) return true;
                
            }
        }

        return false;

    }
}
