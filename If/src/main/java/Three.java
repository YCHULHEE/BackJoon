public class Three {
    public static void main(String[] args) {
        String[] expected = {"H", "T", "H", "T", "H", "T", "H"};
        String[] actual = {"T", "T", "H", "H", "T", "T", "H"};
        int hi = solution(1000, expected, actual);
        System.out.println(hi);
    }

    public static int solution(int money, String[] expected, String[] actual) {
        int answer = money;
        int bettingMoney = 100;

        for (int i = 0; i < expected.length; i++) {
            if (answer < bettingMoney) {
                bettingMoney = answer;
            }

            if (expected[i] == actual[i]) {
                answer += bettingMoney;
                bettingMoney = 100;
            } else {
                answer -= bettingMoney;
                bettingMoney = bettingMoney * 2;
            }
            if (answer <= 0) {
                return 0;
            }
        }
        return answer;
    }
}
