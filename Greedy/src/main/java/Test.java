import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] answers = {1,3 ,2, 4, 2};

        int[] result = solution(answers);
    }

    public static int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (person1[i % person1.length] == answers[i]) {
                answer1++;
            }
            if (person2[i % person2.length] == answers[i]) {
                answer2++;
            }
            if (person3[i % person3.length] == answers[i]) {
                answer3++;
            }
        }
        int maxAnswer = Math.max(answer1, Math.max(answer2, answer3));
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (maxAnswer == answer1) {
            list.add(1);
        }
        if (maxAnswer == answer2) {
            list.add(2);
        }
        if (maxAnswer == answer3) {
            list.add(3);
        }

        int[] rightPerson = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            rightPerson[i] = list.get(i);
        }

        return rightPerson;
    }
}
