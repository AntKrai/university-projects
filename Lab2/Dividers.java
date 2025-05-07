import java.util.Scanner;
        
public class Dividers{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public static void dividers(int n){
        for(int i = 1; i <= n; i++ ){
            if(n%i == 0){
                System.out.print(i + " ");
             }
        }
        if(isPrime(n) == true){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime!");
        }
    }
    public static void main(String[] args){
        Scanner userNum = new Scanner(System.in);
        System.out.print("Input a number => ");
        int n = userNum.nextInt();
        if(n < 0 ){
            System.out.println("Invalid number!");
            return;
        }
        dividers(n);
    }
}