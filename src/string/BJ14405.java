package string;

import java.util.Scanner;

public class BJ14405 {
    public static void main(String[] args) {
        // 문자열 순회하면서 패턴을 검사 패턴은 "pi", "ka", "chu"
        // 패턴검사 p->i, k->a, c->h->u
        // 패턴일 올바르면 다음 글자를 검사, 올바르지 않으면 NO를 출력
        // 모든 패턴이 올바르면 YES
        // 대소문자 구분 x, 대소문자 통일 후 비교
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = {"pi","ka","chu"};
        for(int i=0; i<3; i++){
            str = str.replaceAll(strArr[i], "0");
            // pi, ka, chu 가있는 부분 0으로 변경, 다른 문자로 바꾸는 이유는 pchui와 같을때 chu를 지우면 pi가 되어 YES가 될 수 있음.
        }
        str = str.replace("0", "");
        if(str.length() == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
