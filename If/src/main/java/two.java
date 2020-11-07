import java.util.*;

public class two {
    public static void main(String[] args) {
        long[] hi = solution(	"987987", "-");

        for (int i = 0; i < 5; i++)
            System.out.println(hi[i]);

    }
    public static long[] solution(String s, String op) {
        long[] answer = new long[s.length() - 1];
        long numOne = 0;
        long numTwo = 0;
        String wordOne = "";
        String wordTwo = "";

        for (int i = 0; i < s.length() - 1; i++) {
            wordOne = s.substring(0, i + 1);
            wordTwo = s.substring(i + 1, s.length());
            numOne = Long.parseLong(wordOne);
            numTwo = Long.parseLong(wordTwo);

            if (op == "+") {
                answer[i] = numOne + numTwo;
            } else if (op == "-") {
                answer[i] = numOne - numTwo;
            } else {
                answer[i] = numOne * numTwo;
            }
        }
        return answer;
    }
}
