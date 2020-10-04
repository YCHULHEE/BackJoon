import java.util.Scanner;

class Calculate {
    int year;

    int LeapTest(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return 1;
        else
            return 0;
    }
}

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate ly = new Calculate();
        int result;
        int flag = 0;

        while (true) {
            ly.year = sc.nextInt();
            result = ly.LeapTest(ly.year);

            System.out.println(result);
        }
    }
}