import java.util.Scanner;

public class _03_8393 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            int sum = 0;

            while(num>0){
                sum+=num;
                num--;
            }
            System.out.println(sum);
        }
}
