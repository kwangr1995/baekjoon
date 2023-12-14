import java.util.Scanner;

public class _01_1330 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if(a>b)System.out.println(">");
        if(a==b)System.out.println("=");
        if(a<b)System.out.println("<");


    }
}
