import java.util.*;


public class five {

    public static void main(String[] args) {
        String hi = solution("10", "11", "00", "00011011");
    }


    public static String solution(String penter, String pexit, String pescape, String data) {
        String answer = "";
        ArrayList<String> arrayList = new ArrayList<String>();
        int dataLength = (data.length() / penter.length());
        int packetLength = penter.length();
        String[] paketSplit = new String[dataLength];


        arrayList.add(penter);
        arrayList.add(pexit);
        arrayList.add(pescape);

        for (int i = 0; i < dataLength; i++) {
            if (i == 0) {
                paketSplit[0] = data.substring(0, packetLength);
            } else {
                paketSplit[i] = data.substring((i * packetLength), ((i * packetLength) + (packetLength)));
            }
        }

        for (int i = 0; i < paketSplit.length; i++) {
            if (arrayList.contains(paketSplit[i])) {
                answer = answer + pescape + paketSplit[i];
            } else {
                answer += paketSplit[i];
            }
        }

        answer = penter + answer + pexit;

        return answer;
    }
}
