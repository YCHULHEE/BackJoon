public class FindLargestSquare {
    public int solution(int [][]board)
    {
        int row = board.length;
        int col = board[0].length;
        int top = 0;
        int left = 0;
        int topLeft = 0;
        int answer = 0;

        int[][] map = new int[row + 1][col + 1];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map[i + 1][j + 1] = board[i][j];
            }
        }

        for (int i = 1; i <= row; i++) {
            for (int j =1; j <= col; j++) {
                if (map[i][j] != 0) {
                    top = map[i - 1][j];
                    left = map[i][j - 1];
                    topLeft = map[i -1][j -1];

                    map[i][j] = Math.min(Math.min(top, left), topLeft) +1;
                    answer = Math.max(answer, map[i][j]);
                }
            }
        }

        return answer * answer;
    }

    public static void main(String[] args) {

    }
}
