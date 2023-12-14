import java.util.Scanner;

public class _03_2753 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if((a%4 == 0 )&&((a%100 != 0))||(a%400==0)){
            System.out.println(1);
        }else System.out.println(0);
    }
}
