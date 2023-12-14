import java.util.Scanner;

public class _05_2884 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int M = scan.nextInt();

        if(M>=45){
            System.out.println(H + "\t" + (M-45));
        }else if(M<45){
            if(H>0)System.out.println((H-1) + "\t" + (60-(45-M)));
            if(H==0)System.out.println((23) + "\t" + (60-(45-M)));

        }
    }
}
