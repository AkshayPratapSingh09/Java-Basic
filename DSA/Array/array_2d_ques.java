import java.util.Scanner;

public class array_2d_ques {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int x;

        int matrix[][] = new int[row][cols];
        
        for(int i =0; i<row; i++){
            for(int j =0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
                }
            }

            
        System.out.println("Enter the number you want to search : ");
        x = sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==x){
                    System.out.println("Found "+x+" on "+i+" : "+j);
                }
                    }
            }
    sc.close();
        }
}