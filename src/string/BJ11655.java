package string;

import java.util.Scanner;

public class BJ11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            // 알파벳인지 아닌지 확인
            if(Character.isAlphabetic(ch)){
                int intCh = ch + 13;
                if(Character.isUpperCase(ch) && intCh > 'Z'){
                    intCh -= 26;
                }
                if(Character.isLowerCase(ch) && intCh > 'z'){
                    intCh -= 26;
                }
                sb.append((char) intCh);
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
