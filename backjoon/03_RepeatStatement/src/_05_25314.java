import java.util.Scanner;

public class _05_25314 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bytesize = scan.nextInt();

        for(int i = 0; i < (bytesize/4); i++){
            System.out.print("long ");
        }
        System.out.print("int");
        scan.close();
    }
}
