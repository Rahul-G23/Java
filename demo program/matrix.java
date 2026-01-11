import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (N): ");
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] C = new int[N][N];
        System.out.println("Enter the elements of Matrix A ("+N+"x"+N+"):");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of Matrix B ("+N+"x"+N+"):");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Recultant Matrix (A + B):");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(C[i][j] = A[i][j] + B[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        sc.close();
    }
}