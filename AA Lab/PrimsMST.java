import java.util.*;
public class PrimsMST {
static final int INF = 999999;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of vertices: ");
int n = sc.nextInt();
int[][] graph = new int[n][n];
System.out.println(
"Enter adjacency matrix (0 for no edge):");
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
graph[i][j] = sc.nextInt();
boolean[] used = new boolean[n];
int[] key = new int[n];
int[] parent = new int[n];
Arrays.fill(key, INF);
Arrays.fill(parent, -1);
key[0] = 0;
int totalWeight = 0;
System.out.println(
"Edges in Minimum Spanning Tree:");
for (int count = 0; count < n; count++) {
int u = -1;
for (int i = 0; i < n; i++)
if (!used[i] &&
(u == -1 || key[i] < key[u]))
u = i;
used[u] = true;
if (parent[u] != -1) {
System.out.println(
(parent[u] + 1) + " - " +
(u + 1) + " : " + key[u]);
totalWeight += key[u];
}
for (int v = 0; v < n; v++) {
if (graph[u][v] != 0 &&
!used[v] &&
graph[u][v] < key[v]) {
key[v] = graph[u][v];
parent[v] = u;
}
}
}
System.out.println(
"Total Weight of MST = " + totalWeight);
sc.close();
}
}

