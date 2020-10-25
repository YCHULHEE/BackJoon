import java.util.*;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;


        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if ((budget - d[i]) < 0) {
                return answer;
            }

            if (budget > 0) {
                budget -= d[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
