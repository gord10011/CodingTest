package string;

import java.util.*;

public class BJ1755 {

    public static void main(String[] args) {
        String[] numWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        PriorityQueue<Compare> pq = new PriorityQueue<>();

        for(int i=m; i<=n; i++) {
            String str = "";
            if (i < 10) {
                str = numWord[i];
            } else {
                str += numWord[i / 10];
                str += " ";
                str += numWord[i % 10];
            }
            pq.add(new Compare(str, i));
        }

        int cnt = 0;
        while (!pq.isEmpty()){
            Compare c = pq.poll();
            cnt++;
            sb.append(c.num).append(" ");
            if(cnt%10==0){
                sb.append("\n");
            }
        }
        System.out.println(sb);
        }

}
class Compare implements Comparable<Compare>{
    String str;
    int num;
    public Compare(String str, int num){
        super();
        this.str = str;
        this.num = num;
    }
    @Override
    public int compareTo(Compare o){
        return str.compareTo(o.str);
    }
}
