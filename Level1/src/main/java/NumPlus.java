import java.util.Arrays;
import java.util.ArrayList;

public class NumPlus {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++){
                int result = numbers[i] + numbers[j];
                if(list.indexOf(result) < 0)
                    list.add(result);
            }
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
    public static void main(String[] args) {

    }
}
