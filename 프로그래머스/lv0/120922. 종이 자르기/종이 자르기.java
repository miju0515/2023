class Solution {
    public int solution(int M, int N) {
        int longer = Math.max(M,N);
        int shorter = Math.min(M,N);
        int answer = (longer - 1) + (shorter - 1) * longer;
        return answer;
    }
}