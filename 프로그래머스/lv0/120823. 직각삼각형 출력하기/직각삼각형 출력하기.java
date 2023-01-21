import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star="";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                star+="*";
            }
            System.out.println(star);
            star="";
        }
       

        
    }
}