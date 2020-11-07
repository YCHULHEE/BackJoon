import java.util.HashMap;

public class six {
    public static String[] solution(String[] logs) {
        String[] answer = {};
        HashMap<String,String> map = new HashMap<String,String>();

        for (int i = 0; i < logs.length; i++) {
            String num = logs[i].substring(0, 4);
            String info = logs[i].substring(5, logs[i].length());
            map.put(logs[i].substring(0, 7), logs[i].substring(7, logs[i].length()));
        }



        int a = 10;
        return answer;
    }

    public static void main(String[] args) {
        String[] longs = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
        String[] hi = solution(longs);
    }
}
