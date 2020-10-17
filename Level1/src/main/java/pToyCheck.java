public class pToyCheck {
    public static void main(String[] args) {

    }

    boolean solution(String s) {
        boolean answer = false;
        char[] word = s.toLowerCase().toCharArray();
        int countP = 0;
        int countY = 0;

        for (int i = 0; i < word.length; i++) {
            if (word[i] == 'p') {
                countP++;
            }
            if (word[i] == 'y') {
                countY++;
            }
        }

        if (countP == countY) {
            answer = true;
        }

        return answer;
    }
}
