class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] mose = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] arr=letter.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<26;j++){
                if(arr[i].equals(mose[j])){
                    answer+=String.valueOf((char)(j+97));
                }
            }
        }
        return answer;
    }
}