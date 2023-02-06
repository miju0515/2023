import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        long a =s.nextInt();
        long b =s.nextInt();
        long minus=Math.abs(a-b);
        System.out.println(minus);
    }

}