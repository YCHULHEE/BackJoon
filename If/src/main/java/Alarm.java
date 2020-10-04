import java.util.Scanner;

public class Alarm {
    int hour, sec;
    int check = 0;
    Scanner sc = new Scanner(System.in);

    void AlarmCalculate(int sec){
        sec -= 45;
        if(sec < 0) {
            this.hour--;
            this.sec = 60 + sec;
        }
        if(this.hour == -1)
            this.hour += 24;
    }
    void InputHourSec(){
        this.hour = sc.nextInt();
        if(hour < 0 || hour > 23)
            this.check = 1;
        this.sec = sc.nextInt();
        if(sec < 0 || sec > 59)
            this.check = 1;
    }

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        while (true) {
            System.out.println("알람 설정할 시간과 분을 차례대로 적어주시오.");
            alarm.InputHourSec();
            if(alarm.check == 1) {
                System.out.println("시간이 잘못되었습니다.");
                alarm.check = 0;
                continue;
            }
            alarm.AlarmCalculate(alarm.sec);
            System.out.println(alarm.hour + " " + alarm.sec);
        }
    }
}
