class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSpeak = {"aya","ye","woo","ma"};
        for(String word : canSpeak){
            // for(String babble : babbling){
            //     System.out.println(babble.contains(word));
            //     babble = babble.replaceAll(word,"/");
            // }
            for(int i=0;i<babbling.length;i++){
                babbling[i]=babbling[i].replace(word+word," ");
            }
            for(int i=0;i<babbling.length;i++){
                babbling[i]=babbling[i].replace(word,"/");
            }
        }
        for(int i=0;i<babbling.length;i++){
            babbling[i]=babbling[i].replace("/","");
            if(babbling[i].length()==0){
                answer++;
            }
        }
        // for(String babble : babbling){
        //     System.out.println(babble);
        //     babble.replaceAll("/","");
        //     if(babble.length()==0){
        //         answer++;
        //     }
        // }
        return answer;
    }
}