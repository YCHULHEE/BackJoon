import java.util.Arrays;
import java.util.HashMap;


public class Marathon {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"leo", "kiki"};
        String temp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i ;
        for( i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                    temp = participant[i];
            }
        }
        temp = participant[i];
        System.out.println(temp);
        }
    }
