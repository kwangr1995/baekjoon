import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _06_15552 {

    public static void main(String[] args) {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();

        for(int i = 0; i < num; i++){

            try{
                String str = br.readLine();

                StringTokenizer str_token = new StringTokenizer(str);

                int a = Integer.parseInt(str_token.nextToken());
                int b = Integer.parseInt(str_token.nextToken());

                int sum = a+b;

                
                bw.write(Integer.toString(sum));
                bw.newLine();
                if(i == (num-1)){
                    bw.flush();
                    bw.close();
                    br.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        scan.close();
    }
}
