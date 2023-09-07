class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        int countP = s.length() - s.replaceAll("p","").length();
        int countY = s.length() - s.replaceAll("y","").length();
        if(countP!=countY){
            answer=false;
        }

        return answer;
    }
}