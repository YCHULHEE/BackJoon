import java.util.Scanner;
import java.util.*;

public class MathAndPhysical {
    public static void main(String[] args) {

    }

    public int solution(String[] grades, int[] weights, int threshold) {
        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        int[] weight = {10, 9, 8, 7, 6, 5, 4, 3, 0};
        int score = 0;
        int answer = 0;

        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 9; i++) {
            arrayList.add(grade[i]);
        }

        for (int i = 0; i < grades.length; i++) {
            score = arrayList.indexOf(grades[i]);
            answer += (weight[score] * weights[i]);
        }

        answer -= threshold;

        return answer;
    }
}
