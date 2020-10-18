public class InvertIntToArray {
    public static void main(String[] args) {
        int[] a = solution(12345);

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] solution(long n) {
        int[] answer = new int[(int)(Math.log10(n)+1)];
        int i = 0;
        int num;

        while(n > 0) {
            answer[i] = (int)(n % 10);
            n = (n / 10);
            i++;
        }
        return answer;
    }
}
