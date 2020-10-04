import java.util.Scanner;

public class Alarm {
    int hour;
    int sec;
    int check = 0;
    static final int MAX_HOUR = 24;
    static final int MAX_SEC = 60;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Alarm alarm = new Alarm();

        int i = MAX_HOUR;

        while (true) {
            System.out.println("알람 설정할 시간과 분을 차례대로 적어주시오.");
            alarm.inputHourSec();
            if (alarm.check == 1) {
                System.out.println("시간이 잘못되었습니다.");
                alarm.check = 0;
                continue;
            }
            alarm.alarmCalculate(alarm.sec);
            System.out.println(alarm.hour + " " + alarm.sec);
        }
    }

    void alarmCalculate(int sec) {
        sec -= 45;
        if (sec < 0) {
            this.hour--;
            this.sec = 60 + sec;
        }
        if (this.hour == -1) {
            this.hour += 24;
        }
    }

    void inputHourSec() {
        this.hour = sc.nextInt();
        if ((hour < 0) || (hour >= MAX_HOUR)) {
            this.check = 1;
        }
        this.sec = sc.nextInt();
        if ((sec < 0) || (sec >= MAX_SEC)) {
            this.check = 1;
        }
    }
}
