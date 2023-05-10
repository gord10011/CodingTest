package String;

import java.util.Scanner;

public class BJ8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[sc.nextInt()]; // 테스트 케이스의 개수 만큼의 배열 생성

        for(int i=0; i<arr.length; i++){ // 테스트 케이스 입력
            arr[i] = sc.next();
        }

        for(int i = 0; i<arr.length;i++){ // 테스트 케이스 하나씩 돌기
            int cnt = 0; // 연속된 카운트
            int sum = 0; // O의 합
            for(int j = 0; j<arr[i].length(); j++){ // O개수 확인
                if(arr[i].charAt(j) == 'O'){
                    cnt++; // 첫O 일때 1 , 다음부터는 추가
                }
                else{
                    cnt = 0; // O가 아닐경우 다시 0으로 초기화
                }
                sum += cnt;
            }
            System.out.println(sum);
        }

    }
}
