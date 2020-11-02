import java.util.*;

public class LifeBoat {
    public static void main(String[] args) {
    int[] people = {70, 80, 50};
    int limit = 100;
    int a = solution(people, limit);
    
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;

        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }

        return answer;
    }
}



class Boat {
    int peopleWeight;

    Boat(int people, int limit) {
        this.peopleWeight = people;
    }
}


