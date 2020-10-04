import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation cl = new Calculation();
        while(true) {
            System.out.println("정수를 두 개 입력해주세요.");
            cl.input1 = sc.nextInt();
            cl.input2 = sc.nextInt();
            System.out.println(cl.calculate(cl.input1, cl.input2) + "분면입니다.");
            cl.calculate(cl.input1, cl.input2);
        }
    }
}

class Calculation {
    int input1, input2;

    int calculate(int input1, int input2) {
        if (input1 > 0 && input2 > 0)
            return 1;
        if (input1 < 0 && input2 > 0)
            return 2;
        if (input1 < 0 && input2 < 0)
            return 3;
        if (input1 > 0 && input2 < 0)
            return 4;

        return 0;
    }
}
