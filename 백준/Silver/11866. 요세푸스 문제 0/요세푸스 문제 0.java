import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1;i<=N;i++){
            queue.add(i);
        }
        int count = 0;
        while(!queue.isEmpty()){
            count++;
            if(count==M){
                list.add(queue.peek());
                queue.poll();
                count=0;
            }else{
                queue.add(queue.peek());
                queue.poll();
            }
        }

        System.out.print("<");
        for(int i=0;i<N;i++){
            if(i!=N-1){
                System.out.print(list.get(i)+", ");
            }else{
                System.out.print(list.get(i)+">");
            }
        }


    }
}
