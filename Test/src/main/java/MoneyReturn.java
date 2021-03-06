import java.util.*;

public class MoneyReturn {
    public int[] solution(int money) {
        int[] answer = new int[9];
        int changes;

        answer[0] = money / 50000;
        changes = money % 50000;
        answer[1] = changes / 10000;
        changes = changes % 10000;
        answer[2] = changes / 5000;
        changes = changes % 5000;
        answer[3] = changes / 1000;
        changes = changes % 1000;
        answer[4] = changes / 500;
        changes = changes % 500;
        answer[5] = changes / 100;
        changes = changes % 100;
        answer[6] = changes / 50;
        changes = changes % 50;
        answer[7] = changes / 10;
        changes = changes % 10;
        answer[8] = changes / 1;

        return answer;
    }

    public static int[] solution1(int money) {
        int[] answer = new int[9];
        int[] changes = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int change = money;

        for (int i = 0; i < changes.length; i++) {
            answer[i] = change / changes[i];
            change = change % changes[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = solution1(123999);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
