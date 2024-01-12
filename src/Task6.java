public class Task6 {
    static int[] meth(int[] arr, int x) {
        int[] result;
        if (x > arr.length) {
            result = arr.clone();
        }
        else {
            result = new int[x];
            for (int i = 0; i < x; i++) {
                result[i] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5};
        int[] result1 = Task6.meth(data, 2);
        int[] result2 = Task6.meth(data, 5);
        for (int i=0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        for (int i=0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

    }
}
