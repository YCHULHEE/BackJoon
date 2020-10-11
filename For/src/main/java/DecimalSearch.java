public class DecimalSearch {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            int j = 2;
            int count = 0;
            while(j <= (int)Math.sqrt(i)){
                if(i % j == 0){
                    count += 1;
                    break;
                }
                j += 1;
            }
            if(count == 0) answer += 1;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
