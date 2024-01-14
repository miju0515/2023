import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String w1, String w2){
                if(w1.charAt(n)==w2.charAt(n)){
                    return w1.compareTo(w2);
                }
                return w1.charAt(n) - w2.charAt(n);
            }
        });
        return strings;
    }
}