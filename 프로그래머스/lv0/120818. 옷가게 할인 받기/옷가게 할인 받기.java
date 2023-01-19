class Solution {
    public int solution(int price) {
        int answer = 0;
        double price_=(double)price;
        if(price>=500000){
            price_*=0.8;
        }else if(price>=300000){
            price_*=0.9;
        }else if(price>=100000){
            price_*=0.95;
        }
        answer=(int)price_;
        return answer;
    }
}