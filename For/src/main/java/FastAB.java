import java.util.Scanner;

public class FastAB {
    static final int MAX_T = 1000000;
    static final int MAX_NUM = 1000;
    static final int MIN_NUM = 1;
    static int a = 0;
    static int b = 0;
    static int t = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("테스트 할 갯수를 적어주세요.");
        t = scanner.nextInt();
        if (t < 0 && t > MAX_T) {
            return;
        }
        for (int i = 0; i < t; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a >= MIN_NUM && a <= MAX_NUM && b >= MIN_NUM && b <= MAX_NUM) {
                System.out.println(a+b);
            }
        }
    }
}



