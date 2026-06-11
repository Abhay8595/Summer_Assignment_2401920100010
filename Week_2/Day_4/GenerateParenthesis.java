class Solution {
    public void generate(String s,List<String> ans,int ob,int cb){
        if(ob < 0 || cb < 0 || ob > cb) return;
        if(ob==0&&cb==0){
            ans.add(s);
        }
        else if(ob==cb){
            generate(s+"(",ans,ob-1,cb);
        }
        else if(ob==0){
            generate(s+")",ans,ob,cb-1);
        }
        else{
            generate(s+"(",ans,ob-1,cb);
            generate(s+")",ans,ob,cb-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        generate("",ans,n,n);
        return ans;
    }
}
