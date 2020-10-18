public class CreateStrangeCharacter {
    public String solution(String s) {
        String answer = "";
        int count = 1;
        char[] word = s.toCharArray();

        for (int i = 0; i < word.length; i++) {
            if (word[i] == ' '){
                count = 1;
                continue;
            }
            if(count % 2 == 1) {
                word[i] = Character.toUpperCase(word[i]);
            }
            count++;
        }

        answer = new String(word);

        return answer;
    }

    public String solution2(String s) {
        String answer;
        answer = s.toUpperCase();
        char[] chars = answer.toCharArray();

        //앞문자가 대문자라면 소문자로 치환
        for (int i = 1; i < chars.length; i++) {
            if (62 <= chars[i - 1] && chars[i - 1] <= 90) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }

    public static void main(String[] args) {

    }
}
