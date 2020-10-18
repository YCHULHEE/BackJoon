public class IntegerSquareRoot {
    public static void main(String[] args) {

    }
    // 괜찮은 코드
    public long solution(long n) {
        Double sqrt = Math.sqrt(n);

        if (sqrt == sqrt.intValue()) {
            return (long) Math.pow(sqrt + 1, 2);
        } else return -1;
    }
    //최적화 코드
    public long solution1(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
}
