public class GreatestCommonFactor {
    public int[] solution(int n, int m) {
        int gcd = gcdF(Math.max(n, m), Math.min(n, m));
        int[] answer = new int[2];
        answer[0] = gcd;
        answer[1] = n * m / answer[0];
        return answer;
    }

    int gcdF(int l, int s) {
        if (s == 0) return l;
        return gcdF(s, l % s);
    }

    public static void main(String[] args) {

    }
}
