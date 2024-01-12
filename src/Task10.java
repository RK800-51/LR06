import java.util.Arrays;

public class Task10 {
    static int[] maxAndMin(int ... v) {
        int max = Arrays.stream(v).max().getAsInt();
        int min = Arrays.stream(v).min().getAsInt();
        int[] result = new int[2];
        result[0] = max;
        result[1] = min;
        return result;
    }

    public static void main(String[] args) {
        int[] result = maxAndMin(1, 2, 3, 4, 5);
        int max = result[0];
        int min = result[1];
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }

}