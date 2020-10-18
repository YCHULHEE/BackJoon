import java.util.*;

public class SortIntDesc {
    // 내가 짠 코드 별로임.
    public long solution(long n) {
        String len = "" + n;
        long answer = 0;
        String[] ary = new String[len.length()];
        ary = Long.toString(n).split("");
        String tmp = "";


        Arrays.sort(ary, Collections.reverseOrder());

        for (int i =0; i < len.length(); i++) {
            tmp += Integer.parseInt(ary[i]);
        }

        answer = Long.parseLong(tmp);
        return answer;
    }
    // 남의 짠 코드 효율이 훨씬 좋음.
    public long solution1(long n) {
        String str = Long.toString(n);
        char[] c = str.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(new String(c,0,c.length));
        return Long.parseLong(((sb.reverse()).toString()));
    }

    public static void main(String[] args) {

    }
}
