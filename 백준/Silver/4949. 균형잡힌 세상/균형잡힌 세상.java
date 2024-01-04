import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String answer = "yes";
            String line = sc.nextLine();
            if(line.equals(".")){
                break;
            }
            Stack<String> stack = new Stack<>();
            for(int i=0;i<line.length();i++){
                if(line.substring(i,i+1).equals("(") || line.substring(i,i+1).equals("[")){
                    stack.push(line.substring(i,i+1));
                }else if(line.substring(i,i+1).equals(")")){
                    if(stack.isEmpty()){
                        answer = "no";
                    }else if(!stack.peek().equals("(")){
                        answer = "no";
                    }else{
                        stack.pop();
                    }
                }else if(line.substring(i,i+1).equals("]")){
                    if(stack.isEmpty()){
                        answer = "no";
                    }else if(!stack.peek().equals("[")){
                        answer = "no";
                    }else{
                        stack.pop();
                    }
                }

            }
            if(!stack.isEmpty()){
                answer="no";
            }
            System.out.println(answer);
        }
    }
}
