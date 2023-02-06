import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long sum=0;
        for(int i=0;i<3;i++){
            sum+=s.nextLong();
        }
        System.out.println(sum);
    }
}