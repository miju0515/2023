import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 우유가게 수
        sc.nextLine();
        String[] milkStore = sc.nextLine().split(" ");
        int count = 0;
        int milk = 0;
        for(int i=0;i<N;i++){
            if(count==0){
                if(milkStore[i].equals("0")){
                    count++;
                    milk=0;
                }
            }else if(milk==0){
                if(milkStore[i].equals("1")){
                   count++;
                   milk=1;
                }
            }else if(milk==1){
                if(milkStore[i].equals("2")){
                    count++;
                    milk=2;
                }
            }else if(milk==2){
                if(milkStore[i].equals("0")){
                    count++;
                    milk=0;
                }
            }

        }
        System.out.println(count);
    }
}
