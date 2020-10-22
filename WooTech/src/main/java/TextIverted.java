public class TextIverted {
    public static String solution(String word) {
        String answer = "";
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ') {
                answer += ' ';
                continue;
            }

            int result = 130 - chars[i];
            chars[i] = (char) result;
        }

        answer = String.valueOf(chars);

        return answer;
    }

    public static void main(String[] args) {
        String word = "i love you";

        System.out.println(solution(word));
    }
}
