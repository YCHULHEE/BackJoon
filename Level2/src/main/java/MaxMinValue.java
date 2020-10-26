public class MaxMinValue {
    public String solution(String s) {
        String answer = "";
        char[] string = s.toCharArray();
        s.length();
        int num = 0;
        int maxNum = string[0];
        int minNum = string[0];

        for (int i = 2; i < string.length; i += 2) {
             num = string[i];
             if (num > maxNum) {
                 maxNum = string[i];
             }

             if (num < minNum) {
                 minNum = string[i];
             }
        }
        answer = (char) minNum + " " + (char) maxNum;
        return answer;
    }

    public static void main(String[] args) {

    }
}
