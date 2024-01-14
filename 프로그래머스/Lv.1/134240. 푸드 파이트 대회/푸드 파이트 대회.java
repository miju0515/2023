class Solution {
    public String solution(int[] food) {
        String answer = "";
        String first="";
        String last="";
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                first+=String.valueOf(i);
                last=String.valueOf(i)+last;
            }
        }
        return first+"0"+last;
    }
}