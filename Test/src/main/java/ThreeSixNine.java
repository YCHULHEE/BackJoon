public class ThreeSixNine {
    public static void main(String[] args) {
        int a = solution(33);
    }

    public static int solution(int number) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            String check = "" + i;
            char[] chars = check.toCharArray();
            int j = 0;
            while (j < chars.length) {
                if (chars[j] == '3' || chars[j] == '6' || chars[j] == '9') {
                    answer++;
                }
                j++;
            }
        }
        return answer;
    }
}