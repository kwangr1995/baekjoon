import java.util.Scanner;

public class _07_2480 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int case_num = 3;

        if(a==b&&b==c) case_num = 1;
        if(a==b&&a!=c) case_num = 2;
        if(a!=b&&a==c) case_num = 2;
        if(b==c&&a!=b) case_num = 2;

        int same_2 = a;

        int max = 0;

        if(case_num == 1)System.out.println(10000+(a*1000));

        if(case_num == 2){
            if(a==b&&a!=c) same_2 = a;
            if(a!=b&&a==c) same_2 = a;
            if(b==c&&a!=b) same_2 = b;
            System.out.println(1000+(same_2)*100);
        }

        if(case_num == 3){
            if(a>b&&a>c) max = a;
            if(b>a&&b>c) max = b;
            if(c>a&&c>b) max = c;
            System.out.println(max*100);
        }
    }
}
