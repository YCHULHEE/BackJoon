import java.util.ArrayList;

public class PhoneHide {
    // 내가 한거.
    public String solution(String phone_number) {
        String answer = "";
        char[] number = phone_number.toCharArray();
        for (int i = 0; i < (number.length - 4); i++) {
            number[i] = '*';
        }
        for (int i = 0; i < number.length; i++){
            answer += number[i];
        }

        return answer;
    }
    // String 함수 valueOf 사용.
    public String solution1(String phone_number) {
        char[] number = phone_number.toCharArray();

        for (int i = 0; i < (number.length - 4); i++) {
            number[i] = '*';
        }

        return String.valueOf(number);
    }

    public static void main(String[] args) {

    }
}
