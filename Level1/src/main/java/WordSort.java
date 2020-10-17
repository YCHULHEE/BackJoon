import java.awt.List;
import java.util.*;

public class WordSort {
    public static void main(String[] args) {
        int[] answers = {2, 1, 2, 3, 2};
        int person1[] = {1, 2, 3, 4, 5};
        int person2[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int person3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < answers.length; i++) {
            if (person1[i % answers.length] == answers[i]) {
                answer1++;
            }
            if (person2[i % answers.length] == answers[i]) {
                answer2++;
            }
            if (person3[i % answers.length] == answers[i]) {
                answer3++;
            }
        }
        int maxAnswer = Math.max(Math.max(answer1, answer2), answer3);

        if (answer1 == maxAnswer) {
            list.add(answer1);
        }
        if (answer2 == maxAnswer) {
            list.add(answer2);
        }
        if (answer2 == maxAnswer) {
            list.add(answer3);
        }

            answers = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answers[i] = list.get(i);
        }

    }

    public String solution(String s) {
        String answer = "";

        char[] word = s.toCharArray();

        Arrays.sort(word);
        answer = new StringBuilder(new String(word)).reverse().toString();

        return answer;
    }
}
