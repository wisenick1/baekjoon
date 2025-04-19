import java.util.*;

public class Main {

    static int N;
    static boolean[] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        LinkedList<Integer>[] list = new LinkedList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            list[i] = new LinkedList<>();
        }
        
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list[u].add(v);
            list[v].add(u);
        }

        for (int i = 1; i < N; i++) {
            Collections.sort(list[i]);
        }
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(list, i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static void dfs(LinkedList<Integer>[] list, int v) {
        visited[v] = true;

        Iterator<Integer> iter = list[v].listIterator();
        while (iter.hasNext()) {
            int next = iter.next();
            if (!visited[next]) {
                dfs(list, next);
            }
        }
    }
}
