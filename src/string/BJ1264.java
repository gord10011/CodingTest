package string;

import java.util.Scanner;

public class BJ1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.nextLine();
            // 모음 카운트
            int count = 0;
            // #입력시  break
            if(str.equals("#")){
                break;
            }
            // 입력값을 소문자로 검사
            str = str.toLowerCase();
            // 입력받은 값순회해서 모음만 카운트
            for(int i =0; i<str.length(); i++){
                switch (str.charAt(i)){
                    case 'a' :
                    case 'e' :
                    case 'i' :
                    case 'o' :
                    case 'u' :
                        count++;
                    default:
                        break;
                }
            }
            System.out.println(count);
        }

    }
}
