class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int length = spell.length;       
        
        for(int i=0;i<dic.length;i++){
            int count = 0;
            if(dic[i].length()==length){
                for(int j=0;j<length;j++){
                    if(dic[i].contains(spell[j])){
                        count++;
                    }
                }
                if(count==length){
                    answer=1;
                }
            } 
        }
        return answer;
    }
}