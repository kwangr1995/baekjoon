package BaekJoon09_2588;
/* 
 * 1. 두 정수 입력
 * 2. 두번째 입력된 정수를 배열 형태로 전환
 * 2.1.문자열 형태로 입력받아서
 * 2.2.배열에 순서대로 입력 후
 * 2.3 정수형태로 변환하여 반환
 * 3. 반복 사용하여 두번째 정수를 거꾸로 출력하여 곱하기
 * 4. 두 정수의 곱
*/

import java.util.Scanner;

public class _09_2588 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        String b = scan.next();
        // String b = scan.nextLine(); 이 코드였을 때 에러 발생

        scan.close();

        //배열 생성
        int [] arr = new int[b.length()];

        //b의 값을 배열에 저장
        for (int i = 0; i < arr.length; i++){
            arr[i] = b.charAt(i);
        }

        //반복으로 역순 출력
        for (int i = 0; i < arr.length; i++){
            System.out.println(a*Character.getNumericValue(arr[arr.length-1-i]));
        }

        System.out.println(a*Integer.parseInt(b));
    }
}
