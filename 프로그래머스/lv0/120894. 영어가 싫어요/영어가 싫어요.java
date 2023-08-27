class Solution {
    public long solution(String numbers) {
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0;i<10;i++){
            numbers=numbers.replaceAll(number[i],String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}