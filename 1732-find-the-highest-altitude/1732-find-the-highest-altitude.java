class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] alti=new int[n+1];
        alti[0]=0;
        int max=0;
        for(int i=1;i<n+1;i++){
            alti[i]=alti[i-1]+gain[i-1];
            if(alti[i]>max){
                max=alti[i];
            }
}
        return max;
    }
}