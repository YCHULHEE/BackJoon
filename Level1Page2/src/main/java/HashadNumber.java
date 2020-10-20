public class HashadNumber {
    public static void main(String[] args) {

    }
    // 내가 짠 코드
    public boolean solution(int x) {
        String num = "" + x;
        int sum = 0;
        char[] c = num.toCharArray();

        for (int i = 0; i < c.length; i++) {
            sum += (c[i] - '0');
        }

        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
    // 남이 짠 코드 속도가 훨씬 빠름
    public boolean isHarshad(int num) {
        String[] temp = String.valueOf(num).split("");

        int sum = 0;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }

        if (num % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}
