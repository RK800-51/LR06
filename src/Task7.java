public class Task7 {
    static int[] convert(char[] arr) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = (int) arr[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        char[] data = {'a', 'b', 'c', 'd', 'e', 'x'};
        int[] result = Task7.convert(data);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}