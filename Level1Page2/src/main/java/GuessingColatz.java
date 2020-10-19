public class GuessingColatz {
    public int solution(int num) {
        int cnt = 0;
        long n = (long)num;

        while (n > 1) {
            if( cnt == 500) {
                return -1;
            }

            if(n == 1){
                break;
            }

            if (n % 2 == 1) {
                n = ((n * 3) + 1);
            }
            else {
                n = n / 2;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {

    }
}
