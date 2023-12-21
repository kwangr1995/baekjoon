import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _07_11021 {

    public static void main(String[] args) throws IOException{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());


        for(int i = 0; i < num; i++){

            
            String str = br.readLine();

            StringTokenizer str_token = new StringTokenizer(str);

            int a = Integer.parseInt(str_token.nextToken());
            int b = Integer.parseInt(str_token.nextToken());

            int sum = a+b;

            bw.write("Case #" + (i+1) + ": " + Integer.toString(sum) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}