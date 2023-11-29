import java.util.Scanner;
public class Testclass_1 {
    public static void main(String[] args) {
        System.out.println("첫번째 입력 : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("두번째 입력 : ");
		String name2 = scan.next();
		System.out.println((name.equals(name2))?"이름이 같음":"이름이 다름" );
		scan.close();
    }
}
