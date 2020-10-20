import java.util.*;

public class PressTheKeypad {
    public  String solution(int [] n, String hand) {
        String answer = "";

        int leftLocation = 10;
        int rightLocation = 12;

        for(int number : n) {
            if(number ==1 || number == 4 || number == 7) {
                answer += ("L");
                leftLocation = number;
            }else if(number == 3 || number == 6 || number == 9) {
                answer += ("R");
                rightLocation = number;
            }else { // 2 5 8 0
                int distanceL = getDist(leftLocation, number);
                int distanceR = getDist(rightLocation, number);

                if(distanceL > distanceR) {
                    answer += ("R");
                    rightLocation = number;
                }else if(distanceL < distanceR) {
                    answer += ("L");
                    leftLocation = number;
                }else {
                    if(hand.equals("right")) {
                        answer += ("R");
                        rightLocation = number;
                    }else {
                        answer += ("L");
                        leftLocation = number;
                    }
                }

            }
        }
        return answer;
    }

    public static int getDist(int location, int number) {
        if(number == 0) {
            number = 11;
        }

        if(location == 0) {
            location = 11;
        }

        int locationX = (location-1) / 3;
        int locationY = (location-1) % 3;

        int numberX = (number-1) / 3;
        int numberY = (number-1) % 3;

        return Math.abs(locationX-numberX) + Math.abs(locationY - numberY);
    }

    public static void main(String[] args) {

    }
}
