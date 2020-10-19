import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int empty = arr.length - 1;
        int temp = arr[0];
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(empty == 0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        for (int i = 1; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(temp != arr[i]) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] test = {5, 6, 2, 3, 1, 7, 9};

    }
}
