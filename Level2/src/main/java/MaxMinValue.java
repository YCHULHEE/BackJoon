import java.util.*;

public class MaxMinValue {
    public static void main(String[] args) {

    }

    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            arr.add(Integer.parseInt(str[i]));
        }

        answer = "" + Collections.min(arr) + "" + Collections.max(arr);

        return answer;
    }

    // 다른사람이 짠거
    public String getMinMaxString(String str) {
        String[] tmp = str.split(" ");
        int min;
        int max;
        int n;
        min = Integer.parseInt(tmp[0]);
        max = Integer.parseInt(tmp[0]);

        for (int i = 1; i < tmp.length; i++) {
            n = Integer.parseInt(tmp[i]);
            if (min > n) min = n;
            if (max < n) max = n;
        }

        return min + " " + max;

    }
}

