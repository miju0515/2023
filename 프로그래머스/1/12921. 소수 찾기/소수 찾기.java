import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        if(n==2){
            return 1;
        }else{
            for(int i=3;i<=n;i++){
                boolean check = false;
                for(int j=0;j<list.size();j++){
                    if(list.get(j)>Math.sqrt(i)){
                        break;
                    }
                    if(i%list.get(j)==0){
                        check=true;
                        break;
                    }
                }
                if(!check){
                    list.add(i);
                }
        }
        return list.size();
        }
        
    }
}