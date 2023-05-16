package string;

import java.util.Scanner;

public class BJ10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] a = new char[5][15]; //다섯줄에 한줄에 15개의 단어

        for(int i = 0; i<5; i++){
            String str = sc.nextLine(); // 문자열 입력받기
            for(int j= 0; j<str.length(); j++){
                a[i][j]=str.charAt(j); // 입력받은 문자열 하나하나 순서대로 넣기
            }
        }

        for(int i=0; i<15; i++){ // 한줄에 최대 15개
            for(int j=0; j<5; j++){ // 총 5줄
                if(a[j][i]=='\0') continue; // null 문자 면 넘어가기(char는 null이 \0)
                System.out.print(a[j][i]); //세로읽기
            }
        }
    }
}
