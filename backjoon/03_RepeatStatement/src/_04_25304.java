import java.util.Scanner;

public class _04_25304 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum_check = scan.nextInt();
        int sum = 0;
        int NumofOrd = scan.nextInt();

        for(int i = 0; i < NumofOrd; i++){
            int price = scan.nextInt();
            int quantity = scan.nextInt();
            sum += price * quantity;
        }
        if(sum_check == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
