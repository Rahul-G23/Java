import java.util.*;

/*  Develop a JAVA program to add TWO matrices of suitable order N (The value of N should be read from
command line arguments). */
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the matrix (N): ");
        int N = sc.nextInt();
        
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] C = new int[N][N];

        // Initialize matrices with some values
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
        // Add the matrices
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        // Print the result
        System.out.println("\nResultant Matrix (A + B):");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}