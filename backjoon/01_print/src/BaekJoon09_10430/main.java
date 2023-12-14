package BaekJoon09_10430;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        scan.close();

        //첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C

        //(a+b)%c

        System.out.println((a+b)%c);
        //((a%c) + (b%c))%C
        System.out.println(((a%c)+(b%c))%c);
        // (ab)%c
        System.out.println((a*b)%c);
        // ((a%c)*(b%c))%c
        System.out.println(((a%c)*(b%c))%c);

        
    }

}
