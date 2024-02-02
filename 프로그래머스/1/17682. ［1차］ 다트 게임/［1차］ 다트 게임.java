class Solution {
    public int solution(String dartResult) {
        int answer = 0;
         dartResult = dartResult.replaceAll("10",":");
        int[] result = new int[3];
        
        int num = dartResult.charAt(0)-48;
        int count = 0;
        
        for(int i=1;i<dartResult.length();i++){
            char ch = dartResult.charAt(i);
            if(ch>=48 && ch<=58){
                result[count] = num;
                count++;
                
                num = ch-48;
            }else if(ch == 'D'){
                num = num*num;
            }else if(ch == 'T'){
                num = num*num*num;
            }else if(ch == '*'){
                if(count!=0){
                    result[count-1] = result[count-1] * 2;
                }
                num *= 2;
            }else if(ch=='#'){
                num *= (-1);
            }
        }
        result[2]=num;
        for(int i=0;i<3;i++){
            answer+=result[i];
        }
        
        return answer;
    }
}