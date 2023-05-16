package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradeSum = 0; // 학점의 합
        double sum = 0; // 학점과 등급의 곱의 총합 저장
        int line = 20; // 입력 줄

        while(line-- > 0){ // 입력 줄 돌기
            StringTokenizer st = new StringTokenizer(sc.nextLine()); // 토큰 쪼개기
            st.nextToken(); // 첫번째 과목명 지나가기
            double grade = Double.parseDouble(st.nextToken()); //학점 뽑아오기
            Double rating = getRating(st.nextToken()); // 등급 점수 가져오기
            if(rating==null)continue; // 등급에 해당하지 않는거 가져오면 건너뛰기
            sum += grade * rating; // 학점과 등급의 곱 더하기
            gradeSum += grade; // 학점의 합
        }
        System.out.printf("%.6f\n", sum/gradeSum); // 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
    }
    private static Double getRating(String s){
        switch (s){
            case "A+" : return 4.5;
            case "A0" : return 4.0;
            case "B+" : return 3.5;
            case "B0" : return 3.0;
            case "C+" : return 2.5;
            case "C0" : return 2.0;
            case "D+" : return 1.5;
            case "D0" : return 1.0;
            case "F" : return 0.0;
        }
        return null;
    }
}
