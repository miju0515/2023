class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        int length = before.length();
        int[] afterCheck = new int[length];
        int count = 0;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(afterCheck[j]==0 &&beforeArr[i].equals(afterArr[j])){
                    afterCheck[j]=1;
                    count++;
                    break;
                }
            }
        }
        if(count==length){
            answer = 1;
        }
        return answer;
    }
}