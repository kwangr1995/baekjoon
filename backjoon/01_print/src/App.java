public class App {
    public static void main(String[] args)  {
        long start_for = System.currentTimeMillis();

        double sum_for = 2;

        for( int i = 1; i <1000; i++){
            sum_for = sum_for*i;
        }
        long end_for = System.currentTimeMillis();

        System.out.println("for연산 sum의 현재 값 : " + sum_for + "\t소요시간 : " + (end_for-start_for));


        long start_while = System.currentTimeMillis();

        double sum_while = 2;

        int i = 1;
        while ( i <1000){
            sum_while = sum_while * i;
            i++;
        }
        long end_while = System.currentTimeMillis();

        System.out.println("While연산 sum의 현재 값 : " + sum_while + "\t소요시간 : " + (end_while-start_while));

    }
}
