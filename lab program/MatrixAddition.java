import java.util.Scanner;


public class MatrixAddition {
    public static void main(String[] args) {
        // Check if N is provided through command line
        if (args.length != 1) {
            System.out.println("Usage: java MatrixAddition <N>");
            return;
        }


        int N = Integer.parseInt(args[0]);
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] C = new int[N][N];


        Scanner sc = new Scanner(System.in);


        // Read first matrix
        System.out.println("Enter elements of Matrix A (" + N + "x" + N + "):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }


        // Read second matrix
        System.out.println("Enter elements of Matrix B (" + N + "x" + N + "):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = sc.nextInt();
            }
        }


        // Add the two matrices
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }


        // Display the result
        System.out.println("\nResultant Matrix (A + B):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}