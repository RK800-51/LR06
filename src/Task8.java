import java.util.Arrays;

public class Task8 {
    static double avgValue(int[] arr) {
        double avg = Arrays.stream(arr).average().getAsDouble();
        return avg;
    }
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        double result = Task8.avgValue(data);
        System.out.println(result);
    }
}