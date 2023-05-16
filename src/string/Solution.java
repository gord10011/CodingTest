package string;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int result = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {4, 5},
        });
        System.out.println(result); // 3

    }
    public static int connectedVertices(int[][] edges) {
        // TODO:
        final int[] bigger = {0};

        //최대 버텍스(그래프의 정점)를 찾기
        Arrays.stream(edges).forEach(data -> {
            int currentBigger = Arrays.stream(data)
                    .boxed() // int값을 Integer객체로 박싱, 스트림 연산 중에 비교를 위한 max메서드의 요구사항
                    .max(Comparator.comparing(i -> i))// Integer 스트림의 최댓값을 찾는다.
                    .orElse(0);
            if(bigger[0] < currentBigger) bigger[0] = currentBigger;
        });

        //최대 버텍스 +1 만큼의 배열을 선언합니다(0부터 시작)
        int[][] adjArray = new int[bigger[0] + 1][bigger[0] + 1];

        //edge를 순회하며, (무향 그래프이므로 쌍방으로) 간선을 연결
        for(int i = 0; i<edges.length; i++){
            int from = edges[i][0];
            int to = edges[i][1];
            adjArray[from][to] = 1;
            adjArray[to][from] = 1;
        }

        // 방문한 버텍스를 담을 배열을 선언
        boolean[] visited = new boolean[bigger[0]+1];
        // 컴포넌트가 몇개인지 카운트 할 변수를 선언
        int cnt = 0;

        //방문 여부를 체크한 배열을 모두 순회
        for(int vertex = 0; vertex<visited.length; vertex++){
            //방문하지 않았다면
            if(!visited[vertex]){
                //컴포넌트 늘리기
                cnt++;
                // 그래프와 버텍스, 방문했는지 확인할 visited를 bfs 혹은 dfs를 사용해 변수에 담기
//                visited = bfs_array(adjArray, vertex, visited);
                dfs_array(adjArray, vertex, visited);
            }
        }
        return cnt;
    }

    public static boolean[] bfs_array(int[][] adjArray, int vertex, boolean[] visited) {
        //bfs의 경우 큐를 사용
        Queue<Integer> queue = new LinkedList<>();
        //시작지점을 큐에 넣어주고, 해당 버텍스의 방문 여부를 변경
        queue.add(vertex);
        visited[vertex] = true;
        //큐에 더이상 방문할 요소가 없을 경우까지 반복
        while (!queue.isEmpty()){
            //현재 위치를 큐에서 꺼내온 후
            int cur = queue.poll();
            //전체 배열에서 현재 버텍스의 행만 확인
            for(int i=0; i<adjArray[cur].length; i++){
                //길이 존재하고, 아직 방문하지 않았을 경우
                if(adjArray[cur][i] ==1 && !visited[i]){
                    //큐에 해당 버텍스의 위치를 넣어준 후
                    queue.add(i);
                    //방문 여부를 체크
                    visited[i] = true;
                }
            }
        }
        //이어진 모든 길을 순회한 후 방문여부가 체크된 배열을 반환
        return visited;
    }
    public static boolean[] dfs_array(int[][] adjArray, int vertex, boolean[] visited){
        //현재 버텍스의 방문여부를 체크
        visited[vertex] = true;
        //해당 버텍스의 행을 순회
        for(int i = 0; i < adjArray.length; i++){
            if(adjArray[vertex][i] == 1 && !visited[i]){
                dfs_array(adjArray, i, visited);
            }
        }
        return visited;
    }
}

