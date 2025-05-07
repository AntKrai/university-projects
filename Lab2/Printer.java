import java.util.Scanner;

public class Printer {
    public static void print_odd(int N){
        for(int i=0; i <= N; i++){
            if( i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);
        System.out.print("Input a number => ");
        int N = myNum.nextInt();
        if( N<=0 ){
            System.out.println("Invalid number!");
            return;
        }
        print_odd(N);
    }
}