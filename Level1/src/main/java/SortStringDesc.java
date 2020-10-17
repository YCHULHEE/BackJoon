import java.util.Arrays;
import java.util.Collections;

public class SortStringDesc {
    public static void main(String[] args) {
    }
    // 내가 짠 코드
    public String solution(String s) {
        String[] array = s.split("");
        ;
        Arrays.sort(array, Collections.reverseOrder());

        return String.join("", array);
    }
    // 다른 사람 코드 효율이 좋음.
    public String solution1(String s) {
        char[] sol = s.toCharArray();
        Arrays.sort(sol);

        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
