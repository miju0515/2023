class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] seperate = polynomial.split(" ");
        int count = 0;
        int num = 0;
        for(int i=0;i<seperate.length;i++){
            if(seperate[i].equals(" ") || seperate[i].equals("+")){
                continue;
            }else if(seperate[i].contains("x")){
                if(seperate[i].length()==1){
                    count++;
                }else{
                    count+= Integer.parseInt(seperate[i].substring(0,seperate[i].length()-1));
                }
            }else{
                num+=Integer.parseInt(seperate[i]);
            }
        }
   
        if(count == 0 && num == 0){
            answer = "";
        }else if(count == 0 && num != 0){
            answer =String.valueOf(num);
        }else if(count == 1 && num == 0){
            answer = "x";
        }else if(count == 1 && num != 0){
            answer = "x + "+String.valueOf(num);
        }else if(count > 1 && num == 0){
            answer = String.valueOf(count)+"x";
        }else{
            answer = String.valueOf(count)+"x + "+String.valueOf(num);
        }
        
        return answer;
    }
}