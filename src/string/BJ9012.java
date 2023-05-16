package string;

import java.util.Scanner;
import java.util.Stack;

public class BJ9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<input; i++){
            String str = sc.nextLine();
            if(isValid(str)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
