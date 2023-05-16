package string;

import java.util.Scanner;

public class BJ10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        // 문자열로 받을때 입력한 값이 int 범위를 넘을 수 있으므로 long 사용
        long integer1 = Long.parseLong(str[0]+str[1]);
        long integer2 = Long.parseLong(str[2]+str[3]);
        long result = integer1+integer2;
        System.out.println(result);
    }

}
