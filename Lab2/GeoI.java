import java.util.Scanner;

public class GeoI {
    public static int geoI(int a, int q, int n){
        for(int i = 1; i < n; i++ ){
            a *=q;
        }
        System.out.println("Iterative method " + a);
        return a;
    }
     public static int geoR(int a, int q, int n){
        a*=q;
        if (n > 2){
            n-=1;
            geoR(a,q,n);     
        } 
        else {
            System.out.println("Recursive method " + a);
        }
        return a;
    }
    public static void main(String[] args){
        Scanner userNum = new Scanner(System.in);
        System.out.print("Input the initial value of geometric progression => ");
        int a = userNum.nextInt();
        System.out.print("Input the common ratio of geometric progression => ");
        int q = userNum.nextInt();
        System.out.print("Input the number of terms of geometric progression => ");
        int n = userNum.nextInt();
        if(a == 0 || q == 0 || n <= 0)
        {
            System.out.println("Invalid input for one of the prompts!");
            return;
        }
        geoI(a, q, n);
        geoR(a, q, n);
    }
}
