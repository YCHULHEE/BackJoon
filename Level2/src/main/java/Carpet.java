public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = (brown + 4) / 2;
        int width = 3;
        int length = (sum - width);

        while(width >= 3 && width >= length) {
            if((width - 2) * (length -2) == yellow) {
                answer[0] = length;
                answer[1] = width;
                break;
            }

            length--; width++;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
