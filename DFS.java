public class DFS{
    static boolean c[][];
    static boolean visited[];
    static int n; // so dinh
    static void dfs(int u){
        System.out.print(u+" ");
        visited[u]  = true;
        for (int i = 1;i<=n;i++)
            if (!visited[i] && c[u][i]){
                dfs(i);
            }
    }
 }
