class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        boolean[][] map = new boolean[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j]=false;
            }
            answer[i]="";
        }
        
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(arr1[i]%2==0 && arr2[i]%2==0){
                    map[i][j]=true;
                }
                arr1[i]/=2;
                arr2[i]/=2;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]){
                    answer[i]+=" ";
                }else{
                    answer[i]+="#";
                }
            }
        }
        return answer;
    }
}
