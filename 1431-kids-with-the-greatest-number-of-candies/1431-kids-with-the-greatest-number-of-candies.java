import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] findMax=candies.clone();
        int kids=candies.length;
        List<Boolean> answer=new ArrayList<Boolean>();
        Arrays.sort(findMax);
        int max=findMax[kids-1];
        for(int i=0;i<kids;i++){
            if((candies[i]+extraCandies)>=max){
                answer.add(true);
            }else{
                answer.add(false);
            }
        }
        
        return answer;
    }
}