import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int min=Math.min(A,B);
        int gcd = 1;
        for(int i=1;i<=min;i++){
            if(A%i==0 && B%i==0){
                gcd=i;
            }
        }
        int lcm = (A*B)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}