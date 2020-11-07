import java.util.*;

public class GymSuit {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = (n - lost.length);
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 여분 체육복 리스트에 넣기.
        for (int k = 0; k < reserve.length; k++) {
            list.add(reserve[k]);
        }

        // 잃어버린 사람 중에 여분 체육복 있는 사람 제외.
        for (int i = 0; i < lost.length; i++) {
            if (list.contains(lost[i])) {
                answer++;
                list.remove((Integer) lost[i]);
                lost[i] = -1;
            }
        }
        // 잃어버린 사람 왼쪽 사람이 있는지와 오른쪽 사람이 있는지 확인하고 있으면 정답값 올린다음, 리스트에 같은 이름 제거.
        for (int i = 0; i < lost.length; i++) {
            if (list.contains(lost[i] -1)) {
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
