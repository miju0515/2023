class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;
        for(int i=0;i<length-2;i++){
            for(int j=i+1;j<length-1;j++){
                for(int k=j+1;k<length;k++){
                    boolean check = true;
                    int sum = nums[i]+nums[j]+nums[k];
                    for(int l=2;l<sum-1;l++){
                        if(sum%l==0){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}