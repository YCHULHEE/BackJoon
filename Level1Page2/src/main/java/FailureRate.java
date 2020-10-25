import java.util.*;

public class FailureRate {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] a = solution(N, stages);
    }

    public static int[] solution(int N, int[] stages) {
        int arr[] = new int[N + 2];
        node[] failRate = new node[N + 1];
        Arrays.fill(arr, 0);
        for (int i = 0; i < stages.length; i++) {
            arr[stages[i]]++;
        }
        int total = stages.length;
        failRate[0] = new node(0, -1.0);
        for (int i = 1; i < N + 1; i++) {
            if (total != 0) {
                failRate[i] = new node(i, (double) arr[i] / total);
                total -= arr[i];
            } else {
                failRate[i] = new node(i, 0);
            }
        }
        Comparator<node> f = new Comparator<node>() {
            @Override
            public int compare(node o1, node o2) {
                if (o1.failRate == o2.failRate) {
                    return Integer.compare(o1.idx, o2.idx);
                }
                return -Double.compare(o1.failRate, o2.failRate);
            }
        };
        Arrays.sort(failRate, f);
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = failRate[i].idx;
        }

        return answer;
    }

    static class node {
        int idx;
        double failRate;

        public node(int cnt, double failRate) {
            this.idx = cnt;
            this.failRate = failRate;
        }
    }
}
