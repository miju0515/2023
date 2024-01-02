import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        int M = sc.nextInt();
        for(int i=0;i<N;i++){
            array[i]= sc.nextInt();
        }
        System.out.println(sum(array,N,M));
    }

    public static int sum(int[] array, int N, int M){
        int max= 0;
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int k=j+1;k<N;k++){
                    int sum = array[i]+array[j]+array[k];

                    if(sum==M){
                        max = sum;
                        return max;
                    }
                    if(sum<M){
                        max=Math.max(max,sum);
                    }
                }
            }
        }
        return max;
    }
}
