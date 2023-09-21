import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=0;i<N;i++) {
            int number = sc.nextInt();
            if(checkNumber(number)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean checkNumber(int number){
        if(number == 1){
            return false;
        }
        for(int j=2;j<number;j++){
            if(number%j==0){
                return false;
            }
        }
        return true;
    }
}