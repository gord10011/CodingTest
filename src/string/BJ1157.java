package string;

import java.util.Scanner;

public class BJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 대문자의 십진수 범위 65~90
        // 소문자의 십진수 범위 97~122
        // 인덱스 값을 얻기위해서는 각 대, 소문자의 첫번째를 빼면된다.
        // -65, -97

        //알파벳 개수를 저장할 배열
        int[] arr = new int[26];
        String str = sc.next();

        // 입력받은 문자열을 순회하면서 알파벳 개수를 계산
        for(int i = 0; i<str.length(); i++){
            // 현재 문자가 대문자라면 해당 알파벳의 개수를 1증가
            if('A'<= str.charAt(i) && str.charAt(i)<='Z'){  //A, Z 말고 65, 90도 가능.
                arr[str.charAt(i) - 'A']++;
            }
            // 소문자면 해당 알파벳의 개수를 1 증가
            else{
                arr[str.charAt(i) - 'a']++;
            }
        }

        int max = -1; // 가장 많이 나온 알파벳의 개수를 저장할 변수,
        char ch = '?'; // 가장 많이 나온 알파벳을 저장할 변수

        for(int i=0; i<26; i++){
            // 현재 알파벳의 개수가 가장 많은 개수보다 크면
            if(arr[i] > max){
                // 가장 많이 출현한 알파벳의 개수를 현재 알파벳의 개수로 갱신, 해당 알파벳 저장.
                max = arr[i];
                ch = (char) (i+65); // 대문자로 출력해야하니 +65
            }
            // 현재 알파벳의 개수가 가장 많은 개수와 같다면
            else if(arr[i] == max){
                // 가장많이 출현한 알파벳을 '?'로 갱신
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
