import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int number = sc.nextInt();
        System.out.println(word.substring(number-1,number));

    }
}