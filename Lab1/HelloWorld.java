import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!");
        squared();
    }
    public static void squared()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input a number => ");
        int number = myObj.nextInt();
        System.out.println("Square of your number "+ number*number );
    }   
}