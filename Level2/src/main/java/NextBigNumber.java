public class NextBigNumber {
    public static void main(String[] args) {

    }

    public int solution(int n) {
        int answer = 0;
        String strNum = Integer.toBinaryString(n);
        int countOne = toCountOne(strNum);
        int cnt = 0;

        for (int i = (n + 1); i < 1000000; i++) {
            String str = Integer.toBinaryString(i);
            cnt = toCountOne(str);

            if (countOne == cnt) {
                return i;
            }
        }
        return answer;
    }

    public int toCountOne(String str) {
        char[] num = str.toCharArray();
        int cnt = 0;
        for (char k : num) {
            if (k == '1') {
                cnt++;
            }
        }
        return cnt;
    }
    // 인티거 비트카운트 함수를 사용한 방법.
    public int solution1(int n) {
        int bitCount = Integer.bitCount(n);
        for (int i = n + 1; ; i++) {
            if (bitCount == Integer.bitCount(i)) {
                return i;
            }
        }
    }
}
