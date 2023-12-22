import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11_10952 {

    public static void main(String[] args)throws IOException {
        // br bw
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;

        while(count > 0){

            String str = br.readLine();
            StringTokenizer str_token = new StringTokenizer(str);

            int a = Integer.parseInt(str_token.nextToken());
            int b = Integer.parseInt(str_token.nextToken());

            if(a == 0 && b == 0){break;}
            int sum = a+b;
            bw.write(sum + "\n");

            count++;
            //0?
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
