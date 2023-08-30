class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            String number = String.valueOf(array[i]);
            answer+=number.length() - number.replaceAll("7","").length();
        }
        return answer;
    }
}