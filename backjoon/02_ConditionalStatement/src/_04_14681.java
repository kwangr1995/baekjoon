import java.util.Scanner;

public class _04_14681 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        if((x*y>0)&&(x>0)){
            System.out.println(1);
        }else if((x*y>0)&&(x<0)){
            System.out.println(3);
        }else if((x*y<0)&&(x>0)){
            System.out.println(4);
        }else if((x*y<0)&&(x<0)){
            System.out.println(2);
        }
    }
}
