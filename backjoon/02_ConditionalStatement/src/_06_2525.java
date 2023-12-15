import java.util.Scanner;

public class _06_2525 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int current_H = scan.nextInt();
        int current_M = scan.nextInt();
        int Time_required = scan.nextInt();

        int required_H = Time_required/60;
        int required_M = Time_required%60;

        int end_H = 0;
        int end_M = 0;
        
        if(current_M + required_M >= 60)  {
            required_H += 1;
            end_M = current_M + required_M - 60;
        }else end_M = current_M + required_M;


        
        if(current_H + required_H>=24){
            end_H = current_H + required_H -24;
        }else end_H = current_H + required_H;
        
        System.out.println(end_H + " " + end_M);
    }
}
