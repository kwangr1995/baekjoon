//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

/*

 * 1. A와 B 입력
 * 2. A/B연산
 * 3. A/B출력
 * 
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();


        BigDecimal big_a = new BigDecimal(a);
        BigDecimal big_b = new BigDecimal(b);

        System.out.println(big_a.divide(big_b, 10, RoundingMode.HALF_UP));

        scan.close();
    }
}
