import java.util.*;

public class SameNumHate {

    public static void main(String[] args) {

    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
