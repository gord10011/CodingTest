package string;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1259 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean of = true;
//        while(of){
//            int input = sc.nextInt();
//            int revInput = reverse(input);
//            if(input == revInput) System.out.println("yes");
//            else if (input == 0) of=false;
//            else System.out.println("no");
//        }
//    }
//    private static int reverse(int input){
//        String str = "";
//        while (input>0){
//            str += input%10;
//            input /= 10;
//        }
//        return Integer.parseInt(str);
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        while (a){
            String input = sc.nextLine();
            String reinput = new StringBuilder(input).reverse().toString();
            if(input.equals("0")) a = false;
            else if(input.equals(reinput)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }

    }


}
