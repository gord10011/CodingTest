package string;

import java.util.Scanner;

public class BJ1316 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0; // 중복 단어 카운트
        int num = sc.nextInt(); // 단어의 개수 입력
        for(int i=0; i<num; i++){ // 중복 단어 개수 체크
            if(duplication()){ // 중복 단어면 카운트 +1
                count++;
            }
        }
        System.out.println(count); // 중복 단어 개수 출력

    }
    static boolean duplication(){ //중복 확인 메소드
        boolean[] check = new boolean[26]; // 26개의 알파벳 배열 기본 false로 저장
        int before = 0; // 이전 문자 비교하기 위한 변수
        String str = sc.next(); // 단어 입력

        for(int i=0; i<str.length(); i++){ // 문장 순회하면서 중복연속문자가 있는지 확인
            int now = str.charAt(i); // i번째 문자 저장 now에 아스키로 저장
            //이전 문자와 i 번째 문자가 같지 않다면?
            if(before != now){
                // 해당 문자가 처음 나오는 경우 (false 인 경우) 만약 now a이면 a-a로 [0]번째 단어 확인
                if(check[now-'a'] == false){
                    check[now-'a'] = true; // true로 변경
                    before = now; // 다음 턴을 위해 before도 변경
                }
                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                else{
                    return false;//함수 종료 나온적이 있으면 false로 노 카운트
                }
            }
        }
        return true;
    }
}
