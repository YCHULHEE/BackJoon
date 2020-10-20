import java.util.*;

public class GymSuit {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = (n - lost.length);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int k = 0; k < reserve.length; k++) {
            list.add(reserve[k]);
        }

        for (int i = 0; i < lost.length; i++) {
            if (list.contains(lost[i])) {
                answer++;
                list.remove((Integer) lost[i]);
                lost[i] = -1;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if (list.contains(lost[i] - 1)) {
                answer++;
                list.remove((Integer) (lost[i] - 1));
            } else if (list.contains(lost[i] + 1)) {
                answer++;
                list.remove((Integer) (lost[i] + 1));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] b = {1, 3, 4, 5, 6, 7, 10};
        int[] c = {3, 4, 9, 13};

        int a = solution(13, b, c);
    }
}
