import java.util.Scanner;

public class NChopping {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        String answer = "";
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                answer += '수';
            }
            if(i % 2 == 1){
                answer += '박';
            }
        }
        System.out.println(answer);
        }
    }

