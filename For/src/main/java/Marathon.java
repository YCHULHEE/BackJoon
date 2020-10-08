import java.util.Arrays;


public class Marathon {
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
