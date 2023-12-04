//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

/*
 * 1. 두 정수 A, B를 입력받아야 함
 * 2. 두 정수 A, B를 더하기
 * 3. 두 정수의 합을 출력 
 */
import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();//첫번쨰 숫자 입력

        int b = scan.nextInt();//두번째 숫자 입력

        System.out.println(a + b);//두 숫자의 합 출력
        scan.close();
    }
}


