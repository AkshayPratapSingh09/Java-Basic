import java.util.Scanner;

public class array_2d_implementation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int matrix[][] = new int[row][cols];
        
        for(int i =0; i<row; i++){
            for(int j =0; j<cols; j++){
                // System.out.print("Enter the number on "+i+" : "+j+" ");
                matrix[i][j] = sc.nextInt();
            }
            
        }
        for(int i =0; i<row; i++){
            for(int j =0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
