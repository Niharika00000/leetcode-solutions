class Solution {
    public int reverseDegree(String s) {
        int pro = 1;
        int revde = 0;
        for(int i=1;i<=s.length();i++){
           char ch =s.charAt(i-1);
            

pro = i*('z'-ch+1);
revde+=pro;
            }
        
        return revde;
    }
}