public class JadenCase {
    public static String solution(String s) {
        String answer = s.toLowerCase();
        char[] string = answer.toCharArray();

        if (string[0] >= '0' && string[0] <= '9') {
        } else {
            string[0] = Character.toUpperCase(string[0]);
        }

        for (int i = 1; i < s.length() - 1; i++) {
            if (string[i] == ' ') {
                if (string[i + 1] >= '0' && string[i + 1] <= '9') {
                } else {
                    string[i + 1] = Character.toUpperCase(string[i + 1]);
                }
            }
        }

        answer = String.valueOf(string);
        return answer;
    }

    public static void main(String[] args) {
        String a = "1";
        a = a.toLowerCase();
    }

    // 다른 사람이 짠거 스트링으로 해결함.
    public String solution1(String s) {
        String answer = "";
        String[] arr = s.split("");
        boolean change = true;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(" ")) {
                change = true;
                answer += arr[i];
                continue;
            }

            if (change) {
                arr[i] = arr[i].toUpperCase();
                change = false;
            } else {
                arr[i] = arr[i].toLowerCase();
            }

            answer += arr[i];
        }

        return answer;
    }
}
