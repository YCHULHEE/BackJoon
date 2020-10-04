import java.util.Scanner;

class Test {
    int score;

    char testing(int score) {
        if (score >= 90 && score <= 100)
            return 'A';
        if (score >= 80 && score < 90)
            return 'B';
        if (score >= 70 && score < 80)
            return 'C';
        if (score >= 60 && score < 70)
            return 'D';

        return 'F';
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test test = new Test();

        while (true) {
            System.out.println("점수를 입력해주세요.");
            test.score = sc.nextInt();
            System.out.println(test.testing(test.score) + "학점 입니다.");
        }
    }
}

