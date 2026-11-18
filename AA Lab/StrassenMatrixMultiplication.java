import java.util.Scanner;
public class StrassenMatrixMultiplication {
static int[][] add(int[][] A, int[][] B) {
int n = A.length;
int[][] C = new int[n][n];
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
C[i][j] = A[i][j] + B[i][j];
return C;
}
static int[][] subtract(int[][] A, int[][] B) {
int n = A.length;
int[][] C = new int[n][n];
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
C[i][j] = A[i][j] - B[i][j];
return C;
}
static int[][] multiply(int[][] A, int[][] B) {
int n = A.length;
if (n == 1)
return new int[][]{{A[0][0] * B[0][0]}};
int k = n / 2;
int[][] A11 = new int[k][k], A12 = new int[k][k];
int[][] A21 = new int[k][k], A22 = new int[k][k];
int[][] B11 = new int[k][k], B12 = new int[k][k];
int[][] B21 = new int[k][k], B22 = new int[k][k];
split(A, A11, 0, 0);
split(A, A12, 0, k);
split(A, A21, k, 0);
split(A, A22, k, k);
split(B, B11, 0, 0);
split(B, B12, 0, k);
split(B, B21, k, 0);
split(B, B22, k, k);
int[][] M1 = multiply(add(A11, A22), add(B11, B22));
int[][] M2 = multiply(add(A21, A22), B11);
int[][] M3 = multiply(A11, subtract(B12, B22));
int[][] M4 = multiply(A22, subtract(B21, B11));
int[][] M5 = multiply(add(A11, A12), B22);
int[][] M6 = multiply(subtract(A21, A11), add(B11, B12));
int[][] M7 = multiply(subtract(A12, A22), add(B21, B22));
int[][] C11 = add(subtract(add(M1, M4), M5), M7);
int[][] C12 = add(M3, M5);
int[][] C21 = add(M2, M4);
int[][] C22 = add(subtract(add(M1, M3), M2), M6);
return combine(C11, C12, C21, C22);
}
static void split(int[][] P, int[][] C, int r, int c) {
for (int i = 0; i < C.length; i++)
for (int j = 0; j < C.length; j++)
C[i][j] = P[i + r][j + c];
}
static int[][] combine(int[][] A, int[][] B,
int[][] C, int[][] D) {
int k = A.length;
int[][] R = new int[2 * k][2 * k];
for (int i = 0; i < k; i++) {
for (int j = 0; j < k; j++) {
R[i][j] = A[i][j];
R[i][j + k] = B[i][j];
R[i + k][j] = C[i][j];
R[i + k][j + k] = D[i][j];
}
}
return R;
}
static void printMatrix(int[][] A) {
for (int[] row : A) {
for (int x : row)
System.out.print(x + "\t");
System.out.println();
}}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter order of matrices (power of 2): ");
int n = sc.nextInt();
int[][] A = new int[n][n];
int[][] B = new int[n][n];
System.out.println("Enter Matrix A:");
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
A[i][j] = sc.nextInt();
System.out.println("Enter Matrix B:");
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
B[i][j] = sc.nextInt();
int[][] C = multiply(A, B);
System.out.println("Resultant Matrix:");
printMatrix(C);
sc.close();
}
}
