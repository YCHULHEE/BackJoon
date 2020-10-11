
public class MiddleStringGet {
    public static void main(String[] args) {

    }


    // 한 줄로 처리 가능
    String getMiddle(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }

    // 첫번째 망작
    public String solution(String s) {
        String answer = "";
        char[] string1 = s.toCharArray();

        if (string1.length == 1){
            answer += string1[0];
            return answer;
        } else if (string1.length == 2){
            answer += string1[0];
            answer += string1[1];
            return answer;
        }

        for (int i = 1; i < string1.length; i++) {
            if ((string1.length / i == 2) && (string1.length % i == 0)) {
                answer += string1[i-1];
                answer += string1[i];
                return answer;
            } else if (string1.length / i == 2 && string1.length % i == 1) {
                answer += string1[i];
                return answer;
            }
        }
        return answer;
    }
}
