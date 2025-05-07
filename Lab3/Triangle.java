import java.util.Scanner;
public class Triangle{
    public static void print_triangle(int N){
        int [][] triangle = new int [N][N];
        for(int i=0; i < N; i++){
            triangle[i][0]=1;
            for( int j=1; j <= i; j++){
                triangle[i][j] = triangle[i-1][j-1]+ triangle[i-1][j];
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j< N-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows => ");
        int rows = scanner.nextInt();
        scanner.close();
        print_triangle(rows);
    }
}