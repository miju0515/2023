class Solution {
    public String solution(int age) {
        String answer = "";
        String[] age_alpha={"a","b","c","d","e","f","g","h","i","j"
};
        int[] age_list=new int[4];
        
        int age_copy=age;
        int i=0;
        while(age>0){
            age_list[i]=age%10;
            age/=10;
            i++;
        }
        
        if(age_copy<10){
            answer=age_alpha[age_list[0]];
        }else if(age_copy<100){
            answer=age_alpha[age_list[1]]+age_alpha[age_list[0]];
        }else if(age_copy<1000){
             answer=age_alpha[age_list[2]]+age_alpha[age_list[1]]+age_alpha[age_list[0]];
        }else{
            answer="baaa";
        }
        
        return answer;
    }
}