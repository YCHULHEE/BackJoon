import java.util.*;

public class NumDivison {
    public static void main(String[] args) {

    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int[] answer1 = {-1};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrayList.add(arr[i]);
            }
        }
        if (arrayList.isEmpty()) {
            return answer1;
        }

        Collections.sort(arrayList);

        answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
