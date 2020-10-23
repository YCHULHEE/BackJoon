public class OneTwoFourCountry {
    public static void main(String[] args) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";
        int n = 5;

        int num = n;

        while (num > 0) {
            int remainder = num % 3;
            num /= 3;

            if (remainder == 0) num--;

            answer = numbers[remainder] + answer;
        }

    }
}

