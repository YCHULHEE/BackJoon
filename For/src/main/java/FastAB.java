import java.io.*;
import java.util.StringTokenizer;

public class FastAB {
    static final int MAX_T = 1000000;
    static final int MAX_NUM = 1000;
    static final int MIN_NUM = 1;
    static int a = 0;
    static int b = 0;
    static int t = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("테스트 할 갯수를 적어주세요.");
        t = Integer.parseInt(br.readLine());

        if (t < 0 && t > MAX_T) {
            return;
        }

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer((br.readLine()));
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if (a >= MIN_NUM && a <= MAX_NUM && b >= MIN_NUM && b <= MAX_NUM) {
                String sum = Integer.toString(a+b);
                bw.write(sum+"\n");
            }
            bw.flush();
        }
    }
}



