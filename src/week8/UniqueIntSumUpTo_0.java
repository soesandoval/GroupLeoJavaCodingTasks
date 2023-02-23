package week8;

public class UniqueIntSumUpTo_0 {
    public static void main(String[] args) {
        NSumUpTo0(6);
    }


    public static int[]  NSumUpTo0 (int N){

        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N-1; i++) {
            result[i] = i;
            sum += i;
        }

        result[N-1] = -sum;
        return result;

    }
}
