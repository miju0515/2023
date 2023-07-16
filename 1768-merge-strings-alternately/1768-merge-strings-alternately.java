class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1=word1.length();
        int length2=word2.length();
        String merged_word="";

        if(length1==length2){
            for(int i=0;i<length1;i++){
                merged_word+=word1.substring(i,i+1)+word2.substring(i,i+1);
            }
        }else if(length1>length2){
            for(int i=0;i<length2;i++){
                merged_word+=word1.substring(i,i+1)+word2.substring(i,i+1);
            }
            merged_word+=word1.substring(length2);
        }else{
            for(int i=0;i<length1;i++){
                merged_word+=word1.substring(i,i+1)+word2.substring(i,i+1);
            }
            merged_word+=word2.substring(length1);
        }
        return merged_word;
    }
}