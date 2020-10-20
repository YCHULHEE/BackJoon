import java.util.*;

public class ArrangeYourOwnStrings {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        String temp = "";

        ArrayList<String> list = new ArrayList<String>();

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);

                if (c1 == c2) {
                    return o1.compareTo(o2);
                } else return c1 - c2;
            }
        });
        return strings;
    }
    // 가독성 좋은 코드.
    public String[] solution1(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"sun", "bed", "car"};

    }
}
