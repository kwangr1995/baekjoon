import java.util.Scanner;

public class Testclass_1 {
    public static void main(String[] args) {
        
		int [][] num = {
			{1,2,3},
			{4,5,6},
			{7,8}
		};

		//값을 출력하기
		for(int i=0; i<num.length; i++){
			for(int j=0; j < num[i].length; j++){
				System.out.println("num[" + i + "][" + j + "]" + num[i][j]);
			}
		}

		//전체 합을 구하기
		int sum = 0;

		for(int i=0; i < num.length; i++){
			for(int j=0; j< num[i].length; j++){
				sum += num[i][j];
			}
		}
		System.out.println(sum);
    }
}
