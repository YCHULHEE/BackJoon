public class OneCheck {
    public static int solution(int num) {
        int answer = 0;
        int checkNum = num;

        while (answer <= 500) {
            if (checkNum % 2 == 0) {
                checkNum = checkNum / 2;
            }
            else if (checkNum % 2 == 1) {
                checkNum = (checkNum * 3) + 1;
            }
            if (checkNum == 1) {
                return answer;
            }
            if (checkNum == 500) {
                return -1;
            }
            answer++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a = solution(6);
        System.out.println(a);
            }
}
