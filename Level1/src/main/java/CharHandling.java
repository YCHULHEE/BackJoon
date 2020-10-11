public class CharHandling {
    public static boolean solution(String s) {
        boolean answer = true;
        char[] word =s.toCharArray();

        for(int i = 0; i < word.length; i++){
            if(word[i] < '0' || word[i] > '9') {
                return answer = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean hi = solution("a123");
    }
}
