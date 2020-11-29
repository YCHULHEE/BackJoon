import java.util.*;

public class Measure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] realDivisor = new int[N];
        for (int i = 0; i < N; i++) realDivisor[i] = sc.nextInt();
        sc.close();
        Arrays.sort(realDivisor);
        System.out.print(realDivisor[0] * realDivisor[N - 1]);
    }
}
