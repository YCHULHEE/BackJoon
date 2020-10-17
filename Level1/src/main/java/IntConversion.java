public class IntConversion {
    public int solution(String s) {
        int answer = 0;
        char[] number = s.toCharArray();

        if(number[0] == '+')
            return Integer.parseInt(s);
        else
            return -(Integer.parseInt(s));
    }


    public static void main(String[] args) {

    }
}
