class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String find = Integer.toString(k);
        for(int x=i;x<=j;x++){
            String number = Integer.toString(x);
            if(number.contains(find)){
                for(int l=0;l<number.length();l++){
                    if(number.substring(l,l+1).equals(find)){
                        answer++;
                    }
}
            }
            
}
        return answer;
    }
}