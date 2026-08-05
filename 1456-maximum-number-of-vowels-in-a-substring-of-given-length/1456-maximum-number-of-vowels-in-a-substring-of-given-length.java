class Solution {

    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u';
    }
    public int maxVowels(String s, int k) {
        int current = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                current++;
            }

        }

        int max = current;
        for(int i=1;i<=s.length()-k;i++){
            
            if(isVowel(s.charAt(i-1))){
                current--;
            }
            if(isVowel(s.charAt(i+k-1))){
                current++;
            }
            if(current>max){
                max = current;
        }
            
            
        }
        return max;
    }
}