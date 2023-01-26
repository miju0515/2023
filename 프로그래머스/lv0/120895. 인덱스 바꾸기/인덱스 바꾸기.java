class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        if(num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        
        answer=my_string.substring(0,num1)+my_string.substring(num2,num2+1)+my_string.substring(num1+1,num2)+my_string.substring(num1,num1+1)+my_string.substring(num2+1);
        
        return answer;
    }
}