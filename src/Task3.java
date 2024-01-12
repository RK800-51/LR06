import java.util.Arrays;
import java.util.stream.IntStream;

public class Task3 {

    static void maxValue(int ... v) {
        IntStream streamFromArr = Arrays.stream(v);
        int max = streamFromArr.max().getAsInt();
        System.out.println("max: " + max);
    }

    static void minValue(int ... v) {
        IntStream streamFromArr = Arrays.stream(v);
        int min = streamFromArr.min().getAsInt();
        System.out.println("min: " + min);
    }

    static void avgValue(int ... v) {
        IntStream streamFromArr = Arrays.stream(v);
        double avg = streamFromArr.average().getAsDouble();
        System.out.println("avg: " + avg);
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 5, 0};
        Task3.maxValue(data);
        Task3.minValue(data);
        Task3.avgValue(data);
    }


}
